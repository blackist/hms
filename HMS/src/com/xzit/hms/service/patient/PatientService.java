package com.xzit.hms.service.patient;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.bean.user.User;

public interface PatientService {

	public Patient getPatient(Patient patient);

	public PageBean<Map<String, Object>> queryPatients(int pagecode, int pagesize,
			String queryStr);
}
