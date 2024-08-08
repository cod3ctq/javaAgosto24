package com;

public class Television {
	
	
	String marca;
	String modelo;
	String puertos;
	int tamaño;
	int precio;
	
	public Television() {
		
	}

	public Television(String marca, String modelo, String puertos, int tamaño, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.puertos = puertos;
		this.tamaño = tamaño;
		this.precio = precio;
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

	public String getPuertos() {
		return puertos;
	}

	public void setPuertos(String puertos) {
		this.puertos = puertos;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Television [marca=" + marca + ", modelo=" + modelo + ", puertos=" + puertos + ", tamaño=" + tamaño
				+ ", precio=" + precio + "]";
	}
	
	public void transmitir() {
		System.out.println("Obteniendo señal...");
	}


}
