package Recopilacion;
import javax.swing.*;
import java.util.*;
public class Tu_peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero="";
		int resta=0;
		String respuesta= "";
		Scanner entrada =new Scanner(System.in);
		 JOptionPane.showMessageDialog(null, "Bienvenido a calcular tu peso ideal! \n Por favor, ten en cuenta que este probablemente no sea tu peso ideal! Para saber tu peso ideal \n es necesario fijarse en varias caracter�sticas de tu cuerpo, as� que no tema! \n Tu peso puede estar completamente bien!");
	do {	
		do {
			genero= JOptionPane.showInputDialog("Eres hombre o mujer?");
			if (genero.equalsIgnoreCase("mujer")) {
				resta = 120;}
			else if (genero.equalsIgnoreCase("hombre")) {
				resta = 110;
				
			
		}
	//}while (genero.equalsIgnoreCase("hombre")==false && genero.equalsIgnoreCase("mujer")==false);
		
		int estatura = Integer.parseInt(JOptionPane.showInputDialog("Pon tu estatura aqu� como centimetros: "));
				
			if (genero.equalsIgnoreCase("mujer")) {
				System.out.println("Tu peso ideal es de "+(estatura-resta)+ "kg");}
			else if (genero.equalsIgnoreCase("hombre")) {	
				System.out.println("Tu peso ideal es de "+ (estatura-resta) +"kg");
				
			}
		
		System.out.print("Quieres calcular otro peso?");
		
		respuesta =entrada.nextLine();
	
			if (respuesta.equalsIgnoreCase("si")) {
				genero = "pollo";
			}
			else if (respuesta.equalsIgnoreCase("No")) {
				System.out.print("Gracias por utilizar el programa!");
			}
		
	}while (genero.equalsIgnoreCase("hombre")==false && genero.equalsIgnoreCase("mujer")==false);
			
	}while (respuesta.equalsIgnoreCase("si"));
}
}