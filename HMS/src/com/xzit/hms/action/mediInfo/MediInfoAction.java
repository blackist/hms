package com.xzit.hms.action.mediInfo;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.service.mediInfo.mediInfoService;
import com.xzit.hms.service.mediInfo.impl.mediInfoServiceImpl;

/**
 * 
 * @ClassName: MediInfoAction
 * @Description: TODO 药库信息
 * @author QinChong
 * @date 2016年1月21日 下午1:35:36
 */
@SuppressWarnings("serial")
public class MediInfoAction extends BaseAction<MediInfo> {
	
	private mediInfoService mediinfoservice = new mediInfoServiceImpl();

	private MediInfo mediinfo = new MediInfo();

	private PageBean<Map<String, Object>> pb;

	/**
	 * queryStr
	 */
	private String queryStr;

	/**
	 * 
	 * @Title: indexMediInfo
	 * @Description: TODO indexMediInfo
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/indexMediInfo", results = { @Result(name = "success", location = "/WEB-INF/jsp/mediInfo/mediInfo-index.jsp") })
	public String indexMediInfo() {
		return SUCCESS;
	}
/**
 * 
 * @Title: queryMediInfo
 * @Description: TODO queryMediInfo
 * @param @return   
 * @return String 
 * @throws
 */
	@Action(value = "/queryMediInfo", results = { @Result(name = "success", location = "/WEB-INF/jsp/mediInfo/mediInfo-query.jsp") })
	public String queryMediInfo() {
		pb = mediinfoservice.queryMediinfo(getPagecode(), getPagesize(),
				queryStr);
		System.out.println(pb.toString());
		return SUCCESS;
	}
/**
 * 
 * @Title: addMediInfo
 * @Description: TODO addMediInfo
 * @param @return   
 * @return String 
 * @throws
 */
	@Action(value = "/addMediInfo", results = { @Result(name = "success", location = "/WEB-INF/jsp/mediInfo/mediInfo-add.jsp") })
	public String addMediInfo() {
		return SUCCESS;
	}
/**
 * 
 * @Title: addMediInfoSubmit
 * @Description: TODO addMediInfoSubmit
 * @param @return   
 * @return String 
 * @throws
 */
	@Action(value = "/addMediInfoSubmit", results = { @Result(name = "success", location = "queryMediInfo.action", type = "redirect") })
	public String addMediInfoSubmit() {
		mediinfoservice.save(mediinfo);
		return SUCCESS;
	}
/**
 * 
 * @Title: deleteMediInfo
 * @Description: TODO deleteMediInfo
 * @param @return   
 * @return String 
 * @throws
 */
	@Action(value = "/deleteMediInfo", results = { @Result(name = "success", location = "queryMediInfo.action", type = "redirect") })
	public String deleteMediInfo() {
		mediinfoservice.delete(mediinfo);
		return SUCCESS;
	}
/**
 * 
 * @Title: updateMediInfo
 * @Description: TODO updateMediInfo
 * @param @return   
 * @return String 
 * @throws
 */
	@Action(value = "/updateMediInfo", results = { @Result(name = "success", location = "/WEB-INF/jsp/mediInfo/mediInfo-update.jsp") })
	public String updateMediInfo() {
		mediinfo = mediinfoservice.getMediInfoById(mediinfo.getMNo());
		return SUCCESS;
	}
/**
 * 
 * @Title: updateMediInfoSubmit
 * @Description: TODO updateMediInfoSubmit
 * @param @return   
 * @return String 
 * @throws
 */
	@Action(value = "/updateMediInfoSubmit", results = { @Result(name = "success", location = "queryMediInfo.action", type = "redirect") })
	public String updateMediInfoSubmit() {
		MediInfo mediinfo = this.mediinfo;
		mediinfoservice.updateMediInfo(mediinfo);
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
/**
 * getModel
 */
	@Override
	public MediInfo getModel() {
		return mediinfo;
	}

}
