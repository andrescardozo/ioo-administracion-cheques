package uade.ioo.vista.formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;

import uade.ioo.modelo.AdministradorDePagos;
import uade.ioo.vista.formularios.modelo.ModeloTablaReporte;

public class JFormularioReporte extends JFormularioBase {

	private static final long serialVersionUID = 1L;

	private JLabel lblMontoTotal = new JLabel("0");

	public JFormularioReporte(AdministradorDePagos modelo) {

		super(modelo);

		this.setSize(640, 480);
		this.setTitle("Administrador de cheques");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

				JFrame formularioPagarServicios = new JFormularioPagarServicios();
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

		JTable reporte = new JTable(new ModeloTablaReporte());

		this.getContentPane().add(reporte);

		this.getContentPane().add(new JLabel("Monto Total: "));
		this.getContentPane().add(lblMontoTotal);
		this.actualizar();
	}

	@Override
	public void actualizar() {
		super.actualizar();
		this.lblMontoTotal.setText(Double.toString(this.getModelo().getMontoTotalCheques()));
	}
}
