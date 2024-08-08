package COM;

public class Iphone {
	
	// con static && final creamos COSNTANTES
	
	public static final String MARCA = "Apple";
	public static final String SISTEMA_OPERATIVO = "iOS";//iOS
	//el final actua en 3 niveles
	//el nivel 1 de atrubbuto crea cosntantes
	//el nivel 2 de metodo ipide la sobre escritura
	//el nivel 3 es a nivel clase bloquea la herencia
	
	protected String modelo; //15,15rpo, 15 promax, etc
	public String version; //15,16
	int alamacenamiento; //128,256
	String color;//negro,gris,rosa
	
public Iphone() {}

public Iphone(String modelo, String version, int alamacenamiento, String color) {
	super();
	this.modelo = modelo;
	this.version = version;
	this.alamacenamiento = alamacenamiento;
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

public int getAlamacenamiento() {
	return alamacenamiento;
}

public void setAlamacenamiento(int alamacenamiento) {
	this.alamacenamiento = alamacenamiento;
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

public static String getSistemaOperativo() {
	return SISTEMA_OPERATIVO;
}

@Override
public String toString() {
	return "Iphone [modelo=" + modelo + ", version=" + version + ", alamacenamiento=" + alamacenamiento + ", color="
			+ color + "]";
}

public void instalarApps() {
	System.out.println("Abriendo Appstore");
}

}
