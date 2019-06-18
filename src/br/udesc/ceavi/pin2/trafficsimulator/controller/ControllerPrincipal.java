package br.udesc.ceavi.pin2.trafficsimulator.controller;

import java.util.List;
import java.util.stream.Collectors;

import br.udesc.ceavi.pin2.trafficsimulator.model.ConfiguracaoSistema;
import br.udesc.ceavi.pin2.trafficsimulator.model.ModuloSistema;

public class ControllerPrincipal implements ControllerPrincipalInterface {
	
	private static ControllerPrincipalInterface instance;
	private ConfiguracaoSistema configuracao;
	private ExecutorModuloInterface executorModulo;

	public static ControllerPrincipalInterface getInstance() {
		if(instance == null) {
			instance = new ControllerPrincipal();
		}
		return instance;
	}
	
	private ControllerPrincipal() {
		configuracao = LeitorConfiguracaoSistema.getInstance().getConfiguracao();
		executorModulo = new ExecutorModulo();
	}

	@Override
	public List<Integer> getModulos() {
		return configuracao.getModulos().stream()
			.map(modulo -> modulo.getId())
			.collect(Collectors.toList());
	}

	@Override
	public String getNomeModulo(Integer id) {
		return getModulo(id).getNome();
	}

	@Override
	public void abrirModulo(Integer id) throws Exception {
		executorModulo.executar(getModulo(id));
	}

	@Override
	public void sair() {
		System.exit(0);
	}

	@Override
	public String getTitulo() {
		return "Simulador de Tr\u00e1fego - PIN 2";
	}
	
	private ModuloSistema getModulo(Integer id) {
		return configuracao.getModulos().stream()
				.filter(modulo -> modulo.getId() == id)
				.findFirst()
				.get();
	}
	
}
