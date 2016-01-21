package com.xzit.hms.service.mediInfo;

import java.util.Map;

import com.xzit.hms.bean.medicine.MediInfo;
import com.xzit.hms.bean.page.PageBean;

/**
 * 
 * @ClassName: mediInfoService
 * @Description: TODO
 * @author QinChong
 * @date 2016年1月21日 下午1:45:28
 */
public interface mediInfoService {
	/**
	 * 
	 * @Title: save @Description: TODO @param @param mediinfo @return
	 * void @throws
	 */
	public void save(MediInfo mediinfo);

	/**
	 * 
	 * @Title: delete @Description: TODO @param @param mediinfo @return
	 * void @throws
	 */
	public void delete(MediInfo mediinfo);

	/**
	 * 
	 * @Title: getMediInfoById @Description: TODO @param @param
	 * id @param @return @return MediInfo @throws
	 */
	public MediInfo getMediInfoById(Integer id);

	/**
	 * 
	 * @Title: updateMediInfo @Description: TODO @param @param mediinfo @return
	 * void @throws
	 */

	public void updateMediInfo(MediInfo mediinfo);

	/**
	 * 
	 * @Title: getMediInfo @Description: TODO @param @param
	 * mediinfo @param @return @return MediInfo @throws
	 */
	public MediInfo getMediInfo(MediInfo mediinfo);

	/**
	 * 
	 * @Title: queryMediinfo @Description: TODO @param @param
	 * pagecode @param @param pagesize @param @param
	 * queryStr @param @return @return PageBean<Map<String,Object>> @throws
	 */
	public PageBean<Map<String, Object>> queryMediinfo(int pagecode, int pagesize, String queryStr);
}
