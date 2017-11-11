package uade.ioo.vista.formularios.modelo;

import javax.swing.AbstractListModel;

public class ModeloListaPagarSevicios extends AbstractListModel<String> {

	private static final long serialVersionUID = 1L;

	public String getElementAt(int arg0) {
		// TODO Auto-generated method stub
		return "Cheque";
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return 10;
	}
}