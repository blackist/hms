/**  
 * @Title: DoctorServiceImpl.java
 * @Package com.xzit.hms.service.doctor.impl
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 下午5:17:34
 * @version V1.0  
 */
package com.xzit.hms.service.doctor.impl;

import java.util.List;

import com.xzit.hms.bean.hospital.DoctorInfo;
import com.xzit.hms.dao.doctordao.impl.DoctorDao;
import com.xzit.hms.service.doctor.DoctorService;

/**
 * @ClassName: DoctorServiceImpl
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 下午5:17:34
 */
public class DoctorServiceImpl implements DoctorService {

	private DoctorDao doctorDao = new DoctorDao();
	
	@Override
	public List<DoctorInfo> getAllDoctors() {
		return doctorDao.findAll();
	}

}
