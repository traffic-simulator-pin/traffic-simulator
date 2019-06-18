package br.udesc.ceavi.pin2.trafficsimulator.controller;

import br.udesc.ceavi.pin2.trafficsimulator.model.ModuloSistema;

public interface ExecutorModuloInterface {

	void executar(ModuloSistema modulo) throws Exception;
	
}
