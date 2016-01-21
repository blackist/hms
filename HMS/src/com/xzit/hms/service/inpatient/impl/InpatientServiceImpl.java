package com.xzit.hms.service.inpatient.impl;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.hospital.DoctorInfo;
import com.xzit.hms.bean.hospital.Section;
import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.dao.bed.impl.BedDao;
import com.xzit.hms.dao.doctordao.impl.DoctorDao;
import com.xzit.hms.dao.inpatient.impl.InpatientDao;
import com.xzit.hms.dao.patient.PatientDao;
import com.xzit.hms.dao.section.impl.SectionDao;
import com.xzit.hms.service.inpatient.InpatientService;
/**
 * 
* @ClassName: InpatientServiceImpl
* @Description: TODO
* @author 姜俊杰
* @date 2016年1月21日 下午1:48:34
*
 */
public class InpatientServiceImpl implements InpatientService {
	private InpatientDao inpatientDao = new InpatientDao();
    private BedDao bedDao =new BedDao();
	private DoctorDao docDao =new DoctorDao();
	private SectionDao seDao = new SectionDao();
	private PatientDao paDao = new PatientDao();
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


	public List<Section> findSeAll() {
		// TODO Auto-generated method stub
		return seDao.findAll();
	}

	@Override
	public List<Patient> findpaAll() {
		// TODO Auto-generated method stub
		return paDao.findAll();
	}
	
}
