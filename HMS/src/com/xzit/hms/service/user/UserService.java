/**  
* @Title: UserService.java <br>
* @Package com.xzit.hms.service.user <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:42:59 <br>
* @version V1.0 <br>
*/ 
package com.xzit.hms.service.user;

import java.util.List;

import com.xzit.hms.bean.user.User;

/**
* @ClassName: UserService <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:42:59 <br>
* @version V1.0  <br>
*/
public interface UserService {
	
	public void save();
	
	public User getUser(User user);
	
	public List<User> queryUsers();
}
