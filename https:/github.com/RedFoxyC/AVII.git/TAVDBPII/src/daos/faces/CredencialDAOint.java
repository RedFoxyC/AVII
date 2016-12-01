package daos.faces;

import java.io.Serializable;

import models.Credencial;


public interface CredencialDAOint<I extends Serializable> {
	public Credencial save(Credencial credencial);
	public void remove(I idCredencial);
	public Credencial buscaId(I idCredencial);
	public Credencial validar(Credencial credencial);

}