package com.xzit.hms.action.inhospitalcost;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.inhospital.InhospitalCost;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.service.inhospital.InHospitalCostService;
import com.xzit.hms.service.inhospital.impl.InHospitalCostServiceImpl;

/**
 * 
 * @ClassName: InHospitalCostAction
 * @Description: TODO
 * @author shen.
 * @date 2016年1月20日 下午4:02:36
 *
 */
@Namespace("/inhospitalcost")
public class InHospitalCostAction extends BaseAction<InhospitalCost> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 545309947567610296L;

	/**
	 * InHospitalCostService
	 */
	private InHospitalCostService inHospcostService = new InHospitalCostServiceImpl();
	
	/**
	 * InhospitalCost
	 */
	private InhospitalCost inHospCost = new InhospitalCost();

	private String conditions;
	private int pagecode;
	private PageBean<Map<String, Object>> pb;
	private Map<String, Object> costOrder;

	/**
	 * 
	 * @Title: getInHosCost 
	 * @Description: TODO
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@Action(value = "getinhosCost", results = { @Result(name = "success", location = "/WEB-INF/jsp/inhospital/inhospitalcost.jsp") })
	public String getInHosCost() {
		return SUCCESS;
	}

	/**
	 * 
	 * @Title: findInHosCost 
	 * @Description: TODO
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@Action(value = "findinhosCost", results = { @Result(name = "success", location = "/WEB-INF/jsp/inhospital/findinhospcost.jsp") })
	public String findInHosCost() {
		if (pagecode == 0) {
			pagecode = 1;
		}
		int pagesize = 8;
		if (conditions == null || conditions.trim().isEmpty()) {
			conditions = "";
		}
		pb = inHospcostService.findCost(pagecode,
				pagesize, conditions);
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: getAddPage 
	 * @Description: TODO
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@Action(value = "getaddpage", results = { @Result(name = "success", location = "/WEB-INF/jsp/inhospital/addcostlist.jsp") })
	public String getAddPage(){
		if (pagecode == 0) {
			pagecode = 1;
		}
		int pagesize = 8;
		pb = inHospcostService.findPatient(pagecode,pagesize);
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: addCost 
	 * @Description: TODO
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@Action(value="addcost",results={ @Result(name = "success", location = "/WEB-INF/jsp/inhospital/costorder.jsp") })
	public String addCost(){
		costOrder = inHospcostService.addCost(inHospCost.getPNo(),inHospCost.getBNo(),inHospCost.getMNo());
		System.out.println(costOrder.toString());
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: deleteOrder 
	 * @Description: TODO
	 * @param @return   
	 * @return String    
	 * @throws
	 */
	@Action(value="deleteorder",results={ @Result(name = "success",type="redirectAction" ,location = "findinhosCost") })
	public String deleteOrder(){
		inHospcostService.deleteOrder(inHospCost);
		return SUCCESS;
	}

	public PageBean<Map<String, Object>> getPb() {
		return pb;
	}

	public void setPb(PageBean<Map<String, Object>> pb) {
		this.pb = pb;
	}

	public InhospitalCost getModel() {
		return inHospCost;
	}

	public int getPagecode() {
		return pagecode;
	}

	public void setPagecode(int pagecode) {
		this.pagecode = pagecode;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	
	public Map<String, Object> getCostOrder() {
		return costOrder;
	}

	public void setCostOrder(Map<String, Object> costOrder) {
		this.costOrder = costOrder;
	}
}
