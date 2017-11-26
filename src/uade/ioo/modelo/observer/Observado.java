package uade.ioo.modelo.observer;

import java.util.ArrayList;
import java.util.List;

import uade.ioo.modelo.observer.IObservador;

public abstract class Observado {
	
	private List<IObservador> observadores = new ArrayList<IObservador>();

	public void registrarObservador(IObservador observador) {
		this.observadores.add(observador);
	}

	public void quitarObservador(IObservador observador) {
		this.observadores.remove(observador);
	}

	protected void notificarObservadores() {
		
		for (IObservador observador : this.observadores) {
			
			observador.actualizar();
		}
	}
}
