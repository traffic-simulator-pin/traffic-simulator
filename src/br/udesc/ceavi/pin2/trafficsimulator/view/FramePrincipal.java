package br.udesc.ceavi.pin2.trafficsimulator.view;

import javax.swing.JFrame;

import br.udesc.ceavi.pin2.trafficsimulator.controller.ControllerPrincipalInterface;

public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public FramePrincipal(ControllerPrincipalInterface controller) {
		setJMenuBar(new MenuPrincipal(controller));
		setSize(800, 600);
		setTitle(controller.getTitulo());
		setLocationRelativeTo(null);
	}

}
