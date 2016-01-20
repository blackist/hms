package com.xzit.hms.action.diag;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.DiagnosticInfo;
import com.xzit.hms.service.diag.DiagService;
import com.xzit.hms.service.diag.impl.DiagServiceImpl;
import com.xzit.hms.service.mediInfo.mediInfoService;
import com.xzit.hms.service.mediInfo.impl.mediInfoServiceImpl;

@Namespace("/diag")
public class DiagAction extends BaseAction<DiagnosticInfo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -575355136431448564L;

	private DiagService diagService = new DiagServiceImpl();

	private mediInfoService medService = new mediInfoServiceImpl();

	private DiagnosticInfo diagnosticInfo = new DiagnosticInfo();

	private MediInfo mediInfo = new MediInfo();

	private String condidtions;
	
	private int pagecode;
	
	private PageBean<Map<String, Object>> pb;

	private List<MediInfo> mediList;

	@Action(value = "/addDiag", results = { @Result(name = "success", location = "/WEB-INF/jsp/diag/diag-add.jsp") })
	public String addDiag() {
		return SUCCESS;
	}

	@Action(value = "/saveDiag", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/diag/diag-pay.jsp"),
			@Result(name = "input", location = "/WEB-INF/jsp/diag/diag-pay.jsp") })
	public String saveDiag() {

		diagService.save(diagnosticInfo);
		int pagesize = 8;
		if (condidtions == null || condidtions.trim().isEmpty()) {
			condidtions = "";
		}
		pb = diagService.queryPay(pagecode, pagesize, condidtions);
		return SUCCESS;
	}

	@Action(value = "/queryDiag", results = { @Result(name = "success", location = "/WEB-INF/jsp/diag/diag-query.jsp") })
	public String queryDiag() {
		System.out.println(diagnosticInfo.getDName());
		if (pagecode == 0) {
			pagecode = 1;
		}
		int pagesize = 8;
		if (condidtions == null || condidtions.trim().isEmpty()) {
			condidtions = "";
		}
		pb = diagService.findCost(pagecode, pagesize, condidtions);
		return SUCCESS;

	}

	@Action(value = "/updateDiag", results = { @Result(name = "success", location = "/WEB-INF/jsp/diag/diag-update.jsp") })
	public String updateDiag() {
		System.out.println(mediInfo.getMNo());
		mediList = diagService.getAllMedi();
		mediInfo = diagService.getMediById(mediInfo.getMNo());
		return SUCCESS;
	}
	
	@Action(value = "getaddpage", results = { @Result(name = "success", location = "/WEB-INF/jsp/inhospital/addcostlist.jsp") })
	public String getAddPage(){
		if (pagecode == 0) {
			pagecode = 1;
		}
		int pagesize = 8;
		pb = diagService.findCost(pagecode,pagesize);
		return SUCCESS;
	}

	public MediInfo getMediInfo() {
		return mediInfo;
	}

	public void setMediInfo(MediInfo mediInfo) {
		this.mediInfo = mediInfo;
	}

	public List<MediInfo> getMediList() {
		return mediList;
	}

	public void setMediList(List<MediInfo> mediList) {
		this.mediList = mediList;
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

	public DiagService getDiagService() {
		return diagService;
	}

	public void setDiagService(DiagService diagService) {
		this.diagService = diagService;
	}

	public DiagnosticInfo getDiagnosticInfo() {
		return diagnosticInfo;
	}

	public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}

	@Override
	public DiagnosticInfo getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
