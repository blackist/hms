package com.xzit.hms.dao.inhospital.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.xzit.hms.bean.inhospital.InhospitalCost;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.HibernateSessionFactory;
import com.xzit.hms.dao.impl.BaseDaoImpl;

public class InHostipalCostDao extends BaseDaoImpl<InhospitalCost>{
	
	@SuppressWarnings("unchecked")
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions){
		Session session = HibernateSessionFactory.getSession();
		PageBean<Map<String, Object>> pb = new PageBean<>();
		
		String getCount = "select count(*) from InhospitalCost ihc,Patient p,Inpatient ip,MediList ml "
				+ "where ihc.PNo=p.PNo and ihc.PNo=ip.PNo and ihc.MNo=ml.MNo ";
		String findInfo = "select new map(p.PName as PName,ip.DName as DName,ihc.BNo as BNo,ip.ITime as ITime,ip.OTime as OTime,ip.YChange as YChange,ml.sumprice as sumprice,ihc.total as total)"
				+ "from InhospitalCost ihc,Patient p,Inpatient ip,MediList ml "
				+ "where ihc.PNo=p.PNo and ihc.PNo=ip.PNo and ihc.MNo=ml.MNo ";
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
