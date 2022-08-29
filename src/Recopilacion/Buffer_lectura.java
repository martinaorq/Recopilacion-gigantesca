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
public class Buffer_lectura {
    static FileReader lector;
    String linea;
    public static void main(String []args) throws FileNotFoundException, IOException{
        
        try{ 
            
        String fichero=JOptionPane.showInputDialog("Inserta directorio a leer aquí:");
        lector=new FileReader(new File(fichero));
        
        BufferedReader buffer=new BufferedReader(lector);
        
        String linea="";
        
        while((linea=buffer.readLine()) != null){
            
            System.out.println(linea);
            
        }
        
        }catch(FileNotFoundException e){
            
            System.out.println("No se ha encontrado el archivo a leer");
        }finally{
            lector.close();
            
        }
        
        
    }
}
