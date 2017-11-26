package uade.ioo.vista.formularios;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import uade.ioo.modelo.AdministradorDePagos;
import uade.ioo.vista.formularios.modelo.ModeloListaPagarSevicios;

public class JFormularioPagarServicios extends JFormularioBase {

	private static final long serialVersionUID = 1L;
	
	private JLabel lblMontoServicioAPagar = new JLabel();
	private JTextField txtFldMontoServicioAPagar = new JTextField();

	public JFormularioPagarServicios(AdministradorDePagos modelo) {
		
		super(modelo);
		
		this.setSize(480, 320);
		this.setTitle("Pagar servicios");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.getContentPane().setLayout(new FlowLayout());
		
		JList<String> serviciosAPagar = new JList<String>(new ModeloListaPagarSevicios());

		this.lblMontoServicioAPagar.setText("Ingrese el monto del servicio a pagar");
		
		this.txtFldMontoServicioAPagar.setColumns(12);
		
		this.getContentPane().add(this.lblMontoServicioAPagar);
		this.getContentPane().add(this.txtFldMontoServicioAPagar);
		this.getContentPane().add(serviciosAPagar);
	}
}
