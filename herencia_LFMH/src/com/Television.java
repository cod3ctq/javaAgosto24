package com;

import java.util.Arrays;

public class Television {

	int pulgadas, ppi, lanzamiento, peso;
	double precio;
	int[] resolucion;
	String marca;
	boolean aColor;
	
	
	public Television(int pulgadas, int ppi, int lanzamiento, int peso, int[] resolucion, String marca,
			boolean aColor, double precio) {
		super();
		this.pulgadas = pulgadas;
		this.ppi = ppi;
		this.lanzamiento = lanzamiento;
		this.peso = peso;
		this.resolucion = resolucion;
		this.marca = marca;
		this.aColor = aColor;
		this.precio=precio;
	}
	
	public Television() {
		// TODO Auto-generated constructor stub		
		
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	public int getLanzamiento() {
		return lanzamiento;
	}

	public void setLanzamiento(int lanzamiento) {
		this.lanzamiento = lanzamiento;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int[] getResolucion() {
		return resolucion;
	}

	public void setResolucion(int[] resolucion) {
		this.resolucion = resolucion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isaColor() {
		return aColor;
	}

	public void setaColor(boolean aColor) {
		this.aColor = aColor;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", ppi=" + ppi + ", lanzamiento=" + lanzamiento + ", peso=" + peso
				+ ", precio=" + precio + ", resolucion=" + Arrays.toString(resolucion) + ", marca=" + marca
				+ ", aColor=" + aColor + "]";
	}


	

}
