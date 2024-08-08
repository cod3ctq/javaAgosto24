package com;

public class Principal {
	public static void main(String[] args) {
		
		Iphone ip1 = new Iphone();
		
		//Acceso directo a un atributi de una clase
		//forma incorrecta
		ip1.modelo = "XR"; 
		ip1.version="15.1";
		
		/*con los set se pueden obtener los datos
		sin import0ar si es privada o protegida*/
		ip1.setModelo(" ");
		ip1.setVersion("");
		
		Iphone i2 = new Iphone("XR","10",128,"Blanco");
		Iphone i3 = new Iphone("11","10.3",256,"Negro");
		Iphone i4 = new Iphone("12 Pro","12.1",128,"Gris");
		Iphone i5 = new Iphone("13","12.5",512,"Azul Celeste");
		Iphone i6 = new Iphone("14 Pro Max","15.2",256,"Blanco");
		
		//todos los objetos imprimen el mismo valor 
		//dado por a clase
		System.out.println(i2.getSistemaOperativo());
		System.out.println(i3.getSistemaOperativo());
		System.out.println(i4.getSistemaOperativo());

		//cambio de un valor apuntando a la clase
		//y por consecuencian, todas las instancias 
		//sufren cambios
//		Iphone.SISTEMA_OPERATIVO = "Linux";
		System.out.println(i5.getSistemaOperativo());
		System.out.println(i6.getSistemaOperativo());
		
		
		
		
		//Acediendo a un metodo en una forma estatica
		//Sin crear una isntancia
//		Iphone.instalarApps();
		
	}

}
