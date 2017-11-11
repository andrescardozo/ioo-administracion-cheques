package uade.ioo.vista.formularios;

import javax.swing.JFrame;
import javax.swing.JList;

import uade.ioo.vista.formularios.modelo.ModeloListaPagarSevicios;

public class JFormularioPagarServicios extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFormularioPagarServicios() {

		this.setSize(480, 320);
		this.setTitle("Pagar servicios");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JList<String> lista = new JList<String>(new ModeloListaPagarSevicios());

		this.getContentPane().add(lista);
	}
}
