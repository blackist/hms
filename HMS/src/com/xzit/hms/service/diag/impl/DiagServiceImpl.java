package com.xzit.hms.service.diag.impl;
import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.DiagnosticInfo;
import com.xzit.hms.dao.diag.impl.DiagDao;
import com.xzit.hms.service.diag.DiagService;

public class DiagServiceImpl implements DiagService{
	
	private DiagDao diagDao = new DiagDao();
	
	@Override
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions) {
		return diagDao.findCost(pagecode,pagesize,condidtions);
	}

	@Override
	public PageBean<Map<String, Object>> queryPay(Integer pagecode,Integer pagesize, String condidtions) {
		// TODO Auto-generated method stub
		return diagDao.queryPay(pagecode,pagesize,condidtions);
	}

	@Override
	public void save(DiagnosticInfo diagnosticInfo) {
		diagDao.saveEntity(diagnosticInfo);
		
	}

	@Override
	public DiagnosticInfo getDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MediInfo> getAllMedi() {
		// TODO Auto-generated method stub
		return diagDao.getAllMedi();
	}

	@Override
	public MediInfo getMediById(Integer id) {
		// TODO Auto-generated method stub
		return diagDao.getById(id);
	}

	@Override
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize) {
		// TODO Auto-generated method stub
		return diagDao.findCost(pagecode, pagesize, null);
	}

	
}