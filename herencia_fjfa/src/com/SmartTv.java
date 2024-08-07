package com;

public class SmartTv extends Television {
	
	String sisOperativo;
	String resolucion;
	String conectividad;
	
	
	public SmartTv() {
		
	}


	public SmartTv(String marca, String modelo, String puertos, int tamaño, int precio, String sisOperativo,
			String resolucion, String conectividad) {
		super(marca, modelo, puertos, tamaño, precio);
		this.sisOperativo = sisOperativo;
		this.resolucion = resolucion;
		this.conectividad = conectividad;
	}


	public String getSisOperativo() {
		return sisOperativo;
	}


	public void setSisOperativo(String sisOperativo) {
		this.sisOperativo = sisOperativo;
	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


	public String getConectividad() {
		return conectividad;
	}


	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}


	@Override
	public String toString() {
		return "SmartTv [sisOperativo=" + sisOperativo + ", resolucion=" + resolucion + ", conectividad=" + conectividad
				+ ", marca=" + marca + ", modelo=" + modelo + ", puertos=" + puertos + ", tamaño=" + tamaño
				+ ", precio=" + precio + "]";
	}
	
	public void apps() {
		System.out.println("Abriendo aplicaciones disponibles...");
	}

}
