package Recopilacion;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado docente1=new Empleado("Mariano",27000,1990,12,2017);
		Empleado docente2=new Empleado("Quiroga",40000,1970,10,2016);
		Empleado docente3=new Empleado("Zamira",19000,1990,11,2019);
		
		docente1.subesueldo(5);
		docente2.subesueldo(5);
		docente3.subesueldo(5);
		
		System.out.println("Nombre: "+docente1.damenombre()+" Sueldo: "+docente1.damesueldo()+
				" Fecha contrato: "+ docente1.dimefecha());
		System.out.println("Nombre: "+docente2.damenombre()+" Sueldo: "+docente2.damesueldo()+
				" Fecha contrato: "+ docente2.dimefecha());
		System.out.println("Nombre: "+docente3.damenombre()+" Sueldo: "+docente3.damesueldo()+
				" Fecha contrato: "+ docente3.dimefecha());*/
		Empleado docentes[]=new Empleado[3];
		docentes[0]=new Empleado("Mariano",27000,1990,12,2017);
		docentes[1]= new Empleado ("Quiroga",40000,1970,10,2016);
		docentes[2]=new Empleado("Zamira",19000,1990,11,2019);
		
		for (int i=0;i<3;i++) {
			System.out.println("Nombre de empleado: "+ docentes[i].damenombre()+ " /Sueldo: "+docentes[i].damesueldo()+" /Fecha Alta: "+docentes[i].dimefecha() );
		}
}}
class Empleado{
	public Empleado(String nom,double sue,int ano,int mes, int dia) {
		nombre= nom;
		sueldo= sue;
		GregorianCalendar calendario=new GregorianCalendar(dia,mes-1,ano);
		contrato= calendario.getTime();
	}
	public String damenombre() {
		return nombre;
	}
	public double damesueldo() {
		return sueldo;
	}
	public Date dimefecha() {
		return contrato;
	}
	public void subesueldo (double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+= aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date contrato;
	
}