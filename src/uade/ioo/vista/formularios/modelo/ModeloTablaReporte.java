package uade.ioo.vista.formularios.modelo;

import javax.swing.table.AbstractTableModel;

public class ModeloTablaReporte extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	@Override
	public int getColumnCount() {

		return 2;
	}

	@Override
	public int getRowCount() {

		return 5;
	}

	@Override
	public Object getValueAt(int fila, int columna) {
		
		if (fila == 0 && columna == 0) {

			return "Monto para cheques de terceros";
		}
		
		if (fila == 1 && columna == 0) {
			
			return "Monto pagado";
		}
		
		if (fila == 2 && columna == 0) {
			
			return "Monto depositado en el banco";
		}
		
		if (fila == 3 && columna == 0) {
			
			return "Monto de dinero emitido en cheques";
		}
		
		if (fila == 4 && columna == 0) {
			
			return "Monto de cheques proximos a vencer";
		}

		return Integer.toString(fila) + "-" + Integer.toString(columna);
	}
}
