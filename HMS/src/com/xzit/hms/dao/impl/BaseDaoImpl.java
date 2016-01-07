/**  
* @Title: BaseDaoImpl.java <br>
* @Package com.xzit.hms.dao.impl <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:33:20 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xzit.hms.dao.BaseDao;
import com.xzit.hms.dao.HibernateSessionFactory;

/**
 * @ClassName: BaseDaoImpl <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午9:33:20 <br>
 * @version V1.0 <br>
 */
@SuppressWarnings("unchecked")
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

	private Session session;
	private Transaction tr;

	private Class<T> clazz;

	public BaseDaoImpl() {
		session = HibernateSessionFactory.getSession();
		tr = session.beginTransaction();
		// 得到泛型化超类
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];

	}

	public void saveEntity(T t) {
		session.save(t);
		tr.commit();
		session.close();
	}

	public void saveOrUpdateEntity(T t) {
		session.saveOrUpdate(t);
		tr.commit();
		session.close();
	}

	public void deleteEntity(T t) {
		session.delete(t);
		tr.commit();
		session.close();
	}

	public void updateEntity(T t) {
		session.update(t);
		tr.commit();
		session.close();
	}

	public void batchEntityBySQL(String hql, Object... objects) {
		Query q = session.createQuery(hql);
		for (int i = 0; i < objects.length; i++) {
			q.setParameter(i, objects[i]);
		}
		q.executeUpdate();
		tr.commit();
		session.close();
	}

	public T getEntity(Integer id) {
		return (T) session.get(clazz, id);
	}

	public List<T> findEntityByHQL(String hql, Object... objects) {
		Query q = session.createQuery(hql);
		for (int i = 0; i < objects.length; i++) {
			q.setParameter(i, objects[i]);
		}
		return q.list();
	}

}
