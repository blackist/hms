package com.xzit.hms.service.inpatient.impl;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.inpatient.impl.InpatientDao;
import com.xzit.hms.service.inpatient.InpatientService;
public class InpatientServiceImpl implements InpatientService {
	private InpatientDao inpatientDao = new InpatientDao();

	
	@Override
	public PageBean<Map<String, Object>> findInpatient(Integer pagecode,
			Integer pagesize, String condidtions) {
		return inpatientDao.findInpatient(pagecode,pagesize,condidtions);
	}
}
