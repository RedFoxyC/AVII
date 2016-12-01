package daos;

import java.io.Serializable;
import java.util.List;

import daos.faces.ReservaDAOint;
import models.Reserva;

public class ReservaDAO extends GenericDAOabs<Reserva, Integer> implements ReservaDAOint{

	
	public Reserva save(Reserva reserva) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Serializable idReserva) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reserva buscaId(Serializable idReserva) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> lista() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
