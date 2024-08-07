package com;

public class Multifuncional extends Impresora {
	// Herencia: sirv e para la especializacion de modelos

	String conectividad;
	String escaner;

	public Multifuncional() {
	}

	public Multifuncional(String marca, String modelo, int capacidad, boolean color, String conectividad,
			String escaner) {
		super(marca, modelo, capacidad, color);
		this.conectividad = conectividad;
		this.escaner = escaner;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	public String getEscaner() {
		return escaner;
	}

	public void setEscaner(String escaner) {
		this.escaner = escaner;
	}

	@Override
	public String toString() {
		return "Multifuncional [conectividad=" + conectividad + ", escaner=" + escaner + ", marca=" + marca
				+ ", modelo=" + modelo + ", Capacidad=" + capacidad + ", color=" + color + "]";
	}
	
	public void escanear() {
		
	}
	
	public void sacarCopias (int cantidad, boolean color, int escala) {
		
		
	}
	
	public void ampliarImagen(double escala) {
		
	}
	
	

}
