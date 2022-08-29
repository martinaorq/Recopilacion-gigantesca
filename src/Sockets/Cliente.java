

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCliente mimarco=new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		setBounds(600,10,280,380);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		add(milamina);
		
		setVisible(true);
                addWindowListener(new envioonline());
		}	
	
}

class LaminaMarcoCliente extends JPanel implements Runnable{

    public LaminaMarcoCliente(){
            JLabel n_nick=new JLabel("Nick:");
            add(n_nick);
            nick=new JLabel(JOptionPane.showInputDialog("Inserte su nombre de usuario,por favor:"));
            add(nick);
            JLabel texto=new JLabel("   Online:");
            add(texto);
            
            ip=new JComboBox();
            
            add(ip);
            
            campochat=new JTextArea(15,20);
            add(new JScrollPane(campochat));
            
            campo1=new JTextField(20);
            add(campo1);
            
            miboton=new JButton("Enviar");
            evento e=new evento();
            miboton.addActionListener(e);
            add(miboton);
            
            Thread t=new Thread(this);
            t.start();

    }

    public void run() {
        try{
            ServerSocket servidorcliente=new ServerSocket(9090);
            
            paqueteenvio paqueterecibido;
            
            while(true){
                
                Socket cliente=servidorcliente.accept();
                ObjectInputStream entradadatos= new ObjectInputStream(cliente.getInputStream());
                paqueterecibido= (paqueteenvio) entradadatos.readObject();
                
                if(paqueterecibido.getIp()==null){
                //campochat.append("\n"+paqueterecibido.getIps());
                ArrayList <String> ips=new ArrayList<String>();
                ips=paqueterecibido.getIps();
                ip.removeAllItems();
                for(String i:ips){
                    ip.addItem(i);
                }
                
                }
                else{
                campochat.append(paqueterecibido.getNick()+">>> "+paqueterecibido.getMensaje()+"\n");
                }
            }
        }catch(Exception e){System.out.println(e.getMessage());}
    }
    
    
    private class evento implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try {
                Socket misocket=new Socket("192.168.1.10",9999);
                
                paqueteenvio paquete=new paqueteenvio();
                paquete.setNick(nick.getText());
                paquete.setIp(ip.getSelectedItem().toString());
                paquete.setMensaje(campo1.getText());
                
                ObjectOutputStream paquete_datos=new ObjectOutputStream(misocket.getOutputStream());
                paquete_datos.writeObject(paquete);
                
                campochat.append(paquete.getNick()+">>> "+paquete.getMensaje()+"\n");
                
                misocket.close();
            } catch (IOException ex) {System.out.println(ex.getMessage());}
        }
    
    }
	
	
	
		
		
private JTextArea campochat;	
private JTextField campo1;
private JComboBox ip;
private JLabel nick;
private JButton miboton;
	
}
class envioonline extends WindowAdapter{
    public void windowOpened(WindowEvent e){
        try{
            Socket misocket=new Socket("192.168.1.10",9999);
            paqueteenvio paquete=new paqueteenvio();
            paquete.setMensaje(" online");
            ObjectOutputStream salida=new ObjectOutputStream(misocket.getOutputStream());
            salida.writeObject(paquete);
            misocket.close();
        }catch(Exception ex){ex.getMessage();}
        
    }}
class paqueteenvio implements Serializable{
    private String nick,ip,mensaje;
    private ArrayList <String> ips;
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<String> getIps() {
        return ips;
    }

    public void setIps(ArrayList<String> ips) {
        this.ips = ips;
    }
    
}