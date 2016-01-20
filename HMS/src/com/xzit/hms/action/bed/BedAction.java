package com.xzit.hms.action.bed;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.service.bed.BedService;
import com.xzit.hms.service.bed.impl.BedServiceImpl;

@SuppressWarnings("serial")
@Namespace("/hospital")
public class BedAction extends BaseAction<Bed> {
	
		private Bed bed=new Bed();
		private BedService bedService = new BedServiceImpl();

		private String condidtions;
		private int pagecode;
		private PageBean<Map<String, Object>> pb;
		
		@Action(value = "/indexHospital", results = { @Result(name = "success", location = "/WEB-INF/jsp/bed/bed-index.jsp") })
		public String indexHospital() {
			System.out.println("加载");
			return SUCCESS;
		}
		
		@Action(value = "/queryBed", results = { @Result(name = "success", location = "/WEB-INF/jsp/bed/bed-query.jsp") })
		public String queryBed() {
			if (pagecode == 0) {
				pagecode = 1;
			}
			int pagesize = 8;
			if (condidtions == null || condidtions.trim().isEmpty()) {
				condidtions = "";
			}
			pb = bedService.findBed(pagecode,
					pagesize, condidtions);
			return SUCCESS;
		}

		public PageBean<Map<String, Object>> getPb() {
			return pb;
		}

		@Override
		public Bed getModel() {
			// TODO Auto-generated method stub
			return null;
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
