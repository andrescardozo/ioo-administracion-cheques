package uade.ioo.vista.formularios;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import uade.ioo.modelo.AdministradorDePagos;
import uade.ioo.vista.comportamiento.IVistaPagarServicios;
import uade.ioo.vista.controlador.PagarServiciosController;
import uade.ioo.vista.formularios.modelo.ModeloListaPagarSevicios;

public class JFormularioPagarServicios extends JFormularioBase implements IVistaPagarServicios {

	private static final long serialVersionUID = 1L;
	
	private JLabel lblMontoServicioAPagar = new JLabel();
	private JTextField txtFldMontoServicioAPagar = new JTextField();
	private JButton btnObtenerChequesParaPagar = new JButton();

	public JFormularioPagarServicios(AdministradorDePagos modelo) {
		
		super(modelo);
		
		this.setSize(480, 320);
		this.setTitle("Pagar servicios");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.getContentPane().setLayout(new FlowLayout());

		this.lblMontoServicioAPagar.setText("Ingrese el monto del servicio a pagar");
		
		this.txtFldMontoServicioAPagar.setColumns(12);
		
		this.btnObtenerChequesParaPagar.setText("Obtener cheques para pagar");
		this.btnObtenerChequesParaPagar.setPreferredSize(new Dimension(150, 30));
		this.btnObtenerChequesParaPagar.addActionListener(new PagarServiciosController(this.getModelo(), this));

		JList<String> serviciosAPagar = new JList<String>(new ModeloListaPagarSevicios());
		
		this.getContentPane().add(this.lblMontoServicioAPagar);
		this.getContentPane().add(this.txtFldMontoServicioAPagar);
		this.getContentPane().add(this.btnObtenerChequesParaPagar);
		this.getContentPane().add(serviciosAPagar);

		this.actualizar();
	}

	@Override
	public double getMontoAPagar() {

		double montoAPagar = 0;
		
		if (!this.txtFldMontoServicioAPagar.getText().equals("")) {
			montoAPagar = Double.parseDouble(this.txtFldMontoServicioAPagar.getText());
		}
		
		return montoAPagar;
	}
}
