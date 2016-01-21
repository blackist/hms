package com.xzit.hms.service.patient.impl;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.dao.patient.PatientDao;
import com.xzit.hms.service.patient.PatientService;

public class PatientServiceImpl implements PatientService{
	private PatientDao patientDao = new PatientDao();
	/**
	 * 调用patientDao方法中的saveEntity方法 保存新增病人（挂号）
	 */
	public void save(Patient patient) {
		// 锟斤拷锟斤拷息锟斤拷锟斤拷
		
		patientDao.saveEntity(patient);	
	}
	
	@Override
	public Patient getPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 分页函数的调用
	 */
	
	@Override
	public PageBean<Map<String, Object>> queryPatients(int pagecode,
			int pagesize, String queryPtr) {
		//锟叫讹拷锟斤拷洌拷锟斤拷锟斤拷锟斤拷锟斤拷为锟秸ｏ拷锟斤拷锟斤拷锟斤拷锟斤拷胁锟窖拷锟�
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
