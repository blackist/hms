package com.xzit.hms.action.diag;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.patient.DiagnosticInfo;
import com.xzit.hms.service.diag.DiagService;
import com.xzit.hms.service.diag.impl.DiagServiceImpl;

public class DiagAction extends BaseAction<DiagnosticInfo>{
	
	public DiagService diagService = new DiagServiceImpl();
	
	public DiagnosticInfo diagnosticInfo = new DiagnosticInfo();
	
	@Action(value = "/indexDiag", results = { @Result(name = "success", location = "/WEB-INF/jsp/diag/diag-index.jsp") })
	public String indexDiag() {
		return SUCCESS;
	}
	
	@Action(value = "/saveDiag", results = { @Result(name = "success", location = "/WEB-INF/jsp/dig/diag-index.jsp") })
	public String test() {
		diagService.save();
		return SUCCESS;
	}
	
	public DiagService getDiagService() {
		return diagService;
	}
	public void setDiagService(DiagService diagService) {
		this.diagService = diagService;
	}
	@Override
	public DiagnosticInfo getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
