package com.xzit.hms.service.mediInfo.impl;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.mediinfo.impl.MediInfoDao;
import com.xzit.hms.service.mediInfo.mediInfoService;

public class mediInfoServiceImpl implements mediInfoService{

	private MediInfoDao mediinfoDao=new MediInfoDao();
	
	public void save(MediInfo mediinfo) {
		//参数的校验
		/*if(mediinfo!=null){
			if (mediinfo.getMNo() != null && mediinfo.getMName() != null && mediinfo.getMType() != null
					&& mediinfo.getMCostprice() != null&& mediinfo.getMPrice() != null&& mediinfo.getMCount() != null
					&& mediinfo.getMProduce() != null&& mediinfo.getMLotno() != null) {			
			}
		}*/
		System.out.println(mediinfo.toString());
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

	@Override
	public void delete(MediInfo mediinfo) {
		mediinfoDao.deleteEntity(mediinfo);
	}

	@Override
	public MediInfo getMediInfoById(Integer id) {
		// TODO Auto-generated method stub
		return mediinfoDao.getEntity(id);
	}

	@Override
	public void updateMediInfo(MediInfo mediinfo) {
		mediinfoDao.updateEntity(mediinfo);
	}

}
