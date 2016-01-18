/**  
 * @Title: MainAction.java
 * @Package com.xzit.hms.action
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月18日 下午4:35:47
 * @version V1.0  
 */
package com.xzit.hms.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @ClassName: MainAction
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月18日 下午4:35:47
 */
public class MainAction extends BaseAction {

	@Action(value = "/index", results = { @Result(name = "success", location = "/WEB-INF/jsp/index.jsp") })
	public String index(){
		return SUCCESS;
	}
	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
