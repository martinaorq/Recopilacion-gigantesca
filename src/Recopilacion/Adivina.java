package Recopilacion;
import java.util.*;
public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int random = (int)(Math.random()*100);
//System.out.print(random);
int numero = 0;
int intentos = 0; 

Scanner entrada= new Scanner(System.in);

while (numero != random) {
	System.out.println("Propone un n�mero del 1 al 100: ");
	numero = entrada.nextInt();
	if (numero < random) {
		System.out.println("El n�mero es mayor.");
	}
	else if (numero > random) {
		System.out.println("El n�mero es menor.");
	}
	intentos++;

	
	
}
		
System.out.print("Ganaste su coraz�n! el n�mero es correcto.\n N�mero de intentos: "+ intentos );

	}

}
