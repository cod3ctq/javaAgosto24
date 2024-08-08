package com;

public class Principal {
	public static void main(String[] args) {
		Iphone p = new Iphone();
		
		p.modelo = "XR";
		// p.marca = "apple"; No se puede acceder directamente porque es privado
		
		
		// con los setter se asignan valores a un atributo.
		p.setModelo("");
		p.setVersion("");
		p.setAlmacenamiento(0);
		p.setColor("");
		
		Iphone p2 = new Iphone("XR", "10", 128, "Blanco");
		Iphone p3 = new Iphone("11", "10.3", 256, "Dorado");
		Iphone p4 = new Iphone("12", "10", 128, "Rosa");
		Iphone p5 = new Iphone("14 Pro Max", "10", 256, "Rojo");
		Iphone p6 = new Iphone("12 Pro", "10", 128, "Cobre");
		
		System.out.println(p2.getMarca());
		
		
		
	}

}
