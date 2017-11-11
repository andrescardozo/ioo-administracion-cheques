package uade.ioo.vista.formularios;

import javax.swing.JFrame;
import javax.swing.JList;

import uade.ioo.vista.formularios.modelo.ModeloListaChequesDeTercerosAVencer;

public class JFormularioChequesDeTercerosAVencer extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFormularioChequesDeTercerosAVencer() {

		this.setSize(480, 320);
		this.setTitle("Cheques de terceros a vencer");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JList<String> lista = new JList<String>(new ModeloListaChequesDeTercerosAVencer());

		this.getContentPane().add(lista);
	}

}
