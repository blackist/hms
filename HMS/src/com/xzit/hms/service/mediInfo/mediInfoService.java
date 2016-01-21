package com.xzit.hms.service.mediInfo;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;

public interface mediInfoService {
	public void save(MediInfo mediinfo);

	public void delete(MediInfo mediinfo);

	public MediInfo getMediInfoById(Integer id);


	public void updateMediInfo(MediInfo mediinfo);

	public MediInfo getMediInfo(MediInfo mediinfo);

	public PageBean<Map<String, Object>> queryMediinfo(int pagecode,
			int pagesize, String queryStr);
}
