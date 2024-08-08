package COM;

public class Principal {
	
	public static void main(String[] args) {
		Impresora imp1 = new Impresora();
		Multifuncional ml1 = new Multifuncional();
		
		imp1.imprimir();
		ml1.imprimir();
		
		ml1.escanear(); //metodo exclusivo del objeto de la clase hija
	
	}

}
