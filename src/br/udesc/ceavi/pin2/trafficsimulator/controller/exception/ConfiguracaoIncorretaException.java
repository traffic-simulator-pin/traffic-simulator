package br.udesc.ceavi.pin2.trafficsimulator.controller.exception;

import br.udesc.ceavi.pin2.trafficsimulator.model.ModuloSistema;

public class ConfiguracaoIncorretaException extends Exception {

	private static final long serialVersionUID = 1L;
	private ModuloSistema modulo;

	public ConfiguracaoIncorretaException() {
		this("Problema na configura��o do m�dulo.", null);
	}

	public ConfiguracaoIncorretaException(ModuloSistema modulo) {
		this("Problema na configura��o do m�dulo " + modulo.getNome() + ".", modulo);
	}

	public ConfiguracaoIncorretaException(String mensagem, ModuloSistema modulo) {
		super(mensagem);
		this.modulo = modulo;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + "\n"
			 + "M�dulo: " + modulo.getNome();
	}

}
