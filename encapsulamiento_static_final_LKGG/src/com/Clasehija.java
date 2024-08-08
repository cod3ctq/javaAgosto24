package com;

public class Clasehija extends Iphone{

	public Clasehija() {
		
	}
	
	//Sobreescitura
	@Override
	public void instalarApps() {
		System.out.println("Abrir PlayStore...");
		System.out.println("Comandos");
	}
}
