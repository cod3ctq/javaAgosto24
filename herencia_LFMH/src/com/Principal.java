package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impresora imp1 = new Impresora();
		imp1.imprimir();
		Multifuncional ml1 = new Multifuncional();
		
		
		//Metodos comunes para ambos objetos
		imp1.imprimir();
		ml1.imprimir();
		
		ml1.escanear(); // Metodo exclusivo del objeto de la clase hija
		//imp1.ampliarImagen(); //Metodo exclusivo de la clase hija, no alcanzable por el 
		
		
		
		
		
	}
}
