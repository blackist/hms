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

@SuppressWarnings("unchecked")
@Namespace("/inhospitalcost")
public class InHospitalCostAction extends BaseAction<InhospitalCost> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 545309947567610296L;

	private InHospitalCostService inHospcostService = new InHospitalCostServiceImpl();

	private InhospitalCost inHospCost = new InhospitalCost();

	private String condidtions;
	private int pagecode;
	private PageBean<Map<String, Object>> pb;

	@Action(value = "getinhosCost", results = { @Result(name = "success", location = "/WEB-INF/jsp/inhospital/inhospitalcost.jsp") })
	public String getInHosCost() {
		return SUCCESS;
	}

	@Action(value = "findinhosCost", results = { @Result(name = "success", location = "/WEB-INF/jsp/inhospital/findinhospcost.jsp") })
	public String findInHosCost() {
		if (pagecode == 0) {
			pagecode = 1;
		}
		int pagesize = 8;
		if (condidtions == null || condidtions.trim().isEmpty()) {
			condidtions = "";
		}
		pb = inHospcostService.findCost(pagecode,
				pagesize, condidtions);
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

	public String getCondidtions() {
		return condidtions;
	}

	public void setCondidtions(String condidtions) {
		this.condidtions = condidtions;
	}
}
