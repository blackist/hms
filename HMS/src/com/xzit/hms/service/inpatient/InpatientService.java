package com.xzit.hms.service.inpatient;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;

public interface InpatientService {
	public PageBean<Map<String, Object>> findInpatient(Integer pagecode,Integer pagesize,String condidtions);
}

