package com;

public class SmartTV extends Television {

	String sistemaOP;
	String conexionwifi;
	String conexionHDDR;
	boolean resolucion4k;
	
	public SmartTV() {
		
	}

	public SmartTV(String marca, String controlRemoto, double pulgadas, boolean conexionSatelital,
			boolean conexionCoaccial, int precio, String sistemaOP, String conexionwifi, String conexionHDDR,
			boolean resolucion4k) {
		super(marca, controlRemoto, pulgadas, conexionSatelital, conexionCoaccial, precio);
		this.sistemaOP = sistemaOP;
		this.conexionwifi = conexionwifi;
		this.conexionHDDR = conexionHDDR;
		this.resolucion4k = resolucion4k;
	}

	public String getSistemaOP() {
		return sistemaOP;
	}

	public void setSistemaOP(String sistemaOP) {
		this.sistemaOP = sistemaOP;
	}

	public String getConexionwifi() {
		return conexionwifi;
	}

	public void setConexionwifi(String conexionwifi) {
		this.conexionwifi = conexionwifi;
	}

	public String getConexionHDDR() {
		return conexionHDDR;
	}

	public void setConexionHDDR(String conexionHDDR) {
		this.conexionHDDR = conexionHDDR;
	}

	public boolean isResolucion4k() {
		return resolucion4k;
	}

	public void setResolucion4k(boolean resolucion4k) {
		this.resolucion4k = resolucion4k;
	}

	@Override
	public String toString() {
		return "SmartTV [sistemaOP=" + sistemaOP + ", conexionwifi=" + conexionwifi + ", conexionHDDR=" + conexionHDDR
				+ ", resolucion4k=" + resolucion4k + ", marca=" + marca + ", controlRemoto=" + controlRemoto
				+ ", pulgadas=" + pulgadas + ", conexionSatelital=" + conexionSatelital + ", conexionCoaccial="
				+ conexionCoaccial + ", precio=" + precio + "]";
	}
	
	
	
}
