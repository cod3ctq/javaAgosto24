package COM;

public class SmartTv extends Tv {
	
	String sistemaOperativo;
	String perifericosAvanzados; //wi-fi,Ethernet, Bluetooth
	String aplicacionesyServicios; //Netflix,amazon,spotife
	String asistenteVirtual; //IA,Asistente por voz
	Procesador procesador;
	
	public SmartTv () {}

	public SmartTv(String tamaño, String precio, String marca, String tazaRefresco, String panel, String resolucion,
			String perifericosBasicos, String calidadSonido, String sistemaOperativo, String perifericosAvanzados,
			String aplicacionesyServicios, String asistenteVirtual) {
		super(tamaño, precio, marca, tazaRefresco, panel, resolucion, perifericosBasicos, calidadSonido);
		this.sistemaOperativo = sistemaOperativo;
		this.perifericosAvanzados = perifericosAvanzados;
		this.aplicacionesyServicios = aplicacionesyServicios;
		this.asistenteVirtual = asistenteVirtual;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getPerifericosAvanzados() {
		return perifericosAvanzados;
	}

	public void setPerifericosAvanzados(String perifericosAvanzados) {
		this.perifericosAvanzados = perifericosAvanzados;
	}

	public String getAplicacionesyServicios() {
		return aplicacionesyServicios;
	}

	public void setAplicacionesyServicios(String aplicacionesyServicios) {
		this.aplicacionesyServicios = aplicacionesyServicios;
	}

	public String getAsistenteVirtual() {
		return asistenteVirtual;
	}

	public void setAsistenteVirtual(String asistenteVirtual) {
		this.asistenteVirtual = asistenteVirtual;
	}

	@Override
	public String toString() {
		return "SmartTv [sistemaOperativo=" + sistemaOperativo + ", perifericosAvanzados=" + perifericosAvanzados
				+ ", aplicacionesyServicios=" + aplicacionesyServicios + ", asistenteVirtual=" + asistenteVirtual
				+ ", tamaño=" + tamaño + ", precio=" + precio + ", marca=" + marca + ", tazaRefresco=" + tazaRefresco
				+ ", panel=" + panel + ", resolucion=" + resolucion + ", perifericosBasicos=" + perifericosBasicos
				+ ", calidadSonido=" + calidadSonido + "]";
	}


}
