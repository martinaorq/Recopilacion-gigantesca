/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recopilacion;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
/*Para esta clase vamos a crear código que nos permita copiar información (bytes)de una imagen y luego colocar
esta información en una carpeta cualquiera :)
*/

public class Stream_byte {
    public static void main(String[]args){
        abririmagen m=new abririmagen();
        pegarimagen pe=new pegarimagen();
        
        pe.pegarimagen(m.returnarray());
      
        
    } 
          
    }

class abririmagen{
    int arraybytes[];
    FileInputStream fichero;
    int tamanoimagen;
    public abririmagen(){
        try{
            
        fichero=new FileInputStream("C:/Users/Usuario/Pictures/azul.png");
        
        try{
        tamanoimagen=(int)fichero.getChannel().size();
        }catch (IOException E){
            System.out.println("Ha ocurrido un error al copiar tamaño de fichero");
        }
        arraybytes=new int[tamanoimagen];
        
        for (int i=0;i<tamanoimagen;i++){
            try{
            arraybytes[i]=fichero.read();}catch(IOException e){}
            
            
        }
        
        
        
        }catch(FileNotFoundException e){
            System.out.println("No se ha encontrado la imagen");
        }
        try {
            fichero.close();
        } catch (IOException ex) {}
    }
    public int[] returnarray(){
        return arraybytes;
        
     }
    
    }
    

class pegarimagen{
    FileOutputStream ficherocopiar;
    public void pegarimagen(int[] array){
        try{
        ficherocopiar=new FileOutputStream("C:/Users/Usuario/Desktop/bolaazul.jpg");
        
        for (int i=0;i<array.length;i++){
            ficherocopiar.write(array[i]);
            System.out.println(array[i]);
        }
        
        
        
        }catch(IOException e){
            System.out.println("Hubo un error al guardar el archivo");
        }
        
        try {
            ficherocopiar.close();
        } catch (IOException ex) {}
        
    }
}