/**  
 * @Title: OperationDao.java
 * @Package com.xzit.hms.dao.operation.impl
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 上午11:35:52
 * @version V1.0  
 */
package com.xzit.hms.dao.operation.impl;

import java.util.Map;

import com.xzit.hms.bean.inhospital.Operation;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.impl.BaseDaoImpl;

/**
 * @ClassName: OperationDao
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月20日 上午11:35:52
 */
public class OperationDao extends BaseDaoImpl<Operation> {

	@SuppressWarnings("unchecked")
	public PageBean<Map<String, Object>> queryOper(Integer pagecode, Integer pagesize, String queryStr) {
		PageBean<Map<String, Object>> pb = new PageBean<>();
		pb.setPagecode(pagecode);
		pb.setPagesize(pagesize);

		String where = "where (o.operDesc like '%" + queryStr + "%' " + "or o.operResult like '%" + queryStr
				+ "%' or o.operType like '%" + queryStr + "%' or p.PName like '%" + queryStr + "%' or d.DName like '%"
				+ queryStr + "%') and p.PNo=o.PNo and o.DNo=d.DNo ";

		String sqlRows = "select count(o.id) from Operation o, Patient p, DoctorInfo d " + where;
		int totalrecards = ((Number) session.createQuery(sqlRows).uniqueResult()).intValue();

		pb.setTotalrecards(totalrecards);

		String sql = "select new map("
				+ "o.id as id, o.operTime as operTime, o.operDesc as operDesc, o.operResult as operResult, "
				+ "o.operType as operType, o.DNo as DNo, p.PName as PName, o.PNo as PNo, d.DName as DName) from Operation o, Patient p, DoctorInfo d "
				+ where;
		pb.setBeanlist(
				session.createQuery(sql).setFirstResult((pagecode - 1) * pagesize).setMaxResults(pagesize).list());

		return pb;
	}
}
