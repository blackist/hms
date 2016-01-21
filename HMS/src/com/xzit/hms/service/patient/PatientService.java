package com.xzit.hms.service.patient;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;

/**
 * 
* @ClassName: PatientService
* @Description: TODO
* @author mei.shuo
* @date 2016年1月20日 下午10:28:33
*
 */
public interface PatientService {
	/**
	 * 
	* @Title: 保存新增病人也就是挂号的信息 
	* @Description: TODO
	* @param @param Patient    
	* @return void   
	* @throws
	 */
	public void save(Patient Patient);
	
	/**
	 * 
	* @Title: 无用
	* @Description: TODO
	* @param @param patient
	* @param @return    
	* @return Patient   
	* @throws
	 */
	public Patient getPatient(Patient patient);

	/**
	 * 
	* @Title: 查询所有患者，带分页函数
	* @Description: TODO
	* @param @param pagecode
	* @param @param pagesize
	* @param @param queryPtr
	* @param @return    
	* @return PageBean<Map<String,Object>>   
	* @throws
	 */
	public PageBean<Map<String, Object>> queryPatients(int pagecode, int pagesize,
			String queryPtr);

	/**
	 * 
	* @Title: 获得Patient内的所有数据，通过获取ID的方式
	* @Description: TODO
	* @param @param no
	* @param @return    
	* @return Patient   
	* @throws
	 */
	Patient getPatientById(Integer no);
	
	/**
	 * 
	* @Title: 更新Patient数据，通过updateEnity的方法
	* @Description: TODO
	* @param @param patient    
	* @return void   
	* @throws
	 */
	public void updatePatient(Patient patient);
	
	/**
	 * List 寻找所有的病人 用于其它功能的使用
	* @Title: queryAllPatients 
	* @Description: TODO
	* @param @param patient
	* @param @return    
	* @return List<Patient>   
	* @throws
	 */

	public List<Patient> queryAllPatients();
	
	/**
	 * 删除的底层调用
	* @Title: delete 
	* @Description: TODO
	* @param @param patient    
	* @return void   
	* @throws
	 */
	public void delete(Patient patient);
}
