package COM;

public class Principal {
	
	public static void main(String[] args) {
		
		 Iphone ip1 = new Iphone();
		 
		 ip1.modelo ="XR";
		 ip1.version = "15.1";
//		  ip1.marca = "Apple";
		 
		 ip1.setModelo("");
		 ip1.setVersion("");
	
		 Iphone  i2 = new Iphone("XR", "10", 128, "Blanco");
		 Iphone  i3 = new Iphone("11", "10.3", 256, "Negro");
		 Iphone  i4 = new Iphone("12 pro", "12.1", 128, "Gris");
		 Iphone  i5 = new Iphone("13", "12.5", 512, "Azul celeste");
		 Iphone  i6 = new Iphone("14 pro max", "15.2", 256, "Blanco");
		 
		 System.out.println(i2.getSistemaOperativo());
		 System.out.println(i3.getSistemaOperativo());
		 System.out.println(i4.getSistemaOperativo());
		 
		 //cambio de un valor apuntando a la clase 
		 //y por consecuencia, todas las instancias
		 //sufren 
//		 Iphone.os = "Linux";
		 System.out.println(i5.getSistemaOperativo());
		 System.out.println(i6.getSistemaOperativo());
		 
		 //Acediendo a un metodo de una forma estica
		 //sin crear una instancia
//		 Iphone.instalarApps();
	}

}

