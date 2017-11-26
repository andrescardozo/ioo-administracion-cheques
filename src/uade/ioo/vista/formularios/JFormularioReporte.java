package uade.ioo.vista.formularios;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import uade.ioo.modelo.AdministradorDePagos;

public class JFormularioReporte extends JFormularioBase {

	private static final long serialVersionUID = 1L;

	private JLabel lblMontoTotalRealizarPagosChequesTerceros = new JLabel();
	private JLabel lblValorMontoTotalRealizarPagosChequesTerceros = new JLabel();
	private JLabel lblMontoPagado = new JLabel();
	private JLabel lblValorMontoTotal = new JLabel();
	private JLabel lblMontoDepositado = new JLabel();
	private JLabel lblValorMontoDepositado = new JLabel();
	private JLabel lblMontoEmitidoEnCheques = new JLabel();
	private JLabel lblValorMontoEmitidoEnCheques = new JLabel();
	private JLabel lblMontoChequesProximosAVencer = new JLabel();
	private JLabel lblValorMontoChequesProximosAVencer = new JLabel();
	
	public JFormularioReporte(AdministradorDePagos modelo) {

		super(modelo);

		this.setSize(640, 480);
		this.setTitle("Administrador de cheques");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().setLayout(new FlowLayout());

		JMenuBar menuBar = new JMenuBar();

		JMenu menuCheque = new JMenu("Cheque");

		JMenuItem itemRegistarCheque = new JMenuItem("Regitrar cheque");
		itemRegistarCheque.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame formularioRegistrarCheque = new JFormularioRegistrarCheque(getModelo());
				formularioRegistrarCheque.setVisible(true);
			}
		});

		JMenuItem itemPagarServicios = new JMenuItem("Pagar servicios");
		itemPagarServicios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame formularioPagarServicios = new JFormularioPagarServicios(getModelo());
				formularioPagarServicios.setVisible(true);
			}
		});

		JMenuItem itemChequesDeTercerosAVencer = new JMenuItem("Cheques de terceros a vencer");
		itemChequesDeTercerosAVencer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame formularioChequesDeTercerosAVencer = new JFormularioChequesDeTercerosAVencer();
				formularioChequesDeTercerosAVencer.setVisible(true);
			}
		});

		JMenuItem itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});

		menuCheque.add(itemRegistarCheque);
		menuCheque.add(itemPagarServicios);
		menuCheque.add(itemChequesDeTercerosAVencer);
		menuCheque.addSeparator();
		menuCheque.add(itemSalir);

		menuBar.add(menuCheque);

		this.setJMenuBar(menuBar);
		
		this.lblMontoTotalRealizarPagosChequesTerceros.setSize(300, 100);

		this.lblMontoTotalRealizarPagosChequesTerceros.setText("Monto disponible para realizar pagos de cheques de terceros: ");
		this.lblMontoPagado.setText("Monto pagado: ");
		this.lblMontoDepositado.setText("Monto depositado: ");
		this.lblMontoEmitidoEnCheques.setText("Monto de dinero emitido en cheques: ");
		this.lblMontoChequesProximosAVencer.setText("Monto de cheques próximos a vencer: ");
		
		this.getContentPane().add(this.lblMontoTotalRealizarPagosChequesTerceros);
		this.getContentPane().add(this.lblValorMontoTotalRealizarPagosChequesTerceros);
		this.getContentPane().add(this.lblMontoPagado);
		this.getContentPane().add(this.lblValorMontoTotal);
		this.getContentPane().add(this.lblMontoDepositado);
		this.getContentPane().add(this.lblValorMontoDepositado);
		this.getContentPane().add(this.lblMontoEmitidoEnCheques);
		this.getContentPane().add(this.lblValorMontoEmitidoEnCheques);
		this.getContentPane().add(this.lblMontoChequesProximosAVencer);
		this.getContentPane().add(this.lblValorMontoChequesProximosAVencer);
		
		this.actualizar();
	}

	@Override
	public void actualizar() {
		
		super.actualizar();
		this.lblValorMontoTotalRealizarPagosChequesTerceros.setText(Double.toString(this.getModelo().getMontoTotalCheques()));
	}
}
