package Recopilacion;
import javax.swing.*;
public class Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paises[]= new String [8];
		/*for (int i= 0;i<paises.length;i++) {
					paises[i]=JOptionPane.showInputDialog("Pon el pa�s n� "+(i+1)+ " aqu�:");
}
		for (String pais2 : paises) {
		System.out.println("Pa�s: "+ pais2);*/
		
		int numeros[]=new int [10];
		for (int i=0;i<numeros.length;i++) {
			int random= (int)(Math.random()*10+-1);
			numeros[i]= random;
		}
		for (int numeros2:numeros) {
			System.out.println(numeros2);
		}
		}
		}
		
	


