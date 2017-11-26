package uade.ioo.modelo;

public class ChequeTerceros extends Cheque {
	
	private EstadoCheque estadoCheque;

	public EstadoCheque getEstadoCheque() {
		return estadoCheque;
	}
	
	public ChequeTerceros(int numero, double monto) {
		
		super(numero, monto);
		// TODO Auto-generated constructor stub
	}
}
