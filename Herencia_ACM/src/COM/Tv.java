package COM;

public class Tv {
	String tamaño;
	String precio;
	String marca;
	String tazaRefresco; //60Hz, 120Hz, 240Hz
	String panel; //LED/LCD,OLED,QLED
	String resolucion;
	String perifericosBasicos; //HDMI,USB,Entrada de antena/cable
	String calidadSonido; 
	
	public Tv () {}

	public Tv(String tamaño, String precio, String marca, String tazaRefresco, String panel, String resolucion,
			String perifericosBasicos, String calidadSonido) {
		super();
		this.tamaño = tamaño;
		this.precio = precio;
		this.marca = marca;
		this.tazaRefresco = tazaRefresco;
		this.panel = panel;
		this.resolucion = resolucion;
		this.perifericosBasicos = perifericosBasicos;
		this.calidadSonido = calidadSonido;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTazaRefresco() {
		return tazaRefresco;
	}

	public void setTazaRefresco(String tazaRefresco) {
		this.tazaRefresco = tazaRefresco;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getPerifericosBasicos() {
		return perifericosBasicos;
	}
	public void setPerifericosBasicos(String perifericosBasicos) {
		this.perifericosBasicos = perifericosBasicos;
	}
	public String getCalidadSonido() {
		return calidadSonido;
	}
	public void setCalidadSonido(String calidadSonido) {
		this.calidadSonido = calidadSonido;
	}
	@Override
	public String toString() {
		return "Tv [tamaño=" + tamaño + ", precio=" + precio + ", marca=" + marca + ", tazaRefresco=" + tazaRefresco
				+ ", panel=" + panel + ", resolucion=" + resolucion + ", perifericosBasicos=" + perifericosBasicos
				+ ", calidadSonido=" + calidadSonido + "]";
	}

	
}
