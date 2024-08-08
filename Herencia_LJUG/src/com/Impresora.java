package com;

public class Impresora {

	
		String marca;
		String modelo;
		int capacidad;
		boolean color;
		
		public Impresora () {
			
		}
		
		
		public Impresora(String marca, String modelo, int capacidad, boolean color) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.capacidad = capacidad;
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


		public int getCapacidad() {
			return capacidad;
		}


		public void setCapacidad(int capacidad) {
			this.capacidad = capacidad;
		}


		public boolean isColor() {
			return color;
		}


		public void setColor(boolean color) {
			this.color = color;
		}


		@Override
		public String toString() {
			return "Impresora [marca=" + marca + ", modelo=" + modelo + ", Capacidad=" + capacidad + ", color=" + color
					+ "]";
		}
		
		public void imprimir() {
			System.out.println("Imprimiendo...");
		}
		
		
		
}
