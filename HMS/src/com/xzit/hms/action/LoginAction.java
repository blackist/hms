/**  
 * @Title: LoginAction.java
 * @Package com.xzit.hms.action
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月18日 下午5:46:12
 * @version V1.0  
 */
package com.xzit.hms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.bean.user.User;
import com.xzit.hms.service.user.UserService;
import com.xzit.hms.service.user.impl.UserServiceImpl;

/**
 * @ClassName: LoginAction
 * @Description: TODO LoginAction
 * @author Mr.Black
 * @date 2016年1月18日 下午5:46:12
 */
@Namespace("/login")
public class LoginAction extends BaseAction<User> {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 7202601287794896833L;

	private UserService userService = new UserServiceImpl();

	private User user = new User();

	@Action(value = "", results = { @Result(name = "fail", location = "/login.html"),
			@Result(name = "success", location = "index.action", type = "redirect") })
	public String login() {
		if (user.getUserName() != null) {
			userService.getUser(user);
			return SUCCESS;
		}
		return "fail";
	}

	@Override
	public User getModel() {
		return user;
	}

}
