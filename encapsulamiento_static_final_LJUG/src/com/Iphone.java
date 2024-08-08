package com;

public class Iphone {

	//Con static y final creamos constantes
	public static final String MARCA = "Apple"; // static
	public static final String SISTEMA_OPERATIVO = "iOS"; // iOS - static
	
	protected String modelo; //15, 15 pro, 15 pro max, etc
	public String version; //15, 16
	int almacenamiento; //128, 256
	String color; //negro, gris, rosa
	
	public Iphone () {
		
	}

	

	public Iphone(String modelo, String version, int almacenamiento, String color) {
		super();
		this.modelo = modelo;
		this.version = version;
		this.almacenamiento = almacenamiento;
		this.color = color;
	}
	
	public static String getMarca() {
		return MARCA;
	}



	public static String getSistemaOperativo() {
		return SISTEMA_OPERATIVO;
	}



	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	@Override
	public String toString() {
		return "Iphone [modelo=" + modelo + ", version=" + version + ", almacenamiento=" + almacenamiento + ", color="
				+ color + "]";
	}



	//Metodo estatico
	public static void instalarApps () {
		System.out.println("Abriendo Appstore...");
	}
	
}

