package br.udesc.ceavi.pin2.trafficsimulator.controller;

import java.util.List;

public interface ControllerPrincipalInterface {
	
	void abrirModulo(Integer id) throws Exception;
	
	void sair();

	List<Integer> getModulos();

	String getNomeModulo(Integer id);

	String getTitulo();

}
