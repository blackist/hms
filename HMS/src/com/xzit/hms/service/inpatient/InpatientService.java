package com.xzit.hms.service.inpatient;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.hospital.DoctorInfo;
import com.xzit.hms.bean.hospital.Section;
import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.page.PageBean;

public interface InpatientService {
	public PageBean<Map<String, Object>> findInpatient(Integer pagecode,Integer pagesize,String condidtions);
    public List<Bed> findAll();
    public List<DoctorInfo> findDocAll();
	public void addinpatient(Inpatient inpatient);

}

