package uade.ioo.vista.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uade.ioo.modelo.AdministradorDePagos;
import uade.ioo.vista.comportamiento.IVistaPagarServicios;

public class PagarServiciosController implements ActionListener {
	
	private AdministradorDePagos modelo;
	private IVistaPagarServicios vista;

	public PagarServiciosController(AdministradorDePagos modelo, IVistaPagarServicios vista) {

		super();
		this.modelo = modelo;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		this.modelo.obtenerChequesParaPagar(this.vista.getMontoAPagar());
	}
}
