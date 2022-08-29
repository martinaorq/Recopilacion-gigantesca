package Recopilacion;

public class Coche {
 private int ruedas;
private int largo;
private int ancho;
private String motor;
private int peso_plataforma;
private int dia;
private String mes;
private String especial;
private String color;
private boolean asientos_cuero;
private boolean climatizador;
private int peso_total;

public Coche() {

 int peso_total;

	ruedas = 4;
	largo=200;
	ancho=300;
	motor=" ";
	peso_plataforma=300;
	 dia=23;
	mes = "Noviembre";
	especial= "cumplea�os";
	color= "";
	}

public String mis_ruedas(){
	return "la cantidad de ruedas del coche son: "+ ruedas;
}
public String martina() {
	return "Mi nombre es Martina y cumplo el "+dia+ " de "+ mes;
}
public String getespecial() {
	return especial;
}
public void establece_color(String color_Coche){
	color= color_Coche;}
public void elige_motor(String tipo_motor){
	motor=tipo_motor;
}

public String di_info() {
	return "El color del auto es " + color+ " y su motor es "+ motor+",tiene un ancho de "+ancho+"cm, un largo de "+largo+"cm y su plataforma pesa "+peso_plataforma+"kg" ;
}
public void elige_asientos(boolean asientos) {
	asientos_cuero=asientos;
}
public void elige_clima(boolean clima) {
	climatizador=clima;}

public String extras(){
	if (asientos_cuero==true) {
		return "El auto si posee asientos de cuero.";}
		else {
			return "El auto no tiene asientos de cuero.";
		}}
public String extras2() {
	if (climatizador==true) {
		return "El auto tiene climatizador.";}
		else {
		return "El auto no posee climatizador.";}
}
public String peso_coche() {	
	
	peso_total=peso_total+peso_plataforma;
	if(asientos_cuero==true) {
		peso_total=peso_total+50;
	
	}
	if (climatizador==true) {
		peso_total=peso_total+20;
	}
	return "El peso del coche es de "+ peso_total+ "kg.";
}
public int precio_coche() {
	int preciofinal= 10000;
	if (asientos_cuero==true) {
		preciofinal+=2000;
	}
	if (climatizador==true) {
		preciofinal+=1500;
	}
	return preciofinal;
}
}		
	



