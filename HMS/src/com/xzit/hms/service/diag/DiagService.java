package com.xzit.hms.service.diag;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.DiagnosticInfo;

public interface DiagService {
	public void save(DiagnosticInfo diagnosticInfo);
	public DiagnosticInfo getDiagnosticInfo(DiagnosticInfo diagnosticInfo);
	
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions);

	public PageBean<Map<String, Object>> queryPay(Integer pagecode,Integer pagesize,String condidtions);
	
	public List<MediInfo> getAllMedi();
	
	public MediInfo getMediById(Integer id);
	
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize);
}
