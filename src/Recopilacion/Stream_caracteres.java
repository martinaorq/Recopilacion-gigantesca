/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recopilacion;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Stream_caracteres {
    static FileReader lector;
    
    public static void main(String []args) throws FileNotFoundException, IOException{
        
        try{ 
            
        String fichero=JOptionPane.showInputDialog("Inserta directorio a leer aquí:");
        lector=new FileReader(new File(fichero));
        
        
        int c=lector.read();
        
        while(c != -1){
            c= lector.read();
            char letra=(char)c;
            System.out.print(letra);
        }
        
        }catch(FileNotFoundException e){
            
            System.out.println("No se ha encontrado el archivo a leer");
        }finally{
            lector.close();
            
        }
        
        
    }
}
