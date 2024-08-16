package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Iphone ip1 = new Iphone();
		
		//acceso directo a un atributo de una clase
		//forma incorrecta 
		ip1.modelo = "XR";
		ip1.version = "15.1";
	//	ip1.marca = "Apple";
		
		//Siempre se deben asignar los valores 
		//a traves de los setters
		ip1.setModelo("");
		ip1.setVersion("");
		
		Iphone i2 = new Iphone("XR", "10", 128, "Blanco");
		Iphone i3 = new Iphone("11", "10.3", 256, "Negro");
		Iphone i4 = new Iphone("12 Pro", "12.1", 128, "Gris");
		Iphone i5 = new Iphone("13", "12.5", 512, "Azul celeste");
		Iphone i6 = new Iphone("14 Pro Max", "15.2", 256, "Blanco");
		
		
		//Todos los objetos imprimen el mismo valor
		//dado por la clase
		System.out.println(i2.getSistemaOperativo());
		System.out.println(i3.getSistemaOperativo());
		System.out.println(i4.getSistemaOperativo());
		
		//Cambio de un valor apuntando a la clase
		//y por consecuencia, todas las instancias
		//sufren el cambio
		//Iphone.SISTEMA_OPERATIVO = "Linux";
		
		System.out.println(i5.getSistemaOperativo());
		System.out.println(i6.getSistemaOperativo());
		
		System.out.println(i2.getColor());
		System.out.println(i3.getColor());
		System.out.println(i4.getColor());
		System.out.println(i5.getColor());
		System.out.println(i6.getColor());
		
		//Accediendo a un metodo en una forma estatica
		//(sin crear una instancia)
		//Iphone.intalarApps();
		
	}
	
}
