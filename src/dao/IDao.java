package dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<T, ID extends Serializable> {
	void saveOrUpdate(T t);

	List<T> list(Class<T> clazz);

	T get(Class<T> clazz, ID id);

	void delete(Class<T> clazz, ID id);
}
