package com.xzit.hms.action.inpatient;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.hospital.DoctorInfo;
import com.xzit.hms.bean.hospital.Section;
import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.dao.bed.impl.BedDao;
import com.xzit.hms.service.bed.BedService;
import com.xzit.hms.service.bed.impl.BedServiceImpl;
import com.xzit.hms.service.inpatient.InpatientService;
import com.xzit.hms.service.inpatient.impl.InpatientServiceImpl;
import com.xzit.hms.service.patient.PatientService;
import com.xzit.hms.service.patient.impl.PatientServiceImpl;
@SuppressWarnings("serial")
@Namespace("/inhospital")
public class InpatientAction extends BaseAction<Inpatient>{
	 private List<Bed> list;
	 private List<DoctorInfo> doclist;
     public List<DoctorInfo> getDoclist() {
		return doclist;
	}
	public void setDoclist(List<DoctorInfo> doclist) {
		this.doclist = doclist;
	}
	private Inpatient inpatient= new Inpatient();
     private  Patient patient=new Patient();
     private InpatientService inpatientService = new InpatientServiceImpl();
     private PatientService patientService = new PatientServiceImpl();
    
		private String condidtions;
		private int pagecode;
		private PageBean<Map<String, Object>> pb;

   
	@Action(value = "/indexinHospital", results = { @Result(name = "success", location = "/WEB-INF/jsp/inpatient/inpatient-index.jsp") })
		public String indexHospital() {
			return SUCCESS;
		}
	@Action(value = "/getsaveinpatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/inpatient/inpatient-add.jsp") })
	  public String getsaveinpatient(){
		pb = patientService.queryPatients(getPagecode(), getPagesize(), "");
		list = inpatientService.findAll();
		doclist=inpatientService.findDocAll();
		return SUCCESS;
		  
	  }
		
		
		@Action(value = "/queryinpatient", results = { @Result(name = "success", location = "/WEB-INF/jsp/inpatient/inpatient-query.jsp") })
		public String queryinpatient() {
		
			if (pagecode == 0) {
				pagecode = 1;
			}
			int pagesize = 8;
			if (condidtions == null || condidtions.trim().isEmpty()) {
				condidtions = "";
			}
			pb = inpatientService.findInpatient(pagecode,
					pagesize, condidtions);
			
			return SUCCESS;

		}
		@Action(value = "/addinpatientSubmit", results = {
				@Result(name = "success", location = "queryinpatient.action",type = "redirect")})
		public String addinpatientSubmit() {
			inpatientService.addinpatient(inpatient);
			
			return SUCCESS;
		}
		
 	@Override
	public Inpatient getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	public Inpatient getInpatient() {
		return inpatient;
	}
	public void setInpatient(Inpatient inpatient) {
		this.inpatient = inpatient;
	}
	public InpatientService getInpatientService() {
		return inpatientService;
	}
	public void setInpatientService(InpatientService inpatientService) {
		this.inpatientService = inpatientService;
	}
	public String getCondidtions() {
		return condidtions;
	}
	public void setCondidtions(String condidtions) {
		this.condidtions = condidtions;
	}
	public int getPagecode() {
		return pagecode;
	}
	public void setPagecode(int pagecode) {
		this.pagecode = pagecode;
	}
	public PageBean<Map<String, Object>> getPb() {
		return pb;
	}
	public void setPb(PageBean<Map<String, Object>> pb) {
		this.pb = pb;
	}		
	     public Patient getPatient() {
			return patient;
		}
		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		public PatientService getPatientService() {
			return patientService;
		}
		public void setPatientService(PatientService patientService) {
			this.patientService = patientService;
		}
		public List<Bed> getList() {
			return list;
		}
		public void setList(List<Bed> list) {
			this.list = list;
		}

}
