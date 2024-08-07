package com;

public class Smartv extends Television {

	String sisope;
	String conectividad;
	String app;

	public Smartv() {

	}

	public Smartv(String marca, String modelo, String tamaño, String sisope, String conectividad, String app) {
		super(marca, modelo, tamaño);
		this.sisope = sisope;
		this.conectividad = conectividad;
		this.app = app;
	}

	public String getSisope() {
		return sisope;
	}

	public void setSisope(String sisope) {
		this.sisope = sisope;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	@Override
	public String toString() {
		return "Smartv [sisope=" + sisope + ", conectividad=" + conectividad + ", app=" + app + ", marca=" + marca
				+ ", modelo=" + modelo + ", tamaño=" + tamaño + "]";
	}

////////////////////////////////////////////////
//metodos
	public void verStreaming() {

	}

	public void jugarVideojuegos(int cantidad) {

	}

	public void internetDelascosas(double escala) {

	}
}
