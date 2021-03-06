package daos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.validation.Valid;

public abstract class GenericDAOabs<T, I extends Serializable> {

	   @Inject
	   protected EntityManager entityManager;

	   private Class<T> scopeClass;

	   protected GenericDAOabs() {
	   }

	   protected GenericDAOabs(Class<T> persistedClass) {
	       this();
	       this.scopeClass = persistedClass;
	   }

	   public T salvar(@Valid T entity) {
	       EntityTransaction t = entityManager.getTransaction();
	       t.begin();
	       entityManager.persist(entity);
	       entityManager.flush();
	       t.commit();
	       return entity;
	   }

	   public T atualizar(@Valid T entity) {
	       EntityTransaction t = entityManager.getTransaction();
	       t.begin();
	       entityManager.merge(entity);
	       entityManager.flush();
	       t.commit();
	       return entity;
	   }

	   public void remover(I id) {
	       T entity = encontrar(id);
	       EntityTransaction tx = entityManager.getTransaction();
	       tx.begin();
	       T mergedEntity = entityManager.merge(entity);
	       entityManager.remove(mergedEntity);
	       entityManager.flush();
	       tx.commit();
	   }

	   public List<T> getList() {
	       CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	       CriteriaQuery<T> query = builder.createQuery(scopeClass);
	       query.from(scopeClass);
	       return entityManager.createQuery(query).getResultList();
	   }

	   public T encontrar(I id) {
	       return entityManager.find(scopeClass, id);
	   }
	}
