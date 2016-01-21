/**  
 * @Title: OperationService.java
 * @Package com.xzit.hms.service.operation
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 上午11:22:00
 * @version V1.0  
 */
package com.xzit.hms.service.operation;

import java.util.Map;

import com.xzit.hms.bean.inhospital.Operation;
import com.xzit.hms.bean.page.PageBean;

/**
 * @ClassName: OperationService
 * @Description: TODO OperationService
 * @author Mr.Black
 * @date 2016年1月20日 上午11:22:00
 */
public interface OperationService {

	/**
	 * @Title: addOper
	 * @Description: TODO addOper
	 * @param @param operation   
	 * @return void 
	 * @throws
	 */
	public void addOper(Operation operation);

	/**
	 * @Title: getOperById
	 * @Description: TODO getOperById
	 * @param @param id
	 * @param @return   
	 * @return Operation 
	 * @throws
	 */
	public Operation getOperById(Integer id);

	/**
	 * @Title: updateOper
	 * @Description: TODO updateOper
	 * @param @param operation   
	 * @return void 
	 * @throws
	 */
	public void updateOper(Operation operation);

	/**
	 * @Title: queryOper
	 * @Description: TODO queryOper
	 * @param @param pagecode
	 * @param @param pagesize
	 * @param @param queryStr
	 * @param @return   
	 * @return PageBean<Map<String,Object>> 
	 * @throws
	 */
	public PageBean<Map<String, Object>> queryOper(Integer pagecode, Integer pagesize, String queryStr);
}
