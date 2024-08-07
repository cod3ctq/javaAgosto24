package com;

public class Principal {

			public static void main(String[] args) {
				
				Impresora imp1 = new Impresora();
				Multifuncional ml1 = new Multifuncional();
				
				//metodos comunes entre las clases hija y padre(subclase y super clase)
				imp1.imprimir();
				ml1.imprimir();
				
				ml1.escanear();//metodo exclusivo de la clase hija(subclase)
				
				
			}
	
}
