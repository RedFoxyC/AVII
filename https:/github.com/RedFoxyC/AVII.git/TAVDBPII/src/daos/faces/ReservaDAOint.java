package daos.faces;

import java.io.Serializable;
import java.util.List;

import models.Reserva;


public interface ReservaDAOint<I extends Serializable> {
	public Reserva save(Reserva reserva);
	public void remove(I idReserva);
	public Reserva buscaId(I idReserva);
	public List<Reserva> listaCliente();

}
