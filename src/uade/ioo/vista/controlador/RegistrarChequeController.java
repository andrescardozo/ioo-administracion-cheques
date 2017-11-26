package uade.ioo.vista.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uade.ioo.modelo.AdministradorDePagos;
import uade.ioo.modelo.ChequeTerceros;
import uade.ioo.vista.comportamiento.IVistaRecibirCheque;

public class RegistrarChequeController implements ActionListener {

	private AdministradorDePagos modelo;
	private IVistaRecibirCheque vista;

	public RegistrarChequeController(AdministradorDePagos modelo, IVistaRecibirCheque vista) {
		
		super();
		this.modelo = modelo;
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		ChequeTerceros chequeTerceros = new ChequeTerceros(this.vista.getNumero(), this.vista.getMonto());

		this.modelo.registrarChequeTercero(chequeTerceros);
	}

}
