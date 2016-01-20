package com.xzit.hms.service.mediInfo.impl;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.mediinfo.impl.MediInfoDao;
import com.xzit.hms.service.mediInfo.mediInfoService;

public class mediInfoServiceImpl implements mediInfoService{

	private MediInfoDao mediinfoDao=new MediInfoDao();
	@Override
	public void save() {
		// TODO Auto-generated method stub
		MediInfo mediinfo=new MediInfo();
		mediinfoDao.saveEntity(mediinfo);
	}

	@Override
	public MediInfo getMediInfo(MediInfo mediinfo) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public PageBean<Map<String, Object>> queryMediinfo(int pagecode,
			int pagesize, String queryStr) {
		if(queryStr == null){
			queryStr = "";
		}
		return mediinfoDao.queryMediInfo(pagecode, pagesize, queryStr);
	}

}
