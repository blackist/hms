package com.xzit.hms.service.patient.impl;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.dao.patient.PatientDao;
import com.xzit.hms.service.patient.PatientService;

public class PatientServiceImpl implements PatientService{
	private PatientDao patientDao = new PatientDao();
	
	public void save(Patient patient) {
		// ����Ϣ����
		
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
		//�ж���䣬���������Ϊ�գ���������в�ѯȫ��
		if(queryPtr==null){
			queryPtr="";
		}
		return patientDao.queryPatients(pagecode, pagesize, queryPtr);
	}
	
	@Override
	public Patient getPatientById(Integer no) {
		return patientDao.getEntity(no);
	}

	public void updatePatient(Patient patient){
		patientDao.updateEntity(patient);
	}
	
	public void delete(Patient patient) {
		patientDao.deleteEntity(patient);
	}
	
	public List<Patient> queryAllPatients(){
		return patientDao.findAll();
	}
}
