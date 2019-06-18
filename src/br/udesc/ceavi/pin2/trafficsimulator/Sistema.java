package br.udesc.ceavi.pin2.trafficsimulator;

import javax.swing.JFrame;

import br.udesc.ceavi.pin2.trafficsimulator.controller.ControllerPrincipal;
import br.udesc.ceavi.pin2.trafficsimulator.view.FramePrincipal;


public class Sistema implements Runnable {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Sistema());
		thread.start();
	}

	@Override
	public void run() {
		JFrame framePrincipal = new FramePrincipal(ControllerPrincipal.getInstance());
		framePrincipal.setVisible(true);
	}

}
