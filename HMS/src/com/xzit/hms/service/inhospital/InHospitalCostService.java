package com.xzit.hms.service.inhospital;

import java.util.Map;

import com.xzit.hms.bean.inhospital.InhospitalCost;
import com.xzit.hms.bean.page.PageBean;

/**
 * 
 * @ClassName: InHospitalCostService
 * @Description: TODO
 * @author shen.
 * @date 2016年1月20日 下午4:09:36
 *
 */
public interface InHospitalCostService {
	
	/**
	 * 
	 * @Title: findCost 
	 * @Description: TODO
	 * @param @param pagecode
	 * @param @param pagesize
	 * @param @param condidtions
	 * @param @return   
	 * @return PageBean<Map<String,Object>>    
	 * @throws
	 */
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions);
	
	/**
	 * 
	 * @Title: findPatient 
	 * @Description: TODO
	 * @param @param pagecode
	 * @param @param pagesize
	 * @param @return   
	 * @return PageBean<Map<String,Object>>    
	 * @throws
	 */
	public PageBean<Map<String, Object>> findPatient(Integer pagecode,Integer pagesize);
	
	/**
	 * 
	 * @Title: addCost 
	 * @Description: TODO
	 * @param @param pno
	 * @param @param bno
	 * @param @param mno
	 * @param @return   
	 * @return Map<String,Object>    
	 * @throws
	 */
	public Map<String, Object> addCost(Integer pno,Integer bno,Integer mno);
	
	/**
	 * 
	 * @Title: deleteOrder 
	 * @Description: TODO
	 * @param @param inhospitalcost   
	 * @return void    
	 * @throws
	 */
	public void deleteOrder(InhospitalCost inhospitalcost);
}
