package com.xzit.hms.bean.inhospital;

/**
 * InhospitalCost entity. @author MyEclipse Persistence Tools
 */

public class InhospitalCost implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = -8662459747294826809L;
	private Integer INo;
	private Integer PNo;
	private Integer BNo;
	private Integer MNo;
	private Double total;

	// Constructors

	/** default constructor */
	public InhospitalCost() {
	}

	/** full constructor */
	public InhospitalCost(Integer PNo, Integer BNo, Integer MNo, Double total) {
		this.PNo = PNo;
		this.BNo = BNo;
		this.MNo = MNo;
		this.total = total;
	}

	// Property accessors

	public Integer getINo() {
		return this.INo;
	}

	public void setINo(Integer INo) {
		this.INo = INo;
	}

	public Integer getPNo() {
		return this.PNo;
	}

	public void setPNo(Integer PNo) {
		this.PNo = PNo;
	}

	public Integer getBNo() {
		return this.BNo;
	}

	public void setBNo(Integer BNo) {
		this.BNo = BNo;
	}

	public Integer getMNo() {
		return this.MNo;
	}

	public void setMNo(Integer MNo) {
		this.MNo = MNo;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}