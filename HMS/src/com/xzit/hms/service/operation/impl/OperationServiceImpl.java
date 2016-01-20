/**  
 * @Title: OperationServiceImpl.java
 * @Package com.xzit.hms.service.operation.impl
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 上午11:23:46
 * @version V1.0  
 */
package com.xzit.hms.service.operation.impl;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.operation.impl.OperationDao;
import com.xzit.hms.service.operation.OperationService;

/**
 * @ClassName: OperationServiceImpl
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 上午11:23:46
 */
public class OperationServiceImpl implements OperationService {

	private OperationDao operationDao = new OperationDao();

	@Override
	public PageBean<Map<String, Object>> queryOper(Integer pagecode, Integer pagesize, String queryStr) {
		// 查询参数校验
		if (queryStr == null) {
			queryStr = "";
		}
		return operationDao.queryOper(pagecode, pagesize, queryStr);
	}

}
