package Recopilacion;
import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado=1;
		
		int numero =Integer.parseInt( JOptionPane.showInputDialog("Pon el n�mero para que se realice la factorizaci�n"));
		
		for (int i= numero;i>0;i--) {
			resultado = resultado*i;
		}
		
		int resultado2 = 1;
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Pon tu numero para mostrar su resutado factoreal aqu�:"));
	for (int i2=numero2;i2>0;i2--) {
		resultado2=resultado2 *1;}
		System.out.println("El factoreal de "+ numero2 + " es "+ resultado);
			
		
	}
	
	
	
	}
	
	
	

