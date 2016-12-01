package daos;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T,  I extends Serializable> {

	public T save(T entidade);
	public T update(T entidade);
	public T search(Integer i);
	public List<T> list();
}
