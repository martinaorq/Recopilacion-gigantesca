

import javax.swing.*;
import java.net.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor  {

    public static void main(String[] args) {
        MarcoServidor mimarco=new MarcoServidor();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }	
}

class MarcoServidor extends JFrame implements Runnable{
	
    public MarcoServidor(){

        setBounds(1200,300,280,350);				
        JPanel milamina= new JPanel();
        milamina.setLayout(new BorderLayout());
        areatexto=new JTextArea();
        milamina.add(areatexto,BorderLayout.CENTER);
        add(milamina);
        setVisible(true);
        
        Thread t=new Thread(this);
        t.start();
        }
	
	private	JTextArea areatexto;

    
    public void run() {
        try {
            ServerSocket servidor=new ServerSocket(9999);
            String nick, ip,mensaje;
            paqueteenvio paqueterecibido;
            ArrayList <String> ips=new ArrayList<String>();
            
            while(true){
            Socket socket=servidor.accept();
            
            ObjectInputStream entrada=new ObjectInputStream(socket.getInputStream());
            paqueterecibido=(paqueteenvio) entrada.readObject();
            
            nick=paqueterecibido.getNick();
            ip=paqueterecibido.getIp();
            mensaje=paqueterecibido.getMensaje();
            
            if(!mensaje.equals(" online")){
            areatexto.append("("+ip+")"+nick+">>> "+mensaje+"\n");
            
            Socket socketenvios=new Socket(ip,9090);
            ObjectOutputStream salidaenvios=new ObjectOutputStream(socketenvios.getOutputStream());
            salidaenvios.writeObject(paqueterecibido);
            
            socketenvios.close();
            socket.close();
            }else{
            System.out.println("Online: "+socket.getInetAddress().getHostAddress());    
            ips.add(socket.getInetAddress().getHostAddress());
            paqueterecibido.setIps(ips);
            
            for(String g: ips){
                System.out.println(g);
                
                Socket socketenvios=new Socket(g,9090);
                ObjectOutputStream salidaenvios=new ObjectOutputStream(socketenvios.getOutputStream());
                salidaenvios.writeObject(paqueterecibido);
            
                socketenvios.close();
                socket.close();
            }
            }
            }
            
        } catch (IOException ex) {System.out.println(ex.getMessage());} catch (ClassNotFoundException ex) {
            ex.getMessage();
        }
    }
}
