package com.xzit.hms.service.patient;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.bean.user.User;

public interface PatientService {
	public void save(Patient Patient);
	
	public Patient getPatient(Patient patient);

	public PageBean<Map<String, Object>> queryPatients(int pagecode, int pagesize,
			String queryPtr);

	Patient getPatientById(Integer no);
	
	public void updatePatient(Patient patient);
	
	public List<Patient> queryAllPatients(Patient patient);
	
	public void delete(Patient patient);
}
