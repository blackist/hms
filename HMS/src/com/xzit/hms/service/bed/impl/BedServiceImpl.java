package com.xzit.hms.service.bed.impl;

import java.util.Map;

import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.bed.impl.BedDao;
import com.xzit.hms.service.bed.BedService;

public class BedServiceImpl implements BedService {
	private BedDao bedDao = new BedDao();

	@Override
	public PageBean<Map<String, Object>> findBed(Integer pagecode,Integer pagesize,String condidtions) {
		return bedDao.findBed(pagecode,pagesize,condidtions);
	}
	
}
