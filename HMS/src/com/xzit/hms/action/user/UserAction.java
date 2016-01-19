/**  
* @Title: UserAction.java <br>
* @Package com.xzit.hms.action.user <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016骞�鏈�鏃�涓嬪崍7:44:06 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.action.user;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.page.PageBean;
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

	private PageBean<Map<String, Object>> pb;

	@Action(value = "/indexUser", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/user/user-index.jsp") })
	public String indexUser() {
		return SUCCESS;
	}

	@Action(value = "/queryUsers", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/user/user-query.jsp") })
	public String queryUsers() {
		pb = userService.queryUsers(1, 3, "");
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}

	public UserService getUserService() {
		return userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public PageBean<Map<String, Object>> getPb() {
		return pb;
	}

	public void setPb(PageBean<Map<String, Object>> pb) {
		this.pb = pb;
	}

}
