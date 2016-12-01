package daos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import Control.Maker;
import daos.faces.PessoaDAOint;
import models.Pessoa;

public class PessoaDAO extends GenericDAOabs<Pessoa, Integer> implements PessoaDAOint{
	
	public PessoaDAO(){
		super(Pessoa.class); 
	}

	@Override
	public Pessoa save(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Serializable idPessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pessoa buscaId(Serializable idPessoa) {
		EntityManager em = Maker.getEntityManager();
	       em.getTransaction().begin();
	       Session session = (Session) em.getDelegate();
		return session.createCriteria(Pessoa.class)
				.add(Restrictions.ilike
						("id", idPessoa, MatchMode.START)).list();
	}

	@Override
	public List<Pessoa> buscaNome(String nome) {
		EntityManager em = Maker.getEntityManager();
        em.getTransaction().begin();
        Session session = (Session) em.getDelegate();
		return session.createCriteria(Pessoa.class)
				.add(Restrictions.ilike
						("nome", nome, MatchMode.START)).list();
	}

	

}
