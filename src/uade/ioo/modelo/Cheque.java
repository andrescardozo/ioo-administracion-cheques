package uade.ioo.modelo;

public class Cheque {

	private int numero;
	private double monto;

	public Cheque(int numero, double monto) {
		
		super();
		this.numero = numero;
		this.monto = monto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public void sePuedePagarCon() {
	}
	
	public void getMontoDisponiblePago() {
	}
}
