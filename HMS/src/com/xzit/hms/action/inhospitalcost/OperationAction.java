/**  
 * @Title: OperationAction.java
 * @Package com.xzit.hms.action.operation
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 上午10:48:33
 * @version V1.0  
 */
package com.xzit.hms.action.inhospitalcost;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.inhospital.Operation;

/**
 * @ClassName: OperationAction
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 上午10:48:33
 */
@Namespace("/operation")
public class OperationAction extends BaseAction<Operation> {

	private static final long serialVersionUID = 4358476360057846940L;

	@Action(value = "/indexOper", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/inhospital/operation/operation-index.jsp") })
	public String indexOper() {
		return SUCCESS;
	}

	@Override
	public Operation getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
