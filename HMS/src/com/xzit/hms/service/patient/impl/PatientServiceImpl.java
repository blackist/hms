package com.xzit.hms.service.patient.impl;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.dao.patient.PatientDao;
import com.xzit.hms.service.patient.PatientService;

public class PatientServiceImpl implements PatientService{
	private PatientDao patientDao = new PatientDao();
	/**
	 * 调用patientDao方法中的saveEntity方法 保存新增病人（挂号）
	 */
	public void save(Patient patient) {
		// 对信息保存
		
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
		//判断语句，如果搜索栏为空，则让其进行查询全部
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
	
	public List<Patient> queryAllPatients(Patient patient){
		return patientDao.findAll();
	}
}
