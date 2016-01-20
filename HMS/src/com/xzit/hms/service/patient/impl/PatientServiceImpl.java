package com.xzit.hms.service.patient.impl;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.dao.patient.PatientDao;
import com.xzit.hms.service.patient.PatientService;

public class PatientServiceImpl implements PatientService{
	private PatientDao patientDao = new PatientDao();
	
	public void save(Patient patient) {
		// 对信息保存的判断，为空则不能保存
		patientDao.saveEntity(patient);
			
	}
	
	@Override
	public Patient getPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<Map<String, Object>> queryPatients(int pagecode,
			int pagesize, String queryPtr) {
		// TODO Auto-generated method stub
		if(queryPtr==null){
			queryPtr="";
		}
		return patientDao.queryPatients(pagecode, pagesize, queryPtr);
	}
	
}
