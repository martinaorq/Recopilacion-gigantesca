package Recopilacion;

import java.util.*;

public class Salida_entrada1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
	    System.out.print("Escribe aqu� tu nombre, por favor: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Introduce tu edad ahora: ");
		int edad= entrada.nextInt();
		
		System.out.print(nombre +", el a�o que viene vas a tener "+(edad+1));
	}

}
