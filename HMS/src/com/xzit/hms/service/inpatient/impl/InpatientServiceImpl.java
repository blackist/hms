package com.xzit.hms.service.inpatient.impl;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.hospital.DoctorInfo;
import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.dao.bed.impl.BedDao;
import com.xzit.hms.dao.doctordao.impl.DoctorDao;
import com.xzit.hms.dao.inpatient.impl.InpatientDao;
import com.xzit.hms.service.inpatient.InpatientService;
public class InpatientServiceImpl implements InpatientService {
	private InpatientDao inpatientDao = new InpatientDao();
    private BedDao bedDao =new BedDao();
	private DoctorDao docDao =new DoctorDao();
	@Override
	public PageBean<Map<String, Object>> findInpatient(Integer pagecode,
			Integer pagesize, String condidtions) {
		return inpatientDao.findInpatient(pagecode,pagesize,condidtions);
	   
	}

	public void addinpatient(Inpatient inpatient) {
		inpatientDao.saveEntity(inpatient);
	}
	@Override
	public List<Bed> findAll() {
		// TODO Auto-generated method stub
		return bedDao.findAll();
	}
	@Override
	public List<DoctorInfo> findDocAll() {
		// TODO Auto-generated method stub
		return docDao.findAll();
	}
	
}
