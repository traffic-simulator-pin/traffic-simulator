package br.udesc.ceavi.pin2.trafficsimulator.view;

import javax.swing.JOptionPane;

public class TratamentoExcecao {
	
	private static TratamentoExcecao instance;

	public static TratamentoExcecao getInstance() {
		if(instance == null) {
			instance = new TratamentoExcecao();
		}
		return instance;
	}
	
	private TratamentoExcecao() {
		super();
	}

	public void tratar(Exception ex) {
		JOptionPane.showMessageDialog(null, getMensagemErro(ex), getTituloErro(ex), JOptionPane.ERROR_MESSAGE);
		ex.printStackTrace();
	}

	private String getMensagemErro(Exception ex) {
		return "Erro ao realizar opera��o: " + ex.getMessage();
	}

	private String getTituloErro(Exception ex) {
		String classeErro = ex.getClass().getName();
		return "Erro: " + classeErro.substring(classeErro.lastIndexOf('.') + 1);
	}

}
