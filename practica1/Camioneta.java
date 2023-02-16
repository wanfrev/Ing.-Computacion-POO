package practica1;

public class Camioneta{
	private String marca;
	private String modelo;
	private String transmision;
	private double motor;
	private int km;
	private float largo;
	private boolean cajon, remolque;
	private String color;

	public Camioneta() {
		marca = "Ford";
		modelo = "F-250 Super Duty";
		transmision = "4x4";
		motor = 6.7;
		km = 20000;
		largo = 227;
	}
	
	public String mostrarDatosCamioneta() {
		return "La camioneta es de marca "+marca+", modelo "+modelo+", con transmision: "+transmision+" y cuenta con un motor"+motor+" con un kilometraje de "+km+" y ademas tiene un largo de "+largo+" pulgadas";
	}
	
	public void establecerColor(String colorCamioneta) {
		color = colorCamioneta;
	}
	
	public String mostrarColor() {
		return "El color de la camioneta es "+color;
	}
	
	public void configurarCajon(String cajon) {
		if(cajon.equalsIgnoreCase("si")) {
			this.cajon = true;
		}else {
			this.cajon = false;
		}
	}
	
	public String tieneCajon() {
		if(cajon == true) {
			return "La camioneta tiene cajon";
		}else {
			return "La camioneta no tiene cajon";
		}
	}
	
	public void configurarRemolque(String remolque) {
		if(remolque.equalsIgnoreCase("si")) {
			this.remolque = true;
		}else {
			this.remolque = false;
		}
	}
	
	public String tieneRemolque() {
		if(remolque == true) {
			return "La camioneta tiene remolque";
		}else {
			return "La camioneta no tiene remolque";
		}
	}
	
	public int precioCamioneta() {
		int precioCamioneta = 70000;
		
		if(cajon) {
			precioCamioneta += 5000;
		}else if(remolque) {
			precioCamioneta += 3000;
		}
		
		return precioCamioneta;
	}
}