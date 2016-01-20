package com.xzit.hms.action.mediInfo;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.service.mediInfo.mediInfoService;
import com.xzit.hms.service.mediInfo.impl.mediInfoServiceImpl;

@SuppressWarnings("serial")
public class MediInfoAction extends BaseAction<MediInfo>{
	private mediInfoService mediinfoservice=new mediInfoServiceImpl();
	
	private MediInfo mediinfo=new MediInfo();
	
	private PageBean<Map<String, Object>> pb;
	
	private String queryStr;
	
	@Action(value = "/indexMediInfo", results = { @Result(name = "success", location = "/WEB-INF/jsp/mediInfo/mediInfo-index.jsp") })
	public String indexMediInfo() {
		return SUCCESS;
	}
	@Action(value = "/queryMediInfo", results = { @Result(name = "success", location = "/WEB-INF/jsp/mediInfo/mediInfo-query.jsp") })
	public String queryMediInfo() {
		pb = mediinfoservice.queryMediinfo(getPagecode(), getPagesize(), queryStr);
		System.out.println(pb.toString());
		return SUCCESS;
	}
	public mediInfoService getMediinfoservice() {
		return mediinfoservice;
	}
	public void setMediinfoservice(mediInfoService mediinfoservice) {
		this.mediinfoservice = mediinfoservice;
	}
	public MediInfo getMediinfo() {
		return mediinfo;
	}
	public void setMediinfo(MediInfo mediinfo) {
		this.mediinfo = mediinfo;
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
	@Override
	public MediInfo getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
