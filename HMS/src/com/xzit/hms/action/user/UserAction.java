/**  
* @Title: UserAction.java <br>
* @Package com.xzit.hms.action.user <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午7:44:06 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.action.user;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;

/**
 * @ClassName: UserAction <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午7:44:06 <br>
 * @version V1.0 <br>
 */
@Namespace("/user")
public class UserAction extends BaseAction<String> {

	/**
	 * @Fields serialVersionUID : TODO <br>
	 */
	private static final long serialVersionUID = 2682293628861770827L;

	@Action(value = "/test", results = { @Result(name = "success", location = "/WEB-INF/jsp/user/user-index.jsp") })
	public String test() {
		return SUCCESS;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
