package uade.ioo.modelo;

public class ChequeTerceros extends Cheque {
	
	private EstadoCheque estadoCheque;

	public EstadoCheque getEstadoCheque() {
		return estadoCheque;
	}
	
	public ChequeTerceros(int numero, String tipo, double monto) {
		
		super(numero, tipo, monto);
		// TODO Auto-generated constructor stub
	}
}
