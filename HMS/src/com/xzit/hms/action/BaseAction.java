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

import org.apache.struts2.interceptor.SessionAware;

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
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>,SessionAware {

	protected Map request;
	Map session;
	protected Map application;

	private Integer pagecode;
	private Integer pagesize;

	public BaseAction() {
		request = (Map) ActionContext.getContext().get("request");
		application = ActionContext.getContext().getApplication();
	}
	
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}

	public int getPagecode() {
		if (pagecode == null) {
			pagecode = 1;
		}
		return pagecode;
	}

	public void setPagecode(int pagecode) {
		this.pagecode = pagecode;
	}

	public Integer getPagesize() {
		if (pagesize == null) {
			pagesize = 3;
		}
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
}
