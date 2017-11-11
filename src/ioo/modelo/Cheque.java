package ioo.modelo;

public class Cheque {

	private int numero;
	private String tipo;
	private double monto;

	public Cheque(int numero, String tipo, double monto) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.monto = monto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
}