package com;

public class Television {
 
  String marca;
  String modelo;
  String tamaño;
  String resolucion;
  String sonido;
  double color;
  double precio;
  
  public Television () {
	  
  }
  

public Television(String marca, String modelo, String tamaño, String resolucion, String sonido, double color,
		double precio) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.tamaño = tamaño;
	this.resolucion = resolucion;
	this.sonido = sonido;
	this.color = color;
	this.precio = precio;
}


public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getTamaño() {
	return tamaño;
}

public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}

public String getResolucion() {
	return resolucion;
}

public void setResolucion(String resolucion) {
	this.resolucion = resolucion;
}

public String getSonido() {
	return sonido;
}

public void setSonido(String sonido) {
	this.sonido = sonido;
}

public double getColor() {
	return color;
}

public void setColor(double color) {
	this.color = color;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}


@Override
public String toString() {
	return "Television [marca=" + marca + ", modelo=" + modelo + ", tamaño=" + tamaño + ", resolucion=" + resolucion
			+ ", sonido=" + sonido + ", color=" + color + ", precio=" + precio + "]";
}
//
public void sonido() {
	System.out.println("Volumen...");
	
}

}
