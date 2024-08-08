package com;

public class Iphone {

	//Con static & final creamos CONSTANTES
	public static final String MARCA= "Apple";//static //IGUAL
	protected String modelo; //15, 15pro, 15 pro max, etc
	public String version; //15,16
	public static final String SISTEMA_OPERATIVO= "iOS";//iOS-static IGUAL
	String color; //negro, gris, rosa
	int almacenamiento; //128, 256
	
	public Iphone() {
		
	}

	
	public Iphone(String modelo, String version, String color, int almacenamiento) {
		super();
		this.modelo = modelo;
		this.version = version;
		this.color = color;
		this.almacenamiento = almacenamiento;
	
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	
	@Override
	public String toString() {
		return "Iphone [modelo=" + modelo + ", version=" + version + ", color=" + color + ", almacenamiento="
				+ almacenamiento + "]";
	}


	//Metodo estatico
	public final void instalarApps() {
		System.out.println("Abriendo Appstore");
	}
}
