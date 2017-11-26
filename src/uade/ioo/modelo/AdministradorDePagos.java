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

		List<Cheque> chequesParaPagar = new ArrayList<Cheque>();
		double montoTemporal = monto;
		
		for (Cheque cheque : cheques) {
			
			if (cheque.getMonto() <= montoTemporal) {
				
				montoTemporal -= cheque.getMonto();
				chequesParaPagar.add(cheque);
			}
		}
		
		if (montoTemporal > 0) {
			
			ChequePropio chequePropio = new ChequePropio(0, montoTemporal);
			
			chequesParaPagar.add(chequePropio);
		}

		return chequesParaPagar;
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
