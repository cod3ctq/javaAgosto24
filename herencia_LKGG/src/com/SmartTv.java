package com;

public class SmartTv extends Television{

	String conectividad;
	String so;
	String aplicaciones;
	
	public SmartTv(){
		
	}

	public SmartTv(String conectividad, String so, String aplicaciones) {
		super();
		this.conectividad = conectividad;
		this.so = so;
		this.aplicaciones = aplicaciones;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getAplicaciones() {
		return aplicaciones;
	}

	public void setAplicaciones(String aplicaciones) {
		this.aplicaciones = aplicaciones;
	}

	@Override
	public String toString() {
		return "SmartTv [conectividad=" + conectividad + ", so=" + so + ", aplicaciones=" + aplicaciones + ", marca="
				+ marca + ", modelo=" + modelo + ", tamaño=" + tamaño + ", color=" + color + "]";
	}
	
	
	
	
	
	
}
