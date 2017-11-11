package uade.ioo.modelo;

public class Chequera {

	private static int ULTIMO_NUMERO_FACTURA = 0;

	private ChequePropio chequePropio;

	public ChequePropio getChequePropio() {
		
		return chequePropio;
	}

	public double ultimoNumero() {

		Chequera.ULTIMO_NUMERO_FACTURA = Chequera.ULTIMO_NUMERO_FACTURA + 1;

		return ULTIMO_NUMERO_FACTURA;
	}
}
