package com;

public class Principal {

	public static void main(String[] args) {
		
		Iphone ip1 = new Iphone();
		
		//acceso directo a un atributo de 
		//forma incorrecta
		ip1.modelo = "xr";
		ip1.version = "15.2";
//		ip1.marca = "Apple";
		
		//la forma correcta es serter
		//no nos preocupamos si es pri, publi
		ip1.setModelo(null);
		ip1.setVersion(null);
//		ip1.setMarca(null);
		
		
		
		Iphone i2 = new Iphone("XR", "10", 128, "Blanco");
		Iphone i3 = new Iphone("11", "10.3", 256, "Negro");
		Iphone i4 = new Iphone("12 pro", "12.1", 128, "Gris");
		Iphone i5 = new Iphone("13", "12.5" , 128, "Negro");
		Iphone i6 = new Iphone("14 Pro Max", "15.2", 256, "Blanco");
	
		//todos los objetos imprimen el mismo valor
		//dado por la clase
//		System.out.println(i2.getOs());
//		System.out.println(i3.getOs());
//		System.out.println(i4.getOs());
		
		System.out.println(i2.getSistemaOperativo());
		System.out.println(i3.getSistemaOperativo());
		System.out.println(i4.getSistemaOperativo());
		
		//cambio de un valor apuntado a la clase
		// y por consecuancia, todas las instancias
		//sufren el cambio
		
		//Iphone.SISTEMA_OPERATIVO = "Linux";
		
//		System.out.println(i5.getOs());
//		System.out.println(i6.getOs());
		
		System.out.println(i5.getSistemaOperativo());
		System.out.println(i6.getSistemaOperativo());
		
		System.out.println(i5.getMarca());
		
		//accediendo a un metodo en una forma estatica
		//sin crear instancias
		//Iphone.istalarApps();
	}
}
