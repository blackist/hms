package com.xzit.hms.dao.patient;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.dao.impl.BaseDaoImpl;

public class PatientDao extends BaseDaoImpl<Patient> {
	@SuppressWarnings({ "unchecked" })
	public PageBean<Map<String, Object>> queryPatients(int pagecode, int pagesize, String queryPtr) {
		PageBean<Map<String, Object>> pb = new PageBean<>();

		pb.setPagecode(pagecode);
		pb.setPagesize(pagesize);
		//名字的模糊查询
		String where = "where (p.PName like '%" + queryPtr + "%')";

		String sqlRows = "select count(*) from Patient p " + where;
		int totalrecards = ((Number) session.createQuery(sqlRows).uniqueResult()).intValue();

		pb.setTotalrecards(totalrecards);
		//执行sql语句把找到的数据封装到p中
		String sql = "select new map(p.PNo as PNo, p.PName as PName, p.PSex as PSex,p.PAge as PAge,p.PHistory as PHistory,p.PRoom as PRoom) from Patient p "
				+ where;
		pb.setBeanlist(session.createQuery(sql).setFirstResult((pagecode - 1) * pagesize).setMaxResults(pagesize).list());

		return pb;
	}
}
