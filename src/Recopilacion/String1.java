package Recopilacion;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mi_nombre = "Martina";
		String otro_nombre= "Pablo";
		String gemela = "Martina";
		
		//System.out.print("Mi nombre es "+ mi_nombre);
		
		System.out.print("Mi nombre es "+ mi_nombre + " y tiene "+ mi_nombre.length()+ " letras.");
		char primera_letra = mi_nombre.charAt(1);
		System.out.print(primera_letra);
		System.out.print(".La letra que se encuentra en el 5 lugar es: "+ mi_nombre.charAt(5));
	System.out.print("      "+mi_nombre.substring(0, 5));
	System.out.print("    "+mi_nombre.equals(otro_nombre));
	System.out.print("     "+mi_nombre.equals(gemela));
	
	
	}

}
