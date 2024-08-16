package com;

public class Principal {

	public static void main(String[] args) {
		
		Iphone ip1 = new Iphone();
		
		//acceso directo a un atributo de una clase
		//Forma incorrecta;
		ip1.modelo ="XR";
		ip1.version = "15.1";
		//ip1.marca = "Apple";
		
		//Siempre se deben asignar valores a un atributo
		//atraves de los setters
		ip1.setModelo("");
		ip1.setVersion("");
		
		Iphone i2 = new Iphone("XR", "10", 128, "Blanco");
		Iphone i3 = new Iphone("11", "10.3", 256, "Negro");
		Iphone i4 = new Iphone("12 pro", "12.1", 128, "Gris");
		Iphone i5 = new Iphone("13", "12.5", 512, "Azul Celeste");
		Iphone i6 = new Iphone("14 pro max", "15.2", 256, "Blanco");

		//Todos los objetos imprimen el mismo valor 
		//dado por la clase
		System.out.println(i2.getSistemaOperativo());
		System.out.println(i3.getSistemaOperativo());
		System.out.println(i4.getSistemaOperativo());
		
		//Camio de un valor apuntandoa la clase
		//y por consecuencia, todas las instancias 
		//sufren el cambio
		
		System.out.println(i5.getSistemaOperativo());
		System.out.println(i6.getSistemaOperativo
				());
		
		//Accediendo a un metodo en una forma estatica
		//Sin crear una instancia
		Iphone.instalarApps();
		
		
	}
}
