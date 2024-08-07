package com;

public class Television {
 
	String marca;
	String modelo;
	double tamaño;
	boolean color;
	double precio;
	
	public Television() {
		
	}

	public Television(String marca, String modelo, double tamaño, boolean color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tamaño = tamaño;
		this.color = color;
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

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Television [marca=" + marca + ", modelo=" + modelo + ", tamaño=" + tamaño + ", color=" + color + "]";
	}
	
	

}
