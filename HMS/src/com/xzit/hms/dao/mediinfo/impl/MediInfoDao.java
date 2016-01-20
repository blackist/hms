package com.xzit.hms.dao.mediinfo.impl;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.impl.BaseDaoImpl;

public class MediInfoDao extends BaseDaoImpl<MediInfo> {
	public PageBean<Map<String, Object>> queryMediInfo(int pagecode, int pagesize, String queryStr) {
		PageBean<Map<String, Object>> pb = new PageBean<>();

		pb.setPagecode(pagecode);
		pb.setPagesize(pagesize);

		String where = "where (m.MName like '%" + queryStr + "%'or m.MType like '%" + queryStr
				+ "%')";

		String sqlRows = "select count(*) from MediInfo m " + where;
		int totalrecards = ((Number) session.createQuery(sqlRows).uniqueResult()).intValue();

		pb.setTotalrecards(totalrecards);

		String sql = "select new map(m.MNo as MNo, m.MName as MName, m.MType as MType, m.MCostprice as MCostprice, m.MPrice as MPrice, m.MCount as MCount, m.MProduce as MProduce,m.MLotno as MLotno) from MediInfo m "
				+ where;
		pb.setBeanlist(session.createQuery(sql).setFirstResult((pagecode - 1) * pagesize).setMaxResults(pagesize).list());

		return pb;
	}
}
