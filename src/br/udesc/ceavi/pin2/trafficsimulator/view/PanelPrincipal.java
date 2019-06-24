package br.udesc.ceavi.pin2.trafficsimulator.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.udesc.ceavi.pin2.trafficsimulator.controller.ControllerPrincipalInterface;
import br.udesc.ceavi.pin2.trafficsimulator.view.listener.AbrirModuloActionListener;

public class PanelPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private ControllerPrincipalInterface controller;

	public PanelPrincipal(ControllerPrincipalInterface controllerPrincipal) {
		controller = controllerPrincipal;
		init();
	}

	private void init() {
		setLayout(new GridBagLayout());
		int y = 0;
		for(Integer idModulo : controller.getModulos()) {
			add(criarItemModulo(idModulo), criarConstraintsLayout(y++));
		}
	}

	private JButton criarItemModulo(Integer idModulo) {
		JButton item = new JButton(controller.getNomeModulo(idModulo));
		item.setPreferredSize(new Dimension(400, 50));
		item.addActionListener(new AbrirModuloActionListener(idModulo));
		return item;
	}

	private GridBagConstraints criarConstraintsLayout(int y) {
		GridBagConstraints cons = new GridBagConstraints();
		cons.gridx = 0;
		cons.gridy = y;
		cons.anchor = GridBagConstraints.CENTER;
		cons.insets = new Insets(5, 5, 5, 5);
		return cons;
	}

}
