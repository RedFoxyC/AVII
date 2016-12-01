package daos.faces;

import java.io.Serializable;

import models.QuartoType;


public interface QuartotypeDAOint<I extends Serializable> {
	public QuartoType save(QuartoType idQType);
	public void remove(I idQuartoType);
	public QuartoType buscaId(I idQuartoType);

}
