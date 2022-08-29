package Recopilacion;
import javax.swing.*;
public class entrada_salida2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String usuario = JOptionPane.showInputDialog("Introduce tu nombre: ");
		System.out.print(usuario);
	
	String edad = JOptionPane.showInputDialog("Escribe tu edad: ");
	int edad2 = Integer.parseInt(edad);
	 
	System.out.print("Hola "+ usuario+ " pronto vas a tener "+ (edad2+1)+" a�os.");
	
	
	
	
	
	
	
	
	}	
	

}
