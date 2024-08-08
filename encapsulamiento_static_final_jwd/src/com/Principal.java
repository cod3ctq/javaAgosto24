package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Iphone ip1 = new Iphone();
		
		//acceso directo a un atributo
		//Forma incorrecta
		ip1.modelo = "xr";
		//ip1.marca = "apple";
		ip1.version = "apple";
		
		//Siempre se asignan valores de atributo con
		//getters and setters
		ip1.setModelo("");
		ip1.setVersion("");
		
		
		/*todos los objetos imprimen el mismo valor dada la clase*/		
		Iphone i2 = new Iphone("10", 128, "XR", "Blanco");
		Iphone i3 = new Iphone("11", 256, "11", "Negro");
		Iphone i4 = new Iphone("12 Pro", 128, "12", "Gris");
		
		//cambio a un valor statico de la instancia
		//cambio de valor apuntando a la clase
		//Iphone.os = "Linux";
		
		Iphone i5 = new Iphone("13", 512, "12 Pro", "Azul Celeste");
		Iphone i6 = new Iphone("14 Pro", 256, "13", "Blanco");
		
		System.out.println(i2.getSistemaOperativo());
		System.out.println(i3.getSistemaOperativo());
		System.out.println(i4.getSistemaOperativo());
		System.out.println(i5.getSistemaOperativo());
		System.out.println(i6.getSistemaOperativo());
		
	/*	i2.instalarApps();
		accerder a un metodo de forma estatica
		sin crear una estancia */
		Iphone.instalarApps();
		
	}

}
