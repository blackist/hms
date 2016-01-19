package com.xzit.hms.dao.diag.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.DiagnosticInfo;
import com.xzit.hms.dao.HibernateSessionFactory;
import com.xzit.hms.dao.impl.BaseDaoImpl;

public class DiagDao extends BaseDaoImpl<DiagnosticInfo>{

	public void findEntityByHQL(DiagnosticInfo diagnosticInfo) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions){
		Session session = HibernateSessionFactory.getSession();
		PageBean<Map<String, Object>> pb = new PageBean<>();
		
		String getCount = "select count(*) from DiagnosticInfo diag";
		String findInfo = "select new map(diag.RId as RId,diag.DDate as DDate,diag.DInfo as DInfo,diag.DName as DName,diag.PName as PName,diag.PMnos as PMnos,diag.SName as SName)"
				+ "from DiagnosticInfo diag";
		String param = "";
		if(condidtions!=null && !condidtions.trim().isEmpty()){
			param = "and p.PName like '%"+condidtions+"%' or ip.DName like '%"+condidtions+"%'";
		}
		long totalrecords = (Long)session.createQuery(getCount+param).uniqueResult();
		List<Map<String, Object>> costList = session.createQuery(findInfo+param)
											.setFirstResult((pagecode-1)*pagesize)
											.setMaxResults(pagesize)
											.list();
		pb.setPagecode(pagecode);
		pb.setPagesize(pagesize);
		pb.setTotalrecards(totalrecords);
		pb.setBeanlist(costList);
		return pb;
	}
}
