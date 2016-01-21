
package com.xzit.hms.action.patient;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.page.PageBean;
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

	private PageBean<Map<String, Object>> pb;

	private String queryPtr;
	
	/**
	 * 
	* @Title: indexPatient 
	* @Description: 跳转到patient-index界面，在amindcotent中部分刷新要显示的内容
	* @param @return    
	* @return String   
	* @throws
	 */
	@Action(value = "/indexPatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/patient/patient-index.jsp") })
	public String indexPatient() {
		return SUCCESS;
	}
	/**
	 * 
	* @Title: queryPatient 
	* @Description: 执行side-bar页面按钮queryPaitnet的方法
	* @param @return    
	* @return String   
	* @throws
	 */
	//进行查询工作
	@Action(value = "/queryPatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/patient/patient-query.jsp") })
	public String queryPatient() {
		pb = patientService.queryPatients(getPagecode(), getPagesize(), queryPtr);//查询方法+分页
		System.out.println(pb.toString());
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: revisePatient 
	* @Description: 通过query界面上的编辑按钮的revise返回到编辑界面
	* @param @return    
	* @return String   
	* @throws
	 */
	//修改数据
	@Action(value = "/revisePatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/patient/patient-revise.jsp") })
	public String revisePatient() {
		patient = patientService.getPatientById(patient.getPNo());
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: updatePatient 
	* @Description: 编辑界面上的updateSubmit按钮指向此方法，进行更新操作
	* @param @return    
	* @return String   
	* @throws
	 */
	@Action(value = "/updatePatient", results = { @Result(name = "success", location = "queryPatient.action", type = "redirect")  })
	public String updatePatient() {
		Patient patient= this.patient;
		System.out.println(patient.toString());
		patientService.updatePatient(patient);
		
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: addyemianPatient 
	* @Description: 新增一个病人，此为界面上的新增按钮跳转方法
	* @param @return    
	* @return String   
	* @throws
	 */
	//挂号
	@Action(value = "/addyemianPatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/patient/patient-add.jsp") })
	public String addyemianPatient() {
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: addPatient 
	* @Description: 按钮确认提交进行此方法，进行向数据库的添加操作
	* @param @return    
	* @return String   
	* @throws
	 */
	@Action(value = "/addPatient", results = { @Result(name = "success", location = "queryPatient.action", type = "redirect") })
	public String addPatient() {
		patientService.save(patient);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: deletePatient 
	* @Description: 通过页面上的deletePatient传过来的ID参数，进行删除操作
	* @param @return    
	* @return String   
	* @throws
	 */
	@Action(value = "/deletePatient", results = { @Result(name = "success", location = "queryPatient.action", type = "redirect") })
	public String deletePatient() {
		patientService.delete(patient);
		return SUCCESS;
	}
	
	/**
	 * 
	* @Title: getPatientService 
	* @Description: 底下都没set get方法
	* @param @return    
	* @return PatientService   
	* @throws
	 */
	public PatientService getPatientService() {
		return patientService;
	}





	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}


	/**
	 * ModelDriven方法
	 */
	@Override
	public Patient getModel() {
		// TODO Auto-generated method stub
		return patient;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PageBean<Map<String, Object>> getPb() {
		return pb;
	}

	public void setPb(PageBean<Map<String, Object>> pb) {
		this.pb = pb;
	}

	public String getQueryPtr() {
		return queryPtr;
	}

	public void setQueryPtr(String queryPtr) {
		this.queryPtr = queryPtr;
	}


	

}
