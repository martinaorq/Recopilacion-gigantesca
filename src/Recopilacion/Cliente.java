/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recopilacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.net.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marti
 */
public class Cliente {
    
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		mimarco.add(milamina);
		
		milamina.ejecutarcliente();

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
           
            
            
		setBounds(600,300,280,350);
		setVisible(true);
                
		
		}	
	
}

class LaminaMarcoCliente extends JPanel{
private JButton botonterminar;
private JTextField campo1,nick,ip;
private JTextArea areat;
private paquete p;
private ObjectInputStream entrada;
private ObjectOutputStream salida;
private Socket conexion;
private String mensaje,host;       

	public LaminaMarcoCliente(){
                
                
                nick=new JTextField("Nick",7);
                ip=new JTextField("192.168.1.9",7);
		JLabel texto=new JLabel("CHAT");
                areat=new JTextArea(12,22);
                botonterminar=new JButton("Cerrar conexión");
                
                
                add(nick);
		add(texto);
                add(ip);
                add(areat);
                
		campo1=new JTextField(20);
                campo1.setEditable(false);
                campo1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        enviardatos(e.getActionCommand());
                        campo1.setText("");
                    }
                });
                
                
	
		add(campo1);	
                add(botonterminar);
                
               host="192.168.1.9";
               
                
	}
        

private void enviardatos(final String m){
            try {
                p=new paquete(nick.getText(),campo1.getText(),ip.getText());

                salida.writeObject(p);
                salida.flush();
            } catch (IOException ex) {
                mostrarmensaje("Tipo de mensaje desconocido");
                
            }
}


private void mostrarmensaje(final String mensaje){
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            areat.append(mensaje+ "\n");
        }
         });
}

private void setJTextFieldEditable(final boolean activado){
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
             campo1.setEditable(activado);
            
        }
    });
}
 

private void conectaralservidor() throws IOException{
  mostrarmensaje("Conectando al servidor...");
  conexion=new Socket(host,9999);
  mostrarmensaje("Conexión realizada.Conectado a: "+conexion.getInetAddress().getHostName());
 
  
}

private void obtenerflujos() throws IOException{
    mostrarmensaje("Obteniendo flujos...");
    salida=new ObjectOutputStream(conexion.getOutputStream());
    salida.flush();
    entrada=new ObjectInputStream(conexion.getInputStream());
   
     mostrarmensaje("Se obtuvieron los flujos.");
    
}
private void procesarlaconexion() throws IOException{
     setJTextFieldEditable(true);
            do{
            try {
                p=(paquete) entrada.readObject();
                mensaje=p.getMensaje();
                String nick=p.getNick();
                
                mostrarmensaje(nick+">>> "+mensaje);
                
            } catch (ClassNotFoundException ex) {
                mostrarmensaje("Tipo de objeto recibido desconocido.");
            }
            }while(!botonterminar.isSelected());
            
    
}

private void terminarlaconexion(){
    mostrarmensaje("Cerrando la conexión...");
    setJTextFieldEditable(false);

    try {
                
        salida.close();
        entrada.close();
        conexion.close();
    } catch (IOException ex) {
        Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
            
           
}
public void ejecutarcliente(){
    
            try {
                conectaralservidor();
                obtenerflujos();
                procesarlaconexion();
               
                
            } catch (IOException ex) {
                mostrarmensaje("Error al ejecutar cliente.");
            }finally{
                terminarlaconexion();
              
            }
    
    
}

}
