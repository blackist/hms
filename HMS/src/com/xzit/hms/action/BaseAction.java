/**  
* @Title: BaseAction.java <br>
* @Package com.xzit.hms.action <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午7:17:03 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @ClassName: BaseAction <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午7:17:03 <br>
 * @version V1.0 <br>
 */
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 1655735561834309430L;
	
	
	protected Map<String, Object> request;
	protected Map<String, Object> session;
	protected Map<String, Object> application;

	@SuppressWarnings("unchecked")
	public BaseAction() {
		request = (Map<String, Object>) ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}
}
