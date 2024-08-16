package com;

public class ClaseHija extends Iphone{

	public ClaseHija () {
		
	}
	
	//sobreescritura
	@Override
	public void istalarApps() {
		System.out.println("abriendo appstore");
	}

}
