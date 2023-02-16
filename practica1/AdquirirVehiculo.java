package practica1;

public class AdquirirVehiculo {
	public static void main(String[] Args) {
		Camioneta miCamioneta = new Camioneta();
		Moto miMoto = new Moto();
		
		miCamioneta.establecerColor("Roja");
		miCamioneta.configurarCajon("si");
		miCamioneta.configurarRemolque("no");
		
		System.out.println(miCamioneta.mostrarDatosCamioneta() + ", " + miCamioneta.tieneCajon() + ", " + miCamioneta.tieneRemolque() + ", " + miCamioneta.mostrarColor() + ", el precio de la camioneta es de " + miCamioneta.precioCamioneta());
		
		
		miMoto.establecerColor("Negro");
		miMoto.configurarPortaCasco("si");
		System.out.println(miMoto.mostrarDatosMoto() + ", " + miMoto.mostrarColor() + ", " + miMoto.mostrarPortaCasco()+ ", el precio de la moto es de " + miMoto.precioMoto());
	}
}
