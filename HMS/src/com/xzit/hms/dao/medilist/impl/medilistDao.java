package com.xzit.hms.dao.medilist.impl;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediList;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.impl.BaseDaoImpl;

public class medilistDao extends BaseDaoImpl<MediList>{
	public PageBean<Map<String, Object>> queryMedilist(int pagecode, int pagesize, String queryStr) {
		PageBean<Map<String, Object>> pb = new PageBean<>();

		pb.setPagecode(pagecode);
		pb.setPagesize(pagesize);

		String where = "where (ml.MName like '%" + queryStr + "%') and ml.MName=m.MNo and ml.DName=d.DNo and ml.PName=p.PNo";

		String sqlRows = "select count(*) from MediList ml,MediInfo m,DoctorInfo d,Patient p " + where;
		int totalrecards = ((Number) session.createQuery(sqlRows).uniqueResult()).intValue();

		pb.setTotalrecards(totalrecards);

		String sql = "select new map(ml.MNo as MNo,m.MName as MName,d.DName as DName, p.PName as PName, ml.MQuantily as MQuantily, ml.MPrice as MPrice, ml.sumprice as sumprice, ml.isinHos as isinHos) from MediList ml,MediInfo m,DoctorInfo d,Patient p "
				+ where;
		pb.setBeanlist(session.createQuery(sql).setFirstResult((pagecode - 1) * pagesize).setMaxResults(pagesize).list());

		return pb;
	}
}
