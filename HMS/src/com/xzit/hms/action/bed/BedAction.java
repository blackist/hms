package com.xzit.hms.action.bed;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.service.bed.BedService;
import com.xzit.hms.service.bed.impl.BedServiceImpl;
/**
 * 
* @ClassName: BedAction
* @Description: TODO
* @author 姜俊杰
* @date 2016年1月21日 下午1:49:29
*
 */
@SuppressWarnings("serial")
@Namespace("/hospital")
public class BedAction extends BaseAction<Bed> {
	   private List<Bed> list;
	   
		private Bed bed=new Bed();
		
		private BedService bedService = new BedServiceImpl();

		private String condidtions;
		
		private int pagecode;
		
		private PageBean<Map<String, Object>> pb;
		
		@Action(value = "/indexHospital", results = { @Result(name = "success", location = "/WEB-INF/jsp/bed/bed-index.jsp") })
		public String indexHospital() {//加载初始页面
			return SUCCESS;
		}
		
		@Action(value = "/getaddbed", results = { @Result(name = "success", location = "/WEB-INF/jsp/bed/bed-save.jsp") })
		  public String getaddbed(){  //跳转到新增页面的方法，实现对实体bed的遍历
			list =bedService.findAll();
			return SUCCESS;
			  
		  }
		@Action(value = "/addbedSubmit", results = {
				@Result(name = "success", location = "queryBed.action",type = "redirect")})
		public String addbedSubmit() { //点击保存按钮，实现把数据保存到数据库的方法
			bedService.addbed(bed);
			return SUCCESS;
		}
		
		@Action(value = "/queryBed", results = { @Result(name = "success", location = "/WEB-INF/jsp/bed/bed-query.jsp") })
		public String queryBed() {  //用分页的方法实现全部查询
			if (pagecode == 0) {
				pagecode = 1;
			}
			int pagesize = 8;
			if (condidtions == null || condidtions.trim().isEmpty()) {
				condidtions = "";
			}
			pb = bedService.findBed(pagecode,pagesize, condidtions);
			return SUCCESS;
		}
		
		@Action(value = "/updatebed", results = {@Result(name = "success", location = "/WEB-INF/jsp/bed/bed-update.jsp") })
		public String updatebed() {  //跳转到修改页面的方法，以及得到拥有收到的BNo的对应实体
			bed = bedService.getBedById(bed.getBNo());
			return SUCCESS;
		}
		
		@Action(value = "/updatebedSubmit", results = {
				@Result(name = "success", location = "queryBed.action", type = "redirect") })
		public String updatebedSubmit() { //点击保存修改后触发的方法，实现把表单中数据保存到数据库
			Bed bed = this.bed;
			bedService.updateBed(bed);
			return SUCCESS;
		}
		
		@Action(value = "/deletebed", results = {
				@Result(name = "success", location = "queryBed.action", type = "redirect") })
		public String deletebed() {//把对应BNo号的实体从数据库中删除
			bedService.delete(bed);
			return SUCCESS;
		}
		
		public PageBean<Map<String, Object>> getPb() {
			return pb;
		}

		@Override
		public Bed getModel() {
			return null;
		}
		
		public List<Bed> getList() {
			return list;
		}
		public void setList(List<Bed> list) {
			this.list = list;
		}

		public Bed getBed() {
			return bed;
		}

		public void setBed(Bed bed) {
			this.bed = bed;
		}

		public BedService getBedService() {
			return bedService;
		}

		public void setBedService(BedService bedService) {
			this.bedService = bedService;
		}

		public String getCondidtions() {
			return condidtions;
		}

		public void setCondidtions(String condidtions) {
			this.condidtions = condidtions;
		}

		public int getPagecode() {
			return pagecode;
		}

		public void setPagecode(int pagecode) {
			this.pagecode = pagecode;
		}

		public void setPb(PageBean<Map<String, Object>> pb) {
			this.pb = pb;
		}
}
