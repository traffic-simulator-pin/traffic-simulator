package br.udesc.ceavi.pin2.trafficsimulator.model;

import java.util.List;

public class ConfiguracaoSistema {
	
	private List<ModuloSistema> modulos;
	
	public ConfiguracaoSistema() {
		super();
	}

	public ConfiguracaoSistema(List<ModuloSistema> modulos) {
		super();
		this.modulos = modulos;
	}

	public List<ModuloSistema> getModulos() {
		return modulos;
	}

	public void setModulos(List<ModuloSistema> modulos) {
		this.modulos = modulos;
	}
	
}
