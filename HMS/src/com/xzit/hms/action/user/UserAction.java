/**  
* @Title: UserAction.java <br>
* @Package com.xzit.hms.action.user <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016骞�鏈�鏃�涓嬪崍7:44:06 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.action.user;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.service.user.UserService;
import com.xzit.hms.service.user.impl.UserServiceImpl;

/**
 * @ClassName: UserAction <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @version V1.0 <br>
 */
@SuppressWarnings("serial")
@Namespace("/user")
public class UserAction extends BaseAction<User> {

	private UserService userService = new UserServiceImpl();

	private User user = new User();

	@Action(value = "/test", results = { @Result(name = "success", location = "/WEB-INF/jsp/user/user-index.jsp") })
	public String test() {
		userService.save();
		return SUCCESS;
	}

	@Action(value = "/login", results = { @Result(name = "fail", location = "/login.html"),
			@Result(type = "chain", name = "success", location = "index.action")
	})
	public String login() {
		if (user.getUserName() != null) {
			userService.getUser(user);
			return SUCCESS;
		}
		return "fail";
	}

	@Action(value = "/indexUser", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/user/user-index.jsp") })
	public String indexUser() {
		return SUCCESS;
	}

	@Action(value = "/queryUsers", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/user/user-query.jsp") })
	public String queryUsers() {

		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}

	public UserService getUserService() {
		return userService;
	}

}
