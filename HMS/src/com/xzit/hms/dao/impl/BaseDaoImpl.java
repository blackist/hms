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

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xzit.hms.dao.BaseDao;

/**
 * @ClassName: BaseDaoImpl <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午9:33:20 <br>
 * @version V1.0 <br>
 */
@SuppressWarnings("unchecked")
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sf;

	private Class<T> clazz;

	public BaseDaoImpl() {
		// 得到泛型化超类
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];

	}

	public void saveEntity(T t) {
		sf.getCurrentSession().save(t);
	}

	public void saveOrUpdateEntity(T t) {
		sf.getCurrentSession().saveOrUpdate(t);
	}

	public void deleteEntity(T t) {
		sf.getCurrentSession().delete(t);
	}

	public void updateEntity(T t) {
		sf.getCurrentSession().update(t);
	}

	public void batchEntityBySQL(String hql, Object... objects) {
		Query q = sf.getCurrentSession().createQuery(hql);
		for (int i = 0; i < objects.length; i++) {
			q.setParameter(i, objects[i]);
		}
		q.executeUpdate();
	}

	public T getEntity(Integer id) {
		return (T) sf.getCurrentSession().get(clazz, id);
	}

	public List<T> findEntityByHQL(String hql, Object... objects) {
		Query q = sf.getCurrentSession().createQuery(hql);
		for (int i = 0; i < objects.length; i++) {
			q.setParameter(i, objects[i]);
		}
		return q.list();
	}

}
