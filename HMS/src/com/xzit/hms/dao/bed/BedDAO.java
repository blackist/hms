package com.xzit.hms.dao.bed;

import java.util.List;





import org.hibernate.Query;
import org.hibernate.Session;

import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.dao.BaseDao;
import com.xzit.hms.dao.HibernateSessionFactory;

public abstract  class BedDAO<T> implements BaseDao<T>{

	public List<Bed> findAll() {
		
		try {
			//Session session= getSession();
			String queryString = "from Goods";
			//Query queryObject = session.createQuery(queryString);
			
			//return queryObject.list();
			
		} catch (RuntimeException re) {
		
			throw re;
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return null;
	}

}
