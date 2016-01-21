package com.xzit.hms.service.bed.impl;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.bed.impl.BedDao;
import com.xzit.hms.service.bed.BedService;
/**
 * 
* @ClassName: BedServiceImpl
* @Description: TODO
* @author 姜俊杰
* @date 2016年1月21日 下午1:49:39
*
 */
public class BedServiceImpl implements BedService {
	private BedDao bedDao = new BedDao();

	@Override
	public PageBean<Map<String, Object>> findBed(Integer pagecode,Integer pagesize,String condidtions) {
		return bedDao.findBed(pagecode,pagesize,condidtions);
	}

	@Override
	public List<Bed> findAll() {
		return bedDao.findAll();
	}

	@Override
	public void addbed(Bed bed) {
		bedDao.saveEntity(bed);
		
	}

	public void delete(Bed bed) {
		bedDao.deleteEntity(bed);
	}

	@Override
	public Bed getBedById(Integer bNo) {
		return bedDao.getEntity(bNo);
	}


	public void updateBed(Bed bed) {
	   bedDao.updateEntity(bed);
	}
	
}
