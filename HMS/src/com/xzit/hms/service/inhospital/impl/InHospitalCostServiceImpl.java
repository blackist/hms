package com.xzit.hms.service.inhospital.impl;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
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
	
}
