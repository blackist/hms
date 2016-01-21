package com.xzit.hms.service.bed;

import java.util.List;
import java.util.Map;

import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.page.PageBean;

/**
 * 
* @ClassName: BedService
* @Description: TODO
* @author 姜俊杰
* @date 2016年1月21日 下午1:46:57
*
 */
public interface BedService {
	public PageBean<Map<String, Object>> findBed(Integer pagecode,Integer pagesize,String condidtions);
//
	public List<Bed> findAll();

	public void addbed(Bed bed);

	public void delete(Bed bed);

	public Bed getBedById(Integer bNo);

	public void updateBed(Bed bed);
}
