package uade.ioo.vista.formularios;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JFormularioPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public JFormularioPrincipal() {
		
		this.setSize(640, 480);
		this.setTitle("Administrador de cheques");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menuCheque = new JMenu("Cheque");
		
		menuBar.add(menuCheque);
		
		this.setJMenuBar(menuBar);
	}
}
