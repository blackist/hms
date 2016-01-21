/**  
* @Title: UserAction.java <br>
* @Package com.xzit.hms.action.user <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016骞�鏈�鏃�涓嬪崍7:44:06 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.action.user;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.role.Role;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.service.role.RoleService;
import com.xzit.hms.service.role.impl.RoleServiceImpl;
import com.xzit.hms.service.user.UserService;
import com.xzit.hms.service.user.impl.UserServiceImpl;

/**
 * @ClassName: UserAction <br>
 * @Description: TODO UserAction<br>
 * @author Mr.Black <br>
 * @version V1.0 <br>
 */
@SuppressWarnings("serial")
@Namespace("/user")
public class UserAction extends BaseAction<User> {

	private UserService userService = new UserServiceImpl();

	private RoleService roleService = new RoleServiceImpl();

	private User user = new User();

	private PageBean<Map<String, Object>> pb;

	private String queryStr;

	private List<Role> roleList;

	@Action(value = "/indexUser", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/user/user-index.jsp") })
	public String indexUser() {
		return SUCCESS;
	}

	/**
	 * @Title: queryUsers
	 * @Description: TODO queryUsers
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/queryUsers", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/user/user-query.jsp") })
	public String queryUsers() {
		pb = userService.queryUsers(getPagecode(), getPagesize(), queryStr);
		System.out.println(pb.toString());
		return SUCCESS;
	}

	/**
	 * @Title: addUser
	 * @Description: TODO addUser
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/addUser", results = { @Result(name = "success", location = "/WEB-INF/jsp/user/user-add.jsp") })
	public String addUser() {
		roleList = roleService.getAllRoles();
		return SUCCESS;
	}

	/**
	 * @Title: addUserSubmit
	 * @Description: TODO addUserSubmit
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/addUserSubmit", results = {
			@Result(name = "success", location = "queryUsers.action", type = "redirect") })
	public String addUserSubmit() {
		userService.save(user);
		return SUCCESS;
	}

	/**
	 * @Title: deleteUser
	 * @Description: TODO deleteUser
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/deleteUser", results = {
			@Result(name = "success", location = "queryUsers.action", type = "redirect") })
	public String deleteUser() {
		userService.delete(user);
		return SUCCESS;
	}

	/**
	 * @Title: updateUser
	 * @Description: TODO updateUser
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/updateUser", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/user/user-update.jsp") })
	public String updateUser() {
		roleList = roleService.getAllRoles();
		user = userService.getUserById(user.getUserId());
		return SUCCESS;
	}

	/**
	 * @Title: updateUserSubmit
	 * @Description: TODO updateUserSubmit
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/updateUserSubmit", results = {
			@Result(name = "success", location = "queryUsers.action", type = "redirect") })
	public String updateUserSubmit() {
		User user = this.user;
		userService.updateUser(user);
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

	public String getQueryStr() {
		return queryStr;
	}

	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

}
