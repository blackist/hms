/**  
* @Title: UserServiceImpl.java <br>
* @Package com.xzit.hms.service.user.impl <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:44:56 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.service.user.impl;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.dao.user.impl.UserDao;
import com.xzit.hms.service.user.UserService;

/**
 * @ClassName: UserServiceImpl <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午9:44:56 <br>
 * @version V1.0 <br>
 */
public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDao();

	@Override
	public void save(User user) {
		// 参数校验
		if (user != null) {
			if (user.getUserName() != null && user.getPassword() != null && user.getUserRole() != null) {
				userDao.saveEntity(user);
			}
		}
	}

	@Override
	public User getUser(User user) {
		Object[] params = { user.getUserName(), user.getPassword() };
		User user0 = null;
		if (userDao.findEntityByHQL("from User u where u.userName=? and u.password=?", params).get(0) != null) {
			user0 = userDao.findEntityByHQL("from User u where u.userName=? and u.password=?", params).get(0);
		}
		return user0;
	}

	/**
	 * queryUsers
	 */
	@Override
	public PageBean<Map<String, Object>> queryUsers(int pagecode, int pagesize, String queryStr) {
		// 查询参数校验
		if (queryStr == null) {
			queryStr = "";
		}
		return userDao.queryUsers(pagecode, pagesize, queryStr);
	}

	@Override
	public void delete(User user) {
		userDao.deleteEntity(user);
	}

}
