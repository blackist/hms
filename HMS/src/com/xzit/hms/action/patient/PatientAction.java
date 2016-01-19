/**  
 * @Title: UserAction.java <br>
 * @Package com.xzit.hms.action.user <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016楠烇拷閺堬拷閺冿拷娑撳宕�7:44:06 <br>
 * @version V1.0 <br>
 */
package com.xzit.hms.action.patient;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.service.patient.PatientService;
import com.xzit.hms.service.patient.impl.PatientServiceImpl;

/**
 * @ClassName: UserAction <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @version V1.0 <br>
 */
@SuppressWarnings("serial")
@Namespace("/patient")
public class PatientAction extends BaseAction<Patient> {

	private PatientService patientService = new PatientServiceImpl();

	private Patient patient = new Patient();

	@Action(value = "/indexPatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/patient/patient-index.jsp") })
	public String indexPatient() {
		return SUCCESS;
	}

	@Action(value = "/queryPatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/patient/patient-query.jsp") })
	public String queryPatient() {
		return SUCCESS;
	}

	@Action(value = "/designPatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/patient/patient-design.jsp") })
	public String designPatient() {
		return SUCCESS;
	}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	@Override
	public Patient getModel() {
		return patient;
	}

}
