package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.List;

import uade.ioo.modelo.observer.Observado;

public class AdministradorDePagos extends Observado {
	
	private List<Cheque> cheques = new ArrayList<Cheque>();

	private Cheque cheque;
	private Chequera chequera;

	public Cheque getCheque() {

		return cheque;
	}

	public Chequera getChequera() {

		return chequera;
	}

	public List<Cheque> obtenerChequesParaPagar(double monto) {

		Cheque uno = new Cheque(12323, monto / 2);
		Cheque dos = new Cheque(1, monto / 2);

		List<Cheque> cheques = new ArrayList<Cheque>();
		cheques.add(uno);
		cheques.add(dos);

		return cheques;
	}

	public Cheque generarChequeNuevo(double monto) {

		return new Cheque(2, monto);
	}

	public double getMontoDiponiblePagos() {

		return 1;
	}

	public void registrarChequeTercero(ChequeTerceros chequeTerceros) {

		this.cheques.add(chequeTerceros);
		this.notificarObservadores();
	}
	
	public double getMontoTotalCheques() {

		double result = 0;
		
		for (Cheque cheque : this.cheques) {

			result += cheque.getMonto();
		}

		return result;
	}
}
