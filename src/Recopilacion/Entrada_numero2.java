package Recopilacion;
import javax.swing.*;
public class Entrada_numero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numero = JOptionPane.showInputDialog("Decide el n�mero que vas a dividir: ");
		String divisor = JOptionPane.showInputDialog("Escribe el divisor");
		
		double numero2 = Double.parseDouble(numero);
		double divisor2 = Double.parseDouble(divisor);
		
		
		System.out.printf("%1.2f",numero2/divisor2);
		//inteligente, no?
		
		
		
	}

}
