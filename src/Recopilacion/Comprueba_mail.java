package Recopilacion;
import javax.swing.*;
import java.util.*;
public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arroba = false;
		
	    String mail  = JOptionPane.showInputDialog("Pon tu e-mail aqu�:");
		/*Scanner entrada = new Scanner (System.in);
		System.out.println("Pon tu e-mail aqu�:");
		String mail2= entrada.nextLine();
		System.out.println(mail2);*/
	    int i = 0;
	    int num= 0;
	    for ( i=0;i<mail.length();i++ ) {
	    	if (mail.charAt(i)=='@') {
	    		num++;
	    		arroba = true;}}
	   
	    i = 0;
	    boolean arroba1 = false;
	    for (i=0;i<mail.length();i++) {
	    	if (mail.charAt(i)=='.') {
	    		arroba1 = true;}
	   
	    		}
	    boolean num2 = false;
	    if (num==1) {
	    	num2= true;
	    }
	    else {
	    	num2 = false;
	    }
	    	
	    
	    if (arroba && arroba1&&num2 == true) {
	    	System.out.println("El e-mail es correcto.");}
	    else {System.out.println("El e-mail es incorrecto. \n Int�ntalo de nuevo.");
	    		
	    	}
	}
	}


