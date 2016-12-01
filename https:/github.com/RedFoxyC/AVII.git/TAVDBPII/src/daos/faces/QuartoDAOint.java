package daos.faces;

import java.io.Serializable;

import models.Quarto;


public interface QuartoDAOint<I extends Serializable> {
	public Quarto save(Quarto quarto);
	public void remove(I idQuarto);
	public Quarto buscaId(I idQuarto);

}
