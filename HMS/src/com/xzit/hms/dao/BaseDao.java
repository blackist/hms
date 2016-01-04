/**  
* @Title: BaseDao.java <br>
* @Package com.xzit.hms.dao <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:29:46 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.dao;

import java.util.List;

/**
 * @ClassName: BaseDao <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午9:29:46 <br>
 * @version V1.0 <br>
 */
public interface BaseDao<T> {

	// 写操作
	public void saveEntity(T t);

	public void saveOrUpdateEntity(T t);

	public void deleteEntity(T t);

	public void updateEntity(T t);
	
	public void batchEntityBySQL(String hql, Object... objects);

	// 读操作
	public T getEntity(Integer id);

	public List<T> findEntityByHQL(String hql, Object... objects);
}
