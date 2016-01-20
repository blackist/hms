package com.xzit.hms.service.inhospital.impl;

import java.util.HashMap;
import java.util.Map;

import com.xzit.hms.bean.inhospital.InhospitalCost;
import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.medicine.MediList;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.dao.inhospital.impl.InHostipalCostDao;
import com.xzit.hms.service.inhospital.InHospitalCostService;

public class InHospitalCostServiceImpl implements InHospitalCostService {
	
	private InHostipalCostDao inHospCostDao = new InHostipalCostDao();

	@Override
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions) {
		return inHospCostDao.findCost(pagecode,pagesize,condidtions);
	}

	@Override
	public PageBean<Map<String, Object>> findPatient(Integer pagecode,Integer pagesize) {
		return inHospCostDao.findPatient(pagecode,pagesize);
	}

	@Override
	public Map<String, Object> addCost(Integer pno, Integer bno, Integer mno) {
		Patient patient = inHospCostDao.getPatientByPno(pno);
		Inpatient inpatient = inHospCostDao.getInPatientByPno(pno);
		MediList medilist = inHospCostDao.getMedilistByMno(mno);
		InhospitalCost cost = new InhospitalCost();
		cost.setPNo(pno);
		cost.setBNo(bno);
		cost.setMNo(mno);
		cost.setTotal(inpatient.getYChange()+Integer.parseInt(medilist.getSumprice()));
		inHospCostDao.saveEntity(cost);
		return inHospCostDao.getOrder(pno);
	}

	@Override
	public void deleteOrder(InhospitalCost inhospitalcost) {
		inHospCostDao.deleteEntity(inhospitalcost);
	}
	
}
