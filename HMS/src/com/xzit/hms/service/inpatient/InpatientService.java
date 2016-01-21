package com.xzit.hms.service.inpatient;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.hospital.DoctorInfo;
import com.xzit.hms.bean.hospital.Section;
import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;

/**
 * 
* @ClassName: InpatientService
* @Description: TODO
* @author 姜俊杰
* @date 2016年1月21日 下午1:48:23
*
 */
public interface InpatientService {
	public PageBean<Map<String, Object>> findInpatient(Integer pagecode,Integer pagesize,String condidtions);
    public List<Bed> findAll();
    public List<DoctorInfo> findDocAll();
	public void addinpatient(Inpatient inpatient);
	public List<Section> findSeAll();
	public List<Patient> findpaAll();

}

