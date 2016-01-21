/**  
 * @Title: DoctorService.java
 * @Package com.xzit.hms.service.doctor
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 下午5:17:06
 * @version V1.0  
 */
package com.xzit.hms.service.doctor;

import java.util.List;

import com.xzit.hms.bean.hospital.DoctorInfo;

/**
 * @ClassName: DoctorService
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 下午5:17:06
 */
public interface DoctorService {

	public List<DoctorInfo> getAllDoctors();
}
