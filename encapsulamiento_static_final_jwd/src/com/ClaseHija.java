package com;

public class ClaseHija extends Iphone {

	
	public ClaseHija() {
		
	}
	
	//sobre escritura - redefinicion
	//@override bloqueo por final
	
	@override
	public void instalarApps(){
		System.out.println("Abriendo appstore");
	}
	
}
