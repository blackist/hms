/**  
* @Title: BaseServiceImpl.java <br>
* @Package com.xzit.hms.service.impl <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:20:03 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.service.impl;

import java.util.List;

import com.xzit.hms.dao.BaseDao;
import com.xzit.hms.service.BaseService;

/**
 * @ClassName: BaseServiceImpl <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午9:20:03 <br>
 * @version V1.0 <br>
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	private BaseDao<T> baseDao;

	public void saveEntity(T t) {
		baseDao.saveEntity(t);
	}

	public void saveOrUpdateEntity(T t) {
		baseDao.saveOrUpdateEntity(t);
	}

	public void deleteEntity(T t) {
		baseDao.deleteEntity(t);
	}

	public void updateEntity(T t) {
		baseDao.updateEntity(t);
	}

	public void batchEntityBySQL(String hql, Object... objects) {
		baseDao.batchEntityBySQL(hql, objects);
	}

	public T getEntity(Integer id) {
		return baseDao.getEntity(id);
	}

	public List<T> findEntityByHQL(String hql, Object... objects) {
		return baseDao.findEntityByHQL(hql, objects);
	}

}
