package com;

public class Iphone {

/*  definir miembros estaticos de clase
	static&&final se crean constantes es un valor inmutable
	el final actua en 3 niveles
	al primer nivel crea constantes e
	en el segundo a nivel de metdodo impide la sobre escritura
	en el 3 es a nivel de clase la lockea
							  //MARCA
*/
	public static final String MARCA = "Apple";//igual + static
	public String version;//15,16
							 //SISTEMA_OPERATIVO
	public static final String SISTEMA_OPERATIVO = "iOs";//IOS - igual + static
	int almacenamiento;//128,256
	String color;//negro,gris,rosa
	protected String modelo;//15, 15pro,15pro max,etc
	
	public Iphone() {
		
	}
	
	public Iphone(String version, int almacenamiento, String color, String modelo) {
		super();
		this.version = version;
		this.almacenamiento = almacenamiento;
		this.color = color;
		this.modelo = modelo;
	}
	
	public static String getMarca() {
		return MARCA;
	}

	public static String getSistemaOperativo() {
		return SISTEMA_OPERATIVO;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	
	@Override
	public String toString() {
		return "Iphone [version=" + version + ", almacenamiento=" + almacenamiento + ", color=" + color + ", modelo="
				+ modelo + "]";
	}

	//metodo statico
	public void instalarApps(){
		System.out.println("Abriendo appstore");
	}
	
}
