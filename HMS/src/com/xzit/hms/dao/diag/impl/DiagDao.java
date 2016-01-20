package com.xzit.hms.dao.diag.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.DiagnosticInfo;
import com.xzit.hms.dao.HibernateSessionFactory;
import com.xzit.hms.dao.impl.BaseDaoImpl;

/**
 * 
* @ClassName: DiagDao
* @Description: TODO()
* @author 邵熙
* @date 2016年1月20日 下午10:31:33
*
 */
public class DiagDao extends BaseDaoImpl<DiagnosticInfo>{

	protected Session session;
	protected Transaction tr;

	@SuppressWarnings("unchecked")
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions){
		Session session = HibernateSessionFactory.getSession();
		PageBean<Map<String, Object>> pb = new PageBean<>();
		
		String getCount = "select count(*) from DiagnosticInfo diag";
		String findInfo = "select new map(diag.RId as RId,diag.DDate as DDate,diag.DInfo as DInfo,diag.DName as DName,diag.PName as PName,diag.PMnos as PMnos,diag.SName as SName)"
				+ "from DiagnosticInfo diag";
		String param = "";
		if(condidtions!=null && !condidtions.trim().isEmpty()){
			param = "and diag.PName like '%"+condidtions+"%' or diag.DName like '%"+condidtions+"%'";
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
	
	@SuppressWarnings("unchecked")
	public PageBean<Map<String, Object>> queryPay(Integer pagecode,Integer pagesize,String condidtions){
		Session session = HibernateSessionFactory.getSession();
		PageBean<Map<String, Object>> pb = new PageBean<>();
		
		String getCount = "select count(*) from MediInfo medi";
		String findInfo = "select new map(medi.MNo as MNo,medi.MName as MName,medi.MType as MType,medi.MPrice as MPrice,medi.MCount as MCount)"
				+ "from MediInfo medi";
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
	
	
	
	@SuppressWarnings("unchecked")
	public List<MediInfo> getAllMedi() {
		Session session = HibernateSessionFactory.getSession();
		List<MediInfo> mediList = null;
		String hql = "from MediInfo";
		mediList = (List<MediInfo>) session.createQuery(hql).list();
		return mediList;
	}
	
	public MediInfo getById(Integer id) {
		Session session = HibernateSessionFactory.getSession();
		session.get(MediInfo.class, id);
		return (MediInfo)session.get(MediInfo.class, id);
	}

}
