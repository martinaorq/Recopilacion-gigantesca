package Recopilacion;
import javax.swing.*;
public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche auto= new Coche();
		
		System.out.println(auto.martina()+ " ,como regalo para "+ auto.getespecial() + " me regalaron un coche, y ");
		System.out.print(auto.mis_ruedas());

		auto.establece_color(JOptionPane.showInputDialog("Introduce color del coche:"));
		
		auto.elige_asientos(true);
		
		auto.elige_clima(false);
		
		auto.elige_motor(JOptionPane.showInputDialog("Elige motor:"));
		
		System.out.println( "\n"+auto.di_info());
		System.out.println (auto.extras()+ auto.extras2());	
		System.out.println("El precio del coche es: "+auto.precio_coche()+ "\n"+"El peso del coche es: "+ auto.peso_coche());
	}

}
