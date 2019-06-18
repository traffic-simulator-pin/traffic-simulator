package br.udesc.ceavi.pin2.trafficsimulator.controller;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

import br.udesc.ceavi.pin2.trafficsimulator.model.ConfiguracaoSistema;

public class LeitorConfiguracaoSistema {
	
	private static final String ARQUIVO_CONFIGURACAO = "configuracao.json";
	private static LeitorConfiguracaoSistema instance;
	private ConfiguracaoSistema configuracao;
	
	public static LeitorConfiguracaoSistema getInstance() {
		if(instance == null) {
			instance = new LeitorConfiguracaoSistema();
		}
		return instance;
	}
	
	private LeitorConfiguracaoSistema() {
		try {
			FileReader reader = new FileReader(new File(ARQUIVO_CONFIGURACAO));
			configuracao = new Gson().fromJson(reader, ConfiguracaoSistema.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ConfiguracaoSistema getConfiguracao() {
		return configuracao;
	}

}
