package com.xzit.hms.service.medilist;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.medicine.MediList;
import com.xzit.hms.bean.page.PageBean;

/**
 * 
 * @ClassName: medilistService
 * @Description: TODO
 * @author QinChong
 * @date 2016年1月21日 下午1:48:30
 */
public interface medilistService {
	/**
	 * 
	 * @Title: save @Description: TODO @param @return void @throws
	 */
	public void save();

	/**
	 * 
	 * @Title: delete @Description: TODO @param @param medilist @return
	 * void @throws
	 */
	public void delete(MediList medilist);

	/**
	 * 
	 * @Title: getMedilist @Description: TODO @param @param
	 * medilist @param @return @return MediList @throws
	 */
	public MediList getMedilist(MediList medilist);

	/**
	 * 
	 * @Title: queryMedilist @Description: TODO @param @param
	 * pagecode @param @param pagesize @param @param
	 * queryStr @param @return @return PageBean<Map<String,Object>> @throws
	 */
	public PageBean<Map<String, Object>> queryMedilist(int pagecode, int pagesize, String queryStr);
}
