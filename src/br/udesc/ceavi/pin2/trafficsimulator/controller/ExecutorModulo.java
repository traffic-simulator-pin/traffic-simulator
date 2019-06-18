package br.udesc.ceavi.pin2.trafficsimulator.controller;

import java.util.HashMap;
import java.util.Map;

import br.udesc.ceavi.pin2.trafficsimulator.controller.exception.ConfiguracaoIncorretaException;
import br.udesc.ceavi.pin2.trafficsimulator.model.ModuloSistema;

public class ExecutorModulo implements ExecutorModuloInterface {
	
	private Map<Integer, Runnable> modulos;
	
	public ExecutorModulo() {
		modulos = new HashMap<>();
	}

	@Override
	public void executar(ModuloSistema modulo) throws Exception {
		Runnable instancia = getInstanciaModulo(modulo);
		Thread thread = new Thread(instancia);
		thread.start();
	}
	
	private Runnable getInstanciaModulo(ModuloSistema modulo) throws Exception {
		Runnable instancia = modulos.get(modulo.getId());
		if(instancia == null) {
			instancia = criarInstanciaModulo(modulo);
		}
		return instancia;
	}

	private Runnable criarInstanciaModulo(ModuloSistema modulo) throws Exception {
		String classePrincipal = modulo.getClassePrincipal();
		if(classePrincipal.trim().length() == 0) {
			throw new ConfiguracaoIncorretaException("Classe principal não definida.", modulo);
		}
		return (Runnable) Class.forName(classePrincipal).getDeclaredConstructor().newInstance();
	}

}
