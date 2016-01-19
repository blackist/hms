package com.xzit.hms.bean.page;

import java.util.List;

public class PageBean<T> {
	private int pagecode;
	private long totalrecards;
	private int pagesize;
//	private int totalpages;
	private List<T> beanlist;
	public int getPagecode() {
		return pagecode;
	}
	public void setPagecode(int pagecode) {
		this.pagecode = pagecode;
	}
	public long getTotalrecards() {
		return totalrecards;
	}
	public void setTotalrecards(long totalrecards) {
		this.totalrecards = totalrecards;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public List<T> getBeanlist() {
		return beanlist;
	}
	public void setBeanlist(List<T> beanlist) {
		this.beanlist = beanlist;
	}
	public int getTotalpages(){
		int totalpages = (int)totalrecards / pagesize;
		return totalrecards % pagesize == 0 ? totalpages : totalpages+1;
	}
	@Override
	public String toString() {
		return "PageBean [pagecode=" + pagecode + ", totalrecards="
				+ totalrecards + ", pagesize=" + pagesize + ", beanlist="
				+ beanlist + "]";
	}

}
