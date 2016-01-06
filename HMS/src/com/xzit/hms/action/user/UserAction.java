/**  
* @Title: UserAction.java <br>
* @Package com.xzit.hms.action.user <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午7:44:06 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.action.user;

import javax.annotation.Resource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.service.user.UserService;

/**
 * @ClassName: UserAction <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午7:44:06 <br>
 * @version V1.0 <br>
 */
@SuppressWarnings("serial")
@Namespace("/user")
public class UserAction extends BaseAction<User> {

	private UserService userService;
	
	private User user = new User();

	@Action(value = "/test", results = { @Result(name = "success", location = "/WEB-INF/jsp/user/user-index.jsp") })
	public String test() {
		userService.test();
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
