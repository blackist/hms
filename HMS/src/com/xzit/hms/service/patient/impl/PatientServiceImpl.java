package com.xzit.hms.service.patient.impl;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.dao.patient.PatientDao;
import com.xzit.hms.service.patient.PatientService;

public class PatientServiceImpl implements PatientService{
	private PatientDao patientDao = new PatientDao();
	
	@Override
	public Patient getPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<Map<String, Object>> queryPatients(int pagecode,
			int pagesize, String queryStr) {
		// TODO Auto-generated method stub
		return patientDao.queryPatients(pagecode, pagesize, queryStr);
	}
	
}
