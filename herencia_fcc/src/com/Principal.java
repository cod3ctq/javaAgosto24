package com;

public class Principal {

	public static void main(String[] args) {
		
		//herencia tiene 2 partes
		//
		
		
		
		
		Impresora imp1 = new Impresora();
		Multifuncional ml1 = new Multifuncional();
		
		
		//Metodo comun para ambos objetos
		// porque es heredado de padre e hijo 
		imp1.imprimir();
		ml1.imprimir();
		
		
		// metodo exclusivo del objeto de la clase hija 
		ml1.escanear();
		
		
		//System.out.println(imp1);
		
		
		
		
	}
	
}
