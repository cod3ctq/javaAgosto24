package com;

public class Iphone {
	
	/* así se crea una constante con static y final
	 * static haciendo referencia al atributo de la clase
	 * y final para que una vez declarado no se pueda cambiar (inmutabilidad).
	 */
	public static final String MARCA = "Apple";
	public static final String OS = "iOs";
	
	String modelo;
	String version;	
	int almacenamiento;
	String color;
	
	public Iphone () {}
	
	public Iphone(String modelo, String version, int almacenamiento, String color) {
		super();
		this.modelo = modelo;
		this.version = version;
		this.almacenamiento = almacenamiento;
		this.color = color;
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
	public static String getMarca() {
		return MARCA;
	}
	public static String getOs() {
		return OS;
	}

	@Override
	public String toString() {
		return "Iphone [modelo=" + modelo + ", version=" + version + ", almacenamiento=" + almacenamiento + ", color="
				+ color + "]";
	}
	
	
	

	
}
