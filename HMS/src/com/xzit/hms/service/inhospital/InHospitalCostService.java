package com.xzit.hms.service.inhospital;

import java.util.Map;

import com.xzit.hms.bean.inhospital.InhospitalCost;
import com.xzit.hms.bean.page.PageBean;

public interface InHospitalCostService {
	
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions);
	
	public PageBean<Map<String, Object>> findPatient(Integer pagecode,Integer pagesize);
	
	public Map<String, Object> addCost(Integer pno,Integer bno,Integer mno);
	
	public void deleteOrder(InhospitalCost inhospitalcost);
}
