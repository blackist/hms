package com.xzit.hms.service.medilist;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediList;
import com.xzit.hms.bean.page.PageBean;

public interface medilistService {
	public void save();

	public MediList getMedilist(MediList medilist);

	public PageBean<Map<String, Object>> queryMedilist(int pagecode, int pagesize, String queryStr);
}
