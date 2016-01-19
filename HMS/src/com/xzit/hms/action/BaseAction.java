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

import org.apache.struts2.ServletActionContext;

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
@SuppressWarnings({ "rawtypes", "serial" })
public abstract class BaseAction<T> extends ActionSupport implements
		ModelDriven<T> {

	protected Map request;
	protected Map session;
	protected Map application;

	public BaseAction() {
		request = (Map) ServletActionContext.getRequest();
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}
}
