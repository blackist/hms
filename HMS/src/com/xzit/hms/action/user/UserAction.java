/**  
* @Title: UserAction.java <br>
* @Package com.xzit.hms.action.user <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016骞�鏈�鏃�涓嬪崍7:44:06 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.action.user;

import javax.annotation.Resource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.service.user.UserService;

/**
 * @ClassName: UserAction <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @version V1.0 <br>
 */
@SuppressWarnings("serial")
@Namespace("/user")
public class UserAction extends BaseAction<User> {

	@Resource
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


}
