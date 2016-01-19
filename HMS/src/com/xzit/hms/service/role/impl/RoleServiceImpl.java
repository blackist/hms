/**  
 * @Title: RoleServiceImpl.java
 * @Package com.xzit.hms.service.role.impl
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月19日 下午4:52:03
 * @version V1.0  
 */
package com.xzit.hms.service.role.impl;

import java.util.List;

import com.xzit.hms.bean.role.Role;
import com.xzit.hms.dao.role.impl.RoleDao;
import com.xzit.hms.service.role.RoleService;

/**
 * @ClassName: RoleServiceImpl
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月19日 下午4:52:03
 */
public class RoleServiceImpl implements RoleService {

	private RoleDao roleDao = new RoleDao();

	@Override
	public List<Role> getAllRoles() {
		return roleDao.getAllRoles();
	}

}
