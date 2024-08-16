package com;

public class Principal {

	public static void main(String[] args) {
		
		Iphone ip1 = new Iphone();
		 
		//acceso directo a un atributo de una clase
		//Forma incorrecta
		ip1.modelo = "XR";
		ip1.version = "15.1";
		
		//Siempre se deben asignar valores a un atributo 
		// a traves de los setters
		ip1.setModelo("");
		ip1.setVersion("");
		
		Iphone i2 = new Iphone("XR", "10","Blanco", 128);
		Iphone i3 = new Iphone("11", "10.3","Negro", 256);
		Iphone i4 = new Iphone("12 Pro", "12.1","Gris",128);
		Iphone i5 = new Iphone("13", "12.5","Azul Celeste",512);
		Iphone i6 = new Iphone("14 Pro Max", "15.2","Blanco", 256);
		
		//Al momento de ejecutarlo van a compartir el mismo ios y marca
		//Todos los objetos imprimen el mismo valor
		//dado por la clase
		System.out.println(i2.getSistemaOperativo());
		System.out.println(i3.getSistemaOperativo());
		System.out.println(i4.getSistemaOperativo());
		
		//Cambio de un valor apuntando a la clase
		//y por consencuencia todas las instancias
		//sufren el cambio
		Iphone.SISTEMA_OPERATIVO = "Linux";
		
		System.out.println(i5.getSistemaOperativo());
		System.out.println(i6.getSistemaOperativo());
		
		//Acediendo a un metodo en una forma estatica 
		//(sin crear una instancia)
		
		
	}
}
