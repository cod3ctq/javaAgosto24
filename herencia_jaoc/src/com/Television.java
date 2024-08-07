package com;

public class Television {

	String marca;
	String modelo;
	double tamañoPantalla;
	double resolución;
	boolean controlRemoto;
	
	public Television() {}

	public Television(String marca, String modelo, double tamañoPantalla, double resolución, boolean controlRemoto) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tamañoPantalla = tamañoPantalla;
		this.resolución = resolución;
		this.controlRemoto = controlRemoto;
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
	public double getTamañoPantalla() {
		return tamañoPantalla;
	}
	public void setTamañoPantalla(double tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}
	public double getResolución() {
		return resolución;
	}
	public void setResolución(double resolución) {
		this.resolución = resolución;
	}
	public boolean isControlRemoto() {
		return controlRemoto;
	}
	public void setControlRemoto(boolean controlRemoto) {
		this.controlRemoto = controlRemoto;
	}
	@Override
	public String toString() {
		return "Television [marca=" + marca + ", modelo=" + modelo + ", tamañoPantalla=" + tamañoPantalla
				+ ", resolución=" + resolución + ", controlRemoto=" + controlRemoto + "]";
	}
	
	public void encenderApagar(boolean encender) {
		if (encender == true) {
			System.out.println("Tv Encendida ... " + encender);	
		}else {
			System.out.println("Tv Apagada ... " + encender);
		}
		
	}
	
	
}
