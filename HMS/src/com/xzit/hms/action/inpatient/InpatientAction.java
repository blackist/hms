package com.xzit.hms.action.inpatient;

import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.service.inpatient.InpatientService;
import com.xzit.hms.service.inpatient.impl.InpatientServiceImpl;
@SuppressWarnings("serial")
@Namespace("/inhospital")
public class InpatientAction extends BaseAction<Inpatient>{
     private Inpatient inpatient= new Inpatient();
     private InpatientService inpatientService = new InpatientServiceImpl();

		private String condidtions;
		private int pagecode;
		private PageBean<Map<String, Object>> pb;
   
	@Action(value = "/indexinHospital", results = { @Result(name = "success", location = "/WEB-INF/jsp/inpatient/inpatient-index.jsp") })
		public String indexHospital() {
			return SUCCESS;
		}
		@Action(value = "/queryinpatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/inpatient/inpatient-query.jsp") })
		public String queryinpatient() {
			if (pagecode == 0) {
				pagecode = 1;
			}
			int pagesize = 8;
			if (condidtions == null || condidtions.trim().isEmpty()) {
				condidtions = "";
			}
			pb = inpatientService.findInpatient(pagecode,
					pagesize, condidtions);
			System.out.println(pb.getBeanlist().size());
			
			return SUCCESS;

		}
 	@Override
	public Inpatient getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	public Inpatient getInpatient() {
		return inpatient;
	}
	public void setInpatient(Inpatient inpatient) {
		this.inpatient = inpatient;
	}
	public InpatientService getInpatientService() {
		return inpatientService;
	}
	public void setInpatientService(InpatientService inpatientService) {
		this.inpatientService = inpatientService;
	}
	public String getCondidtions() {
		return condidtions;
	}
	public void setCondidtions(String condidtions) {
		this.condidtions = condidtions;
	}
	public int getPagecode() {
		return pagecode;
	}
	public void setPagecode(int pagecode) {
		this.pagecode = pagecode;
	}
	public PageBean<Map<String, Object>> getPb() {
		return pb;
	}
	public void setPb(PageBean<Map<String, Object>> pb) {
		this.pb = pb;
	}

}
