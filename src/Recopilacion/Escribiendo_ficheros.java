/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recopilacion;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class Escribiendo_ficheros {
    public static void main(String[]args) {
        ehcribiendoh e=new ehcribiendoh();
        
        try {
            e.ehcribih();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            
        
    }
}

class ehcribiendoh{
   String textasoh;
   FileWriter escritor; 
   public void ehcribih() throws IOException{
       
       try{
       //Dirección donde vamos a guardar nuestro archivo
        textasoh=JOptionPane.showInputDialog("Escribe la dirección a donde vas a guardar el texto");
        escritor=new FileWriter(new File(textasoh));
        
        //Escribir texto
        String textoaguardar=JOptionPane.showInputDialog("Escribe texto a guardar.");
        escritor.write(textoaguardar);
        
       }catch (IOException e){
           System.out.println("Hubo un error con la dirección");
       }
       
       escritor.close();
        
        
    } 
    }
