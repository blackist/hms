/**  
 * @Title: OperationAction.java
 * @Package com.xzit.hms.action.operation
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 上午10:48:33
 * @version V1.0  
 */
package com.xzit.hms.action.inhospitalcost;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.hospital.DoctorInfo;
import com.xzit.hms.bean.inhospital.Operation;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.service.doctor.DoctorService;
import com.xzit.hms.service.doctor.impl.DoctorServiceImpl;
import com.xzit.hms.service.operation.OperationService;
import com.xzit.hms.service.operation.impl.OperationServiceImpl;
import com.xzit.hms.service.patient.PatientService;
import com.xzit.hms.service.patient.impl.PatientServiceImpl;

/**
 * @ClassName: OperationAction
 * @Description: TODO OperationAction
 * @author Mr.Black
 * @date 2016年1月20日 上午10:48:33
 */
@Namespace("/operation")
public class OperationAction extends BaseAction<Operation> {

	private OperationService operationService = new OperationServiceImpl();

	private PatientService patientService = new PatientServiceImpl();

	private DoctorService doctorServic = new DoctorServiceImpl();

	private Operation operation = new Operation();

	/**
	 * queryStr 查询条件
	 */
	private String queryStr;

	/**
	 * 分页对象
	 */
	private PageBean<Map<String, Object>> pb;

	/**
	 * 病人列表
	 */
	private List<Patient> patientList;

	/**
	 * 医生列表
	 */
	private List<DoctorInfo> doctorList;

	private static final long serialVersionUID = 4358476360057846940L;

	/**
	 * @Title: indexOper
	 * @Description: TODO indexOper
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/indexOper", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/inhospital/operation/operation-index.jsp") })
	public String indexOper() {
		return SUCCESS;
	}

	/**
	 * @Title: queryOper
	 * @Description: TODO queryOper
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/queryOper", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/inhospital/operation/operation-query.jsp") })
	public String queryOper() {
		pb = operationService.queryOper(getPagecode(), getPagesize(), queryStr);
		return SUCCESS;
	}

	/**
	 * @Title: addOper
	 * @Description: TODO addOper
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/addOper", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/inhospital/operation/operation-add.jsp") })
	public String addOper() {
		patientList = patientService.queryAllPatients();
		doctorList = doctorServic.getAllDoctors();
		return SUCCESS;
	}

	/**
	 * @Title: addOperSubmit
	 * @Description: TODO addOperSubmit
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/addOperSubmit", results = {
			@Result(name = "success", location = "queryOper.action", type = "redirect") })
	public String addOperSubmit() {
		operationService.addOper(operation);
		return SUCCESS;
	}

	/**
	 * @Title: updateOper
	 * @Description: TODO updateOper
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/updateOper", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/inhospital/operation/operation-update.jsp") })
	public String updateOper() {
		patientList = patientService.queryAllPatients();
		doctorList = doctorServic.getAllDoctors();
		operation = operationService.getOperById(operation.getId());
		return SUCCESS;
	}

	/**
	 * @Title: updateOperSubmit
	 * @Description: TODO updateOperSubmit
	 * @param @return   
	 * @return String 
	 * @throws
	 */
	@Action(value = "/updateOperSubmit", results = {
			@Result(name = "success", location = "queryOper.action", type = "redirect") })
	public String updateOperSubmit() {
		operationService.updateOper(operation);
		return SUCCESS;
	}

	@Override
	public Operation getModel() {
		return operation;
	}

	public String getQueryStr() {
		return queryStr;
	}

	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
	}

	public PageBean<Map<String, Object>> getPb() {
		return pb;
	}

	public void setPb(PageBean<Map<String, Object>> pb) {
		this.pb = pb;
	}

	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	public List<DoctorInfo> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<DoctorInfo> doctorList) {
		this.doctorList = doctorList;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

}
