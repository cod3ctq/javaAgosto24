package com;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Impresora imp1 = new Impresora();
		Multifuncional ml1 = new Multifuncional();
		
		//Metodo comun para ambos objetos (por que es heredado de padre a hijo)
		imp1.imprimir();
		ml1.imprimir();
		
		ml1.escanear(); //Metodo exclusivo del objeto de la clase hija
		//imp1.ampliarImagen(); //Metodo exclusivo de la clase hija, no alcanzable por el padre
		
		
		
		
		
		
	}

}
