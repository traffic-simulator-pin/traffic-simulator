package br.udesc.ceavi.pin2.trafficsimulator.view.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.udesc.ceavi.pin2.trafficsimulator.controller.ControllerPrincipal;
import br.udesc.ceavi.pin2.trafficsimulator.view.TratamentoExcecao;

public class AbrirModuloActionListener implements ActionListener {

	private Integer idModulo;

	public AbrirModuloActionListener(Integer idModulo) {
		this.idModulo = idModulo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			ControllerPrincipal.getInstance().abrirModulo(idModulo);
		} catch (Exception ex) {
			TratamentoExcecao.getInstance().tratar(ex);
		}
	}

}
