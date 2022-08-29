package Recopilacion;
import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("A qu� figura le deseas calcular el area? ");
		System.out.println("1: Cuadrado \n2: Rect�ngulo \n3: C�rculo \n4: Tri�ngulo ");
		int modo = entrada.nextInt();
		switch(modo) {
		
		case 1:
			
		int lados = Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide sus lados?"));
		System.out.println("El area del cudrado es: "+ Math.pow(lados, 2));
		break;
		
	
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide su base (a)?"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide su altura (b)?"));
			System.out.println("El area del rect�gulo es: "+ base*altura);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide sus base (a)?"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide sus altura (b)?"));
		 	System.out.print("EL area del tri�ngulo es: "+(base*altura)/2);
			break;
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del c�rculo:"));
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
		default: 
			System.out.println("La opci�n no es correcta.");
			break;
		}
}
}
