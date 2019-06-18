package br.udesc.ceavi.pin2.trafficsimulator.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.udesc.ceavi.pin2.trafficsimulator.controller.ControllerPrincipalInterface;

public class MenuPrincipal extends JMenuBar {

	private static final long serialVersionUID = 1L;
	private ControllerPrincipalInterface controller;

	public MenuPrincipal(ControllerPrincipalInterface controllerPrincipal) {
		controller = controllerPrincipal;
		init();
	}

	private void init() {
		add(criarMenuModulos());
		add(criarMenuOpcoes());
	}

	private JMenu criarMenuModulos() {
		JMenu menu = new JMenu("M\u00f3dulos");
		for(Integer idModulo : controller.getModulos()) {
			menu.add(criarItemModulo(idModulo));
		}
		return menu;
	}

	private JMenuItem criarItemModulo(Integer id) {
		JMenuItem item = new JMenuItem(controller.getNomeModulo(id));
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					controller.abrirModulo(id);
				} catch(Exception ex) {
					TratamentoExcecao.getInstance().tratar(ex);
				}		
			}
		});
		return item;
	}

	private JMenu criarMenuOpcoes() {
		JMenu menu = new JMenu("Op\u00e7\u00f5es");
		menu.add(criarOpcaoSair());
		return menu;
	}

	private JMenuItem criarOpcaoSair() {
		JMenuItem item = new JMenuItem("Sair");
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.sair();
			}
		});
		return item;
	}
	
}
