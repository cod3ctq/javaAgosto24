package com;

public class Multifuncional extends Impresora {
	
	String conectividad;
	String scanner;
	
	
	public Multifuncional() {}
	public Multifuncional(String marca, String modelo, int capacidadHojas, boolean color, String conectividad,
			String scanner) {
		super(marca, modelo, capacidadHojas, color);
		this.conectividad = conectividad;
		this.scanner = scanner;
	}
	public String getConectividad() {
		return conectividad;
	}
	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}
	public String getScanner() {
		return scanner;
	}
	public void setScanner(String scanner) {
		this.scanner = scanner;
	}
	@Override
	public String toString() {
		return "Multifuncional [conectividad=" + conectividad + ", scanner=" + scanner + ", marca=" + marca
				+ ", modelo=" + modelo + ", capacidadHojas=" + capacidadHojas + ", color=" + color + "]";
	}	
	public void escanear() {
		System.out.println("Escaneando ...");
	}	
	public void sacarCopias(String cantidad, boolean color) {
		System.out.println(cantidad);
		System.out.println(color);
	}	
	public void ampliarImagen(double escala) {
		System.out.println("escala");
	}
	
	
}
