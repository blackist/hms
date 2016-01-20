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

import com.xzit.hms.bean.page.PageBean;

/**
 * @ClassName: OperationService
 * @Description: TODO OperationService
 * @author Mr.Black
 * @date 2016年1月20日 上午11:22:00
 */
public interface OperationService {

	public PageBean<Map<String, Object>> queryOper(Integer pagecode, Integer pagesize, String queryStr);
}
