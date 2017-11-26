package uade.ioo.vista.formularios;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import uade.ioo.modelo.AdministradorDePagos;
import uade.ioo.vista.comportamiento.IVistaRecibirCheque;
import uade.ioo.vista.controlador.AgregarChequeController;

public class JFormularioRegistrarCheque extends JFormularioBase implements IVistaRecibirCheque {

	private static final long serialVersionUID = 1L;
	
	private JLabel lblNumeroDeCheque = new JLabel();
	private JTextField txtFldNumeroDeCheque = new JTextField();
	private JLabel lblMontoDelCheque = new JLabel();
	private JTextField txtFldMontoDelCheque = new JTextField();
	private JButton btnAgregarCheque = new JButton();
	
	public JFormularioRegistrarCheque(AdministradorDePagos modelo) {
		
		super(modelo);
		
		this.getContentPane().setLayout(new FlowLayout());
		
		this.setSize(480, 320);
		this.setTitle("Registrar cheque de terceros");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.lblNumeroDeCheque.setText("Ingrese el numero del cheque: ");
		
		this.txtFldNumeroDeCheque.setColumns(12);
		
		this.lblMontoDelCheque.setText("Ingrese el monto del cheque: ");
		
		this.txtFldMontoDelCheque.setColumns(12);
		
		this.btnAgregarCheque.setText("Registrar cheque");
		this.btnAgregarCheque.setPreferredSize(new Dimension(150, 30));
		this.btnAgregarCheque.addActionListener(new AgregarChequeController(this.getModelo(), this));
		
		this.getContentPane().add(lblNumeroDeCheque);
		this.getContentPane().add(txtFldNumeroDeCheque);
		this.getContentPane().add(lblMontoDelCheque);
		this.getContentPane().add(txtFldMontoDelCheque);
		this.getContentPane().add(btnAgregarCheque);
	}

	@Override
	public int getNumero() {
		
		int numeroDelCheque = 0;
		
		if (!this.txtFldNumeroDeCheque.getText().equals("")) {
			numeroDelCheque = Integer.parseInt(this.txtFldNumeroDeCheque.getText());
		}
		
		return numeroDelCheque;
	}

	@Override
	public double getMonto() {
		
		double montoDelCheque = 0;
		
		if (!this.txtFldMontoDelCheque.getText().equals("")) {
			montoDelCheque = Double.parseDouble(this.txtFldMontoDelCheque.getText());
		} 
		
		return montoDelCheque;
	}
}
