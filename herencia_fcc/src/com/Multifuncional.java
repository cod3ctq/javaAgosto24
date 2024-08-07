package com;

public class Multifuncional extends Impresora{

	//sirve para la especializacion de modelos
	
	String conectividad;
	String escanear;
	
	
	public Multifuncional() {
		
	}


	public Multifuncional(String marca, String modelo, int capacidadHojas, boolean color, String conectividad,
			String escanear) {
		super(marca, modelo, capacidadHojas, color);
		this.conectividad = conectividad;
		this.escanear = escanear;
	}


	public String getConectividad() {
		return conectividad;
	}


	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}


	public String getEscanear() {
		return escanear;
	}


	public void setEscanear(String escanear) {
		this.escanear = escanear;
	}


	@Override
	public String toString() {
		return "Multifuncional [conectividad=" + conectividad + ", escanear=" + escanear + ", marca=" + marca
				+ ", modelo=" + modelo + ", capacidadHojas=" + capacidadHojas + ", color=" + color + "]";
	}


	////////////////////////////////////////////////
	//metodos
	public void escanear() {
		
	}
	
	public void sacarCopias(int cantidad) {
		
	}
	
	public void ampliarImagen(double escala) {
		
	}
	
	
	
}
