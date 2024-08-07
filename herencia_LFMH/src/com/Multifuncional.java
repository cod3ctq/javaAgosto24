package com;

public class Multifuncional extends Impresora{
	//Herencia: Sirve para especializar los modelos
	String conectividad, 
	escaner;
	
	public Multifuncional() {
		// TODO Auto-generated constructor stub
	}

	public Multifuncional(String conectividad, String escaner) {
		super();
		this.conectividad = conectividad;
		this.escaner = escaner;
	}
	
	public Multifuncional(String marca, String modelo, int capacidadHojas, boolean color, String conectividad,
			String escaner) {
		super(marca, modelo, capacidadHojas, color);
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
				+ ", modelo=" + modelo + ", capacidadHojas=" + capacidadHojas + ", color=" + color + "]";
	}
	
	
	public void escanear(){
		
	}
	
	public void sacarCopias(int cantidad, boolean color, int escala) {
		
	}
	
	public void ampliarImagen(double escala) {
		
	}
	
	
	
}
