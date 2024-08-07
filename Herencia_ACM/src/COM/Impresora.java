package COM;

public class Impresora {
	
	String marca;
	String modelo;
	int capacidadHojas;
	boolean color;
	public Impresora () {
		
	}
	public Impresora(String marca, String modelo, int capacidadHojas, boolean color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadHojas = capacidadHojas;
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapacidadHojas() {
		return capacidadHojas;
	}
	public void setCapacidadHojas(int capacidadHojas) {
		this.capacidadHojas = capacidadHojas;
	}
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Impresora [marca=" + marca + ", modelo=" + modelo + ", capacidadHojas=" + capacidadHojas + ", color="
				+ color + "]";
	}
	//
	public void imprimir () {
		System.out.println("Imprimiendo...");
	}
	

}
