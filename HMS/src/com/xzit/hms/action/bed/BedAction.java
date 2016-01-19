package com.xzit.hms.action.bed;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;





import com.opensymphony.xwork2.ActionSupport;
import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.inhospital.Bed;
import com.xzit.hms.dao.bed.BedDAO;

@Namespace("/hospital")
public class BedAction extends BaseAction<Bed> {
	
		private Bed bed;
		private int id;
		List<Bed> list;
		
		
		@Action(value = "/indexHospital", results = { @Result(name = "success", location = "/WEB-INF/jsp/bed/bed-index.jsp") })
		public String indexHospital() {
			return SUCCESS;
		}
		@Action(value = "/load", results = { @Result(name = "success", location = "/WEB-INF/jsp/bed/bed_query.jsp") })
		public String load() {
			System.out.println("加载");
			return SUCCESS;

		}

		public Bed getBed() {
			return bed;
		}
		public void setBed(Bed bed) {
			this.bed = bed;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public List<Bed> getList() {
			return list;
		}
		public void setList(List<Bed> list) {
			this.list = list;
		}
		@Override
		public Bed getModel() {
			// TODO Auto-generated method stub
			return null;
		}

	
}
