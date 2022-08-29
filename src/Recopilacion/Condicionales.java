package Recopilacion;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad_necesaria = 18;
		
		
		String nombre= JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
		String sexo2= JOptionPane.showInputDialog("Eres hombre o mujer? ");
		System.out.println(sexo2);
	if (sexo2.equalsIgnoreCase("mujer")) {
			   sexo2 = "Bienvenida";
			}
	else if (sexo2.equalsIgnoreCase("hombre")) {
	         sexo2= "Bienvenido";
	         }
		else {
				sexo2= "Bienvenido";
			}
		String edad2= JOptionPane.showInputDialog("Introduce tu edad:");
		
		int edad = Integer.parseInt(edad2);
		if (edad > edad_necesaria) {
		System.out.println( sexo2+" " + nombre);
		}
		else {
			System.out.println("No tienes la edad necesaria para entrar aqu�.");
		}
		
	}

}
