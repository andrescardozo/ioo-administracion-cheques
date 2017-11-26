package uade.ioo.principal;

import javax.swing.JFrame;

import uade.ioo.modelo.AdministradorDePagos;
import uade.ioo.vista.formularios.JFormularioReporte;

public class Programa {
	
	public static void main (String[] args) {
		
		AdministradorDePagos modelo = new AdministradorDePagos();
		
		JFrame formularioPrincipal = new JFormularioReporte(modelo);
		formularioPrincipal.setVisible(true);
	}
}
