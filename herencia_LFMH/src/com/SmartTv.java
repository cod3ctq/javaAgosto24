package com;

import java.util.Arrays;

public class SmartTv extends Television{

	String sistemaOperativo, tecnologiaPanel;
	double versionSO;
	int appsinstaladas;
	String[] apps=null, conectividades=null;
	boolean wifi;
	
	
	public SmartTv() {
		// TODO Auto-generated constructor stub
	}


	public SmartTv(int pulgadas, int ppi, int lanzamiento, int peso, int[] resolucion, String marca, boolean aColor,
			double precio, String sistemaOperativo, String tecnologiaPanel, double versionSO, int appsinstaladas,
			String[] apps, String[] conectividades, boolean wifi) {
		super(pulgadas, ppi, lanzamiento, peso, resolucion, marca, aColor, precio);
		this.sistemaOperativo = sistemaOperativo;
		this.tecnologiaPanel = tecnologiaPanel;
		this.versionSO = versionSO;
		this.appsinstaladas = appsinstaladas;
		this.apps = apps;
		this.conectividades = conectividades;
		this.wifi = wifi;
	}


	public String getSistemaOperativo() {
		return sistemaOperativo;
	}


	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	public String getTecnologiaPanel() {
		return tecnologiaPanel;
	}


	public void setTecnologiaPanel(String tecnologiaPanel) {
		this.tecnologiaPanel = tecnologiaPanel;
	}


	public double getVersionSO() {
		return versionSO;
	}


	public void setVersionSO(double versionSO) {
		this.versionSO = versionSO;
	}


	public int getAppsinstaladas() {
		return appsinstaladas;
	}


	public void setAppsinstaladas(int appsinstaladas) {
		this.appsinstaladas = appsinstaladas;
	}


	public String[] getApps() {
		return apps;
	}


	public void setApps(String[] apps) {
		this.apps = apps;
	}


	public String[] getConectividades() {
		return conectividades;
	}


	public void setConectividades(String[] conectividades) {
		this.conectividades = conectividades;
	}


	public boolean isWifi() {
		return wifi;
	}


	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}


	@Override
	public String toString() {
		return "SmartTv [sistemaOperativo=" + sistemaOperativo + ", tecnologiaPanel=" + tecnologiaPanel + ", versionSO="
				+ versionSO + ", appsinstaladas=" + appsinstaladas + ", apps=" + Arrays.toString(apps)
				+ ", conectividades=" + Arrays.toString(conectividades) + ", wifi=" + wifi + ", pulgadas=" + pulgadas
				+ ", ppi=" + ppi + ", lanzamiento=" + lanzamiento + ", peso=" + peso + ", precio=" + precio
				+ ", resolucion=" + Arrays.toString(resolucion) + ", marca=" + marca + ", aColor=" + aColor + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
