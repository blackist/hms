package com.xzit.hms.bean.page;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
	private int pagecode;
	private long totalrecards;
	private int pagesize;
	private int totalpages;
	private List<T> beanlist;

	// é¡µç list
	private List<Integer> pcList = new ArrayList<Integer>();
	// é¡µé¢é¡µç å·¦å³å¹…åº¦
	private int pcRange = 5;

	public void setPcList() {
		getTotalpages();
		if (beanlist != null && beanlist.size() > 0) {
			int leftAdd = 0;
			int rightAdd = 0;
			if (totalpages - pagecode < pcRange) {
				leftAdd = pcRange - (totalpages - pagecode);
			}
			if (pagecode <= pcRange) {
				rightAdd = pcRange - pagecode + 1;
			}
			// ÓÒÒ³Âë
			for (int i = (pagecode - pcRange - leftAdd); i < pagecode; i++) {
				if (i > 0) {
					pcList.add(i);
				}
			}
			// µ±Ç°Ò³Âë
			pcList.add(pagecode);
			// ×óÒ³Âë
			for (int i = (pagecode + 1); i <= (pagecode + pcRange + rightAdd) && i <= totalpages; i++) {
				pcList.add(i);
			}
		}
	}

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
		setPcList();
	}

	public int getTotalpages() {
		int totalpage = (int) totalrecards / pagesize;
		totalpages = totalrecards % pagesize == 0 ? totalpage : totalpage + 1;
		return totalpages;
	}

	@Override
	public String toString() {
		return "PageBean [pagecode=" + pagecode + ", totalrecards=" + totalrecards + ", pagesize=" + pagesize
				+ ", beanlist=" + beanlist + "]";
	}

	public List<Integer> getPcList() {
		return pcList;
	}

}
