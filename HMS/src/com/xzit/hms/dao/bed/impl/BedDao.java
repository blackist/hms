package com.xzit.hms.dao.bed.impl;


import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.dao.HibernateSessionFactory;
import com.xzit.hms.dao.impl.BaseDaoImpl;

public class BedDao extends BaseDaoImpl<Bed> {
	@SuppressWarnings("unchecked")
	public PageBean<Map<String, Object>> findBed(Integer pagecode,Integer pagesize,String condidtions){
		Session session = HibernateSessionFactory.getSession();
		PageBean<Map<String, Object>> pb = new PageBean<>();
		
		String getCount = "select count(*) from Bed b ";
		String findInfo = "select new map(b.BNo as bno,b.BSta as bst,b.BTy as bty)"
				+ "from Bed b ";
		String param = "";
		if(condidtions!=null && !condidtions.trim().isEmpty()){
			param = "and b.BSta like '%"+condidtions+"%' or b.BTy like '%"+condidtions+"%'";
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
