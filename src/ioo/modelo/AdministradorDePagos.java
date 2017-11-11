package ioo.modelo;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDePagos {

	public List<Cheque> calcularChequesParaPagar(double monto) {
		
		Cheque uno = new Cheque(12323, "Terceros", monto / 2); 
		Cheque dos = new Cheque(1, "Propio", monto / 2); 
		
		List<Cheque> cheques = new ArrayList<Cheque>();
		cheques.add(uno);
		cheques.add(dos);
		
		return cheques;
	}
}
