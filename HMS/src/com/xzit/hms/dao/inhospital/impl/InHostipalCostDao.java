package com.xzit.hms.dao.inhospital.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.xzit.hms.bean.inhospital.InhospitalCost;
import com.xzit.hms.bean.inhospital.Inpatient;
import com.xzit.hms.bean.medicine.MediList;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.patient.Patient;
import com.xzit.hms.dao.HibernateSessionFactory;
import com.xzit.hms.dao.impl.BaseDaoImpl;

/**
 * 
 * @ClassName: InHostipalCostDao
 * @Description: TODO
 * @author shen.
 * @date 2016年1月20日 下午4:08:01
 *
 */
@SuppressWarnings("unchecked")
public class InHostipalCostDao extends BaseDaoImpl<InhospitalCost>{
	
	/**
	 * 
	 * @Title: findCost 
	 * @Description: TODO
	 * @param @param pagecode
	 * @param @param pagesize
	 * @param @param condidtions
	 * @param @return   
	 * @return PageBean<Map<String,Object>>    
	 * @throws
	 */
	public PageBean<Map<String, Object>> findCost(Integer pagecode,Integer pagesize,String condidtions){
		Session session = HibernateSessionFactory.getSession();
		PageBean<Map<String, Object>> pb = new PageBean<>();
		
		String getCount = "select count(*) from InhospitalCost ihc,Patient p,Inpatient ip,MediList ml "
				+ "where ihc.PNo=p.PNo and ihc.PNo=ip.PNo and ihc.MNo=ml.MNo ";
		String findInfo = "select new map(p.PName as PName,ip.DName as DName,ihc.BNo as BNo,ip.ITime as ITime,ip.OTime as OTime,ip.YChange as YChange,ml.sumprice as sumprice,ihc.total as total,ihc.INo as INo)"
				+ "from InhospitalCost ihc,Patient p,Inpatient ip,MediList ml "
				+ "where ihc.PNo=p.PNo and ihc.PNo=ip.PNo and ihc.MNo=ml.MNo ";
		String param = "";
		if(condidtions!=null && !condidtions.trim().isEmpty()){
			param = "and ( p.PName like '%"+condidtions+"%' or ip.DName like '%"+condidtions+"%')";
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
	
	/**
	 * 
	 * @Title: findPatient 
	 * @Description: TODO
	 * @param @param pagecode
	 * @param @param pagesize
	 * @param @return   
	 * @return PageBean<Map<String,Object>>    
	 * @throws
	 */
	public PageBean<Map<String, Object>> findPatient(Integer pagecode,Integer pagesize){
		Session session = HibernateSessionFactory.getSession();
		PageBean<Map<String, Object>> pb = new PageBean<>();
		
		String getCount = "select count(*) from Inpatient ip "
				+ "where ip.PNo not in (select ihc.PNo from InhospitalCost ihc)";
		String findPatient = "select new map(ip.PNo as PNo,ip.BNo as BNo,ml.MNo as MNo,p.PName as PName,ip.DName as DName) "
				+ "from Patient p,Inpatient ip,MediList ml "
				+ "where ip.PNo not in (select ihc.PNo from InhospitalCost ihc) and ip.PNo = p.PNo and p.PName = ml.PName";
		long totalrecords = (Long)session.createQuery(getCount).uniqueResult();
		List<Map<String, Object>> costList = session.createQuery(findPatient)
				.setFirstResult((pagecode-1)*pagesize)
				.setMaxResults(pagesize)
				.list();
		pb.setPagecode(pagecode);
		pb.setPagesize(pagesize);
		pb.setTotalrecards(totalrecords);
		pb.setBeanlist(costList);
		return pb;
	}
	
	/**
	 * 
	 * @Title: getPatientByPno 
	 * @Description: TODO
	 * @param @param pno
	 * @param @return   
	 * @return Patient    
	 * @throws
	 */
	public Patient getPatientByPno(Integer pno){
		Session session = HibernateSessionFactory.getSession();
		String findPatient = "from Patient where PNo=?";
		Patient patient = (Patient)session.createQuery(findPatient).setParameter(0,pno).list().get(0);
		return patient;
	}
	
	/**
	 * 
	 * @Title: getInPatientByPno 
	 * @Description: TODO
	 * @param @param pno
	 * @param @return   
	 * @return Inpatient    
	 * @throws
	 */
	public Inpatient getInPatientByPno(Integer pno){
		Session session = HibernateSessionFactory.getSession();
		String findInPatient = "from Inpatient where PNo=?";
		Inpatient inpatient = (Inpatient)session.createQuery(findInPatient).setParameter(0,pno).list().get(0);
		return inpatient;
	}
	
	/**
	 * 
	 * @Title: getMedilistByMno 
	 * @Description: TODO
	 * @param @param mno
	 * @param @return   
	 * @return MediList    
	 * @throws
	 */
	public MediList getMedilistByMno(Integer mno){
		Session session = HibernateSessionFactory.getSession();
		String findMedilist = "from MediList where MNo=?";
		MediList medilist = (MediList)session.createQuery(findMedilist).setParameter(0,mno).list().get(0);
		return medilist;
	}
	
	/**
	 * 
	 * @Title: getOrder 
	 * @Description: TODO
	 * @param @param pno
	 * @param @return   
	 * @return Map<String,Object>    
	 * @throws
	 */
	public Map<String, Object> getOrder(Integer pno){
		Session session = HibernateSessionFactory.getSession();
		String getOrder = "select new map(p.PName as PName,ip.DName as DName,ihc.BNo as BNo,ip.ITime as ITime,ip.OTime as OTime,ip.YChange as YChange,ml.sumprice as sumprice,ihc.total as total) "
				+ "from InhospitalCost ihc,Patient p,Inpatient ip,MediList ml "
				+ "where ihc.PNo=p.PNo and ihc.PNo=ip.PNo and ihc.MNo=ml.MNo and ihc.PNo=?";
		Map<String, Object> order = (Map)session.createQuery(getOrder).setParameter(0, pno).list().get(0);
		return order;
	}
}
