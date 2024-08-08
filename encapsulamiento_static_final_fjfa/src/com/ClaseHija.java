package com;

public class ClaseHija extends Iphone {
	
	public ClaseHija() {
	
	}
	
	
	//Sobreescritura
	@Override
	public void intalarApps() {
		System.out.println("Abriendo playstore");
		System.out.println("Comandos");
	}
	

}
