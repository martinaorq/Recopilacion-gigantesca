package Recopilacion;
import java.util.*;
public class Entrada_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Elige la base: ");
		int base= entrada.nextInt();
		
		System.out.print("Elige un exponente: ");
		int exponente= entrada.nextInt();
		
		int resultado= (int)Math.pow(base, exponente);
		System.out.print(resultado);
		
		
		
		
	}

}
