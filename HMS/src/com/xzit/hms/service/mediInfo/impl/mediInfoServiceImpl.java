package com.xzit.hms.service.mediInfo.impl;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.mediinfo.impl.MediInfoDao;
import com.xzit.hms.service.mediInfo.mediInfoService;

/**
 * 
 * @ClassName: mediInfoServiceImpl
 * @Description: TODO
 * @author QinChong
 * @date 2016年1月21日 下午1:47:01
 */
public class mediInfoServiceImpl implements mediInfoService {

	private MediInfoDao mediinfoDao = new MediInfoDao();

	/**
	 * save
	 */
	public void save(MediInfo mediinfo) {
		// 参数的校验
		/*
		 * if(mediinfo!=null){ if (mediinfo.getMNo() != null &&
		 * mediinfo.getMName() != null && mediinfo.getMType() != null &&
		 * mediinfo.getMCostprice() != null&& mediinfo.getMPrice() != null&&
		 * mediinfo.getMCount() != null && mediinfo.getMProduce() != null&&
		 * mediinfo.getMLotno() != null) { } }
		 */
		System.out.println(mediinfo.toString());
		mediinfoDao.saveEntity(mediinfo);
	}

	@Override
	public MediInfo getMediInfo(MediInfo mediinfo) {
		// TODO Auto-generated method stub

		return null;
	}

	/**
	 * pagebean
	 */
	@Override
	public PageBean<Map<String, Object>> queryMediinfo(int pagecode, int pagesize, String queryStr) {
		if (queryStr == null) {
			queryStr = "";
		}
		return mediinfoDao.queryMediInfo(pagecode, pagesize, queryStr);
	}

	/**
	 * delete
	 */
	@Override
	public void delete(MediInfo mediinfo) {
		mediinfoDao.deleteEntity(mediinfo);
	}

	/**
	 * getMediInfoById
	 */
	@Override
	public MediInfo getMediInfoById(Integer id) {
		// TODO Auto-generated method stub
		return mediinfoDao.getEntity(id);
	}

	/**
	 * updateMediInfo
	 */
	@Override
	public void updateMediInfo(MediInfo mediinfo) {
		mediinfoDao.updateEntity(mediinfo);
	}

}
