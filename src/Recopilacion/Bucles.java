package Recopilacion;
import javax.swing.*;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Rodolfo";
		String pass= "";
		while (clave.equals(pass)==false) {
			pass = JOptionPane.showInputDialog("Introduce aqu� la contrae�a por favor: ");
			if (clave.equals(pass)==false) {
			System.out.println("La contrase�a es incorrecta.");
			
		}
		
	}
		System.out.print("La clave es correcta, tienes acceso al programa.");
}
}
