/**  
 * @Title: RoleDao.java
 * @Package com.xzit.hms.dao.role.impl
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月19日 下午4:46:33
 * @version V1.0  
 */
package com.xzit.hms.dao.role.impl;

import java.util.List;

import com.xzit.hms.bean.role.Role;
import com.xzit.hms.dao.impl.BaseDaoImpl;

/**
 * @ClassName: RoleDao
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月19日 下午4:46:33
 */
public class RoleDao extends BaseDaoImpl<Role> {

	@SuppressWarnings("unchecked")
	public List<Role> getAllRoles() {
		List<Role> roleList = null;
		String hql = "from Role";
		roleList = (List<Role>) session.createQuery(hql).list();
		return roleList;
	}
}
