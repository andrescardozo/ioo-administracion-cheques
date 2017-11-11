package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDePagos {
	
	private Cheque cheque;

	public Cheque getCheque() {
		return cheque;
	}

	public List<Cheque> obtenerChequesParaPagar(double monto) {

		Cheque uno = new Cheque(12323, "Terceros", monto / 2);
		Cheque dos = new Cheque(1, "Propio", monto / 2);

		List<Cheque> cheques = new ArrayList<Cheque>();
		cheques.add(uno);
		cheques.add(dos);

		return cheques;
	}

	public Cheque generarChequeNuevo(double monto) {

		return new Cheque(2, "Propio", monto);
	}

	public double getMontoDiponiblePagos() {

		return 1;
	}
}
