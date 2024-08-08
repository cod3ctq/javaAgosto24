package com;

public class Television {
	
	String marca;
	String controlRemoto;
	double pulgadas;
	boolean conexionSatelital;
	boolean conexionCoaccial;
	int precio;
	
	public Television() {
		
	}
	
	public Television(String marca, String controlRemoto, double pulgadas, boolean conexionSatelital,
			boolean conexionCoaccial, int precio) {
		super();
		this.marca = marca;
		this.controlRemoto = controlRemoto;
		this.pulgadas = pulgadas;
		this.conexionSatelital = conexionSatelital;
		this.conexionCoaccial = conexionCoaccial;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getControlRemoto() {
		return controlRemoto;
	}
	public void setControlRemoto(String controlRemoto) {
		this.controlRemoto = controlRemoto;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public boolean isConexionSatelital() {
		return conexionSatelital;
	}
	public void setConexionSatelital(boolean conexionSatelital) {
		this.conexionSatelital = conexionSatelital;
	}
	public boolean isConexionCoaccial() {
		return conexionCoaccial;
	}
	public void setConexionCoaccial(boolean conexionCoaccial) {
		this.conexionCoaccial = conexionCoaccial;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Television [marca=" + marca + ", controlRemoto=" + controlRemoto + ", pulgadas=" + pulgadas
				+ ", conexionSatelital=" + conexionSatelital + ", conexionCoaccial=" + conexionCoaccial + ", precio="
				+ precio + "]";
	}
	
	public void canal() {
		System.out.println("ver canal");
	}

	
	
}
