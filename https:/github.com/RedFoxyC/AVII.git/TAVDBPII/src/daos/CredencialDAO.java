package daos;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Control.Maker;
import daos.faces.CredencialDAOint;
import models.Credencial;

public class CredencialDAO extends GenericDAOabs<Credencial, Integer> implements CredencialDAOint {

	@Override
	public Credencial save(Credencial credencial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Serializable idCredencial) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Credencial buscaId(Serializable idCredencial) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Credencial validar(Credencial credencial){
		EntityManager em = Maker.getEntityManager();
        em.getTransaction().begin();
        Session session = (Session) em.getDelegate();
        return (Credencial) session.createCriteria(Credencial.class)
        		.add(Restrictions.eq("login", Credencial.getLogin()))
        		.add(Restrictions.eq("senha", Credencial.getSenha())).uniqueResult();
	}

}
