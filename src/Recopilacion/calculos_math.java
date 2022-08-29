package Recopilacion;

public class calculos_math {

	public static void main(String[] args) {
		
		/* int numero = Math.sqrt(9); no es posible gracias a que Math.sqrt funciona con doubles
		 * no con archives int /
		 */
		
		double numero = Math.sqrt(9);
		
		System.out.print("La ra�z cuadrada de nueve es "+ numero);
				
		
		float num1 = 3.85F;
		
		int resultado = Math.round(num1);
		
		//int resultado = ( int)Math.round(num1); 
		//ES una refundici�n que cambia el tipo de archivo long a int
		
		
		System.out.print("     "+resultado);
		
		double base = 5;
		double exponente = 3;
		int resultado2 =(int)Math.pow(base, exponente);
		
		System.out.print("     "
				+ "EL resultado es:" + resultado2);
				
		
	}

}
