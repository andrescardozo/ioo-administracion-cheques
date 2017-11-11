package uade.ioo.vista.formularios;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFormularioRegistrarCheque extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public JFormularioRegistrarCheque() {
		
		this.getContentPane().setLayout(new FlowLayout());
		
		this.setSize(480, 320);
		this.setTitle("Registrar cheque de terceros");
		this.setLocationRelativeTo(null);
		
		JLabel lblNumeroDeCheque = new JLabel();
		lblNumeroDeCheque.setText("Ingrese el numero del cheque: ");
		
		JTextField txtFldNumeroDeCheque = new JTextField();
		txtFldNumeroDeCheque.setColumns(12);
		
		JLabel lblMontoDelCheque = new JLabel();
		lblMontoDelCheque.setText("Ingrese el monto del cheque: ");
		
		JTextField txtFldMontoDelCheque = new JTextField();
		txtFldMontoDelCheque.setColumns(12);
		
		this.getContentPane().add(lblNumeroDeCheque);
		this.getContentPane().add(txtFldNumeroDeCheque);
		this.getContentPane().add(lblMontoDelCheque);
		this.getContentPane().add(txtFldMontoDelCheque);
	}
}
