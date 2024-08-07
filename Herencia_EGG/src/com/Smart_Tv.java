package com;

public class Smart_Tv extends Television{
	
	String marca;
	String modelo;
	String sistemaoperativo;
	String conectividad;
	String aplicaciones;
	String contolVoz;
	String pulgadas;
	 
	public Smart_Tv() {
		
	}

	public Smart_Tv(String marca, String modelo, String sistemaoperativo, String conectividad, String aplicaciones,
			String contolVoz, String pulgadas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.sistemaoperativo = sistemaoperativo;
		this.conectividad = conectividad;
		this.aplicaciones = aplicaciones;
		this.contolVoz = contolVoz;
		this.pulgadas = pulgadas;
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

	public String getSistemaoperativo() {
		return sistemaoperativo;
	}

	public void setSistemaoperativo(String sistemaoperativo) {
		this.sistemaoperativo = sistemaoperativo;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	public String getAplicaciones() {
		return aplicaciones;
	}

	public void setAplicaciones(String aplicaciones) {
		this.aplicaciones = aplicaciones;
	}

	public String getContolVoz() {
		return contolVoz;
	}

	public void setContolVoz(String contolVoz) {
		this.contolVoz = contolVoz;
	}

	public String getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(String pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return "Smart_Tv [marca=" + marca + ", modelo=" + modelo + ", sistemaoperativo=" + sistemaoperativo
				+ ", conectividad=" + conectividad + ", aplicaciones=" + aplicaciones + ", contolVoz=" + contolVoz
				+ ", pulgadas=" + pulgadas + "]";
	}
	public void procesador() {
		
	}
    public void memoriaram() {
    }
    
    }
