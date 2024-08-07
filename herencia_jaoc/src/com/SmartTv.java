package com;

public class SmartTv extends Television{
	
	boolean sistemaOperativo;
	boolean conectividadWifi;
	String appsPreInstaladas;
	String appStore;
	
	public SmartTv() {}

	public SmartTv(String marca, String modelo, double tamañoPantalla, double resolución, boolean controlRemoto,
			boolean sistemaOperativo, boolean conectividadWifi, String appsPreInstaladas, String appStore) {
		super(marca, modelo, tamañoPantalla, resolución, controlRemoto);
		this.sistemaOperativo = sistemaOperativo;
		this.conectividadWifi = conectividadWifi;
		this.appsPreInstaladas = appsPreInstaladas;
		this.appStore = appStore;
	}

	public boolean isSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(boolean sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	public boolean isConectividadWifi() {
		return conectividadWifi;
	}
	public void setConectividadWifi(boolean conectividadWifi) {
		this.conectividadWifi = conectividadWifi;
	}
	public String getAppsPreInstaladas() {
		return appsPreInstaladas;
	}
	public void setAppsPreInstaladas(String appsPreInstaladas) {
		this.appsPreInstaladas = appsPreInstaladas;
	}
	public String getAppStore() {
		return appStore;
	}
	public void setAppStore(String appStore) {
		this.appStore = appStore;
	}
	@Override
	public String toString() {
		return "SmartTv [sistemaOperativo=" + sistemaOperativo + ", conectividadWifi=" + conectividadWifi
				+ ", appsPreInstaladas=" + appsPreInstaladas + ", appStore=" + appStore + ", marca=" + marca
				+ ", modelo=" + modelo + ", tamañoPantalla=" + tamañoPantalla + ", resolución=" + resolución
				+ ", controlRemoto=" + controlRemoto + "]";
	}
	
	public void conectarWifi(int uno, int dos) {
		int pass = 10;
		if (uno + dos == pass) {
			System.out.println("SmartTv conectada a Wifi exitosamente!");
		}	else {
			System.out.println("No se ha conectado a ninguna red Wifi");
		}	
	}
		

}
