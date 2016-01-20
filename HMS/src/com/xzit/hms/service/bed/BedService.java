package com.xzit.hms.service.bed;

import java.util.Map;

import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.page.PageBean;


public interface BedService {
	public PageBean<Map<String, Object>> findBed(Integer pagecode,Integer pagesize,String condidtions);
}
