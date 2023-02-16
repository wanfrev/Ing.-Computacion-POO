package practica1;

public class Moto {
	private String marca;
	private String modelo;
	private String motor;
	private int ruedas;
	private int km;
	private String color;
	private boolean portaCascos;
	
	
	public Moto() {
		marca = "Honda";
		modelo = "CBR-600";
		motor = "4 cilindros, 16 valvulas";
		ruedas = 4;
		km = 3000;
	}
	
	public String mostrarDatosMoto() {
		return "La moto es marca "+marca+" modelo "+modelo+" cuenta con un potente motor "+motor+" ademas de apenas "+km+"km";
	}
	
	public void establecerColor(String colorMoto) {
		color = colorMoto;
	}
	
	public String mostrarColor() {
		return "El color de la moto es "+color;
	}
	
	public void configurarPortaCasco(String portaCasco) {
		if(portaCasco.equalsIgnoreCase("si")) {
			this.portaCascos = true;
		}else {
			this.portaCascos = false;
		}
	}
	
	public String mostrarPortaCasco() {
		if(portaCascos == true) {
			return "La moto cuenta con porta casco";
		}else {
			return "La moto no cuenta con porta casco";
		}
	}
	
	public int precioMoto() {
		int precioMoto = 20000;
		
		if(portaCascos) {
			precioMoto += 1000;
		}
		
		return precioMoto;
	}
	
}
