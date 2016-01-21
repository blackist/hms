package com.xzit.hms.service.medilist.impl;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediList;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.medilist.impl.medilistDao;
import com.xzit.hms.service.medilist.medilistService;

/**
 * 
 * @ClassName: medilistServiceImpl
 * @Description: TODO
 * @author QinChong
 * @date 2016年1月21日 下午1:49:11
 */
public class medilistServiceImpl implements medilistService {
	private medilistDao medilistdao = new medilistDao();

	/**
	 * save
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		MediList medilist = new MediList();
		medilistdao.saveEntity(medilist);
	}

	/**
	 * getMedilist
	 */
	@Override
	public MediList getMedilist(MediList medilist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<Map<String, Object>> queryMedilist(int pagecode, int pagesize, String queryStr) {
		if (queryStr == null) {
			queryStr = "";
		}
		return medilistdao.queryMedilist(pagecode, pagesize, queryStr);
	}

	/**
	 * delete
	 */
	@Override
	public void delete(MediList medilist) {
		medilistdao.deleteEntity(medilist);
	}

}
