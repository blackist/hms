/**  
* @Title: UserServiceImpl.java <br>
* @Package com.xzit.hms.service.user.impl <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:44:56 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.service.user.impl;

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
	public void save() {
		User user = new User();
		user.setPassword("123");
		user.setUserName("s");
		user.setUserRole("2");
		userDao.saveEntity(user);
	}

	@Override
	public User getUser(User user) {
		Object[] params = {user.getUserName(),user.getPassword()};
		User user0 = null;
		if(userDao.findEntityByHQL("from User u where u.userName=? and u.password=?", params).get(0) != null) {
			user0 = userDao.findEntityByHQL("from User u where u.userName=? and u.password=?", params).get(0);
		}
		return user0;
	}
}
