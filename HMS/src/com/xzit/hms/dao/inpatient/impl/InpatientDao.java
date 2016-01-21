package com.xzit.hms.dao.inpatient.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.HibernateSessionFactory;
import com.xzit.hms.dao.impl.BaseDaoImpl;

public class InpatientDao extends BaseDaoImpl<Inpatient> {
	@SuppressWarnings("unchecked")
	public PageBean<Map<String, Object>> findInpatient(Integer pagecode,Integer pagesize,String condidtions){
		Session session = HibernateSessionFactory.getSession();
		PageBean<Map<String, Object>> pb = new PageBean<>();
		String getCount = "select count(*) from Patient p,Bed b,Section s,DoctorInfo di,Inpatient ip "
				+ "where p.PNo=ip.PNo and b.BNo=ip.BNo and s.SNo=ip.PSno and di.DName=ip.DName ";
		String findInfo = "select new map(p.PName as PName,ip.hrNo as hrNo,b.BNo as BNo,s.SName as SName,di.DName as DName,ip.DAdvice as DAdvice,ip.ITime as ITime,ip.OTime as OTime,ip.YChange as YChange) "
				+ "from Patient p,Bed b,Section s,DoctorInfo di,Inpatient ip "
				+ "where p.PNo=ip.PNo and b.BNo=ip.BNo and s.SNo=ip.PSno and di.DName=ip.DName ";
		String param = "";
		if(condidtions!=null && !condidtions.trim().isEmpty()){
			param = "and ( p.PName like '%"+condidtions+"%' or ip.DName like '%"+condidtions+"%' ) ";
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
