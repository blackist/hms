package com.xzit.hms.bean.inhospital;

import java.util.Date;

/**
 * Inpatient entity. @author MyEclipse Persistence Tools
 */

public class Inpatient implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 2649471432686641289L;
	private Integer PNo;
	private Integer hrNo;
	private Integer BNo;
	private Integer PSno;
	private String DName;
	private String DAdvice;
	private Date ITime;
	private Date OTime;
	private Double YChange;

	// Constructors

	/** default constructor */
	public Inpatient() {
	}

	/** minimal constructor */
	public Inpatient(Integer PNo) {
		this.PNo = PNo;
	}

	/** full constructor */
	public Inpatient(Integer PNo, Integer hrNo, Integer BNo, Integer PSno,
			String DName, String DAdvice, Date ITime, Date OTime, Double YChange) {
		this.PNo = PNo;
		this.hrNo = hrNo;
		this.BNo = BNo;
		this.PSno = PSno;
		this.DName = DName;
		this.DAdvice = DAdvice;
		this.ITime = ITime;
		this.OTime = OTime;
		this.YChange = YChange;
	}

	// Property accessors

	public Integer getPNo() {
		return this.PNo;
	}

	public void setPNo(Integer PNo) {
		this.PNo = PNo;
	}

	public Integer getHrNo() {
		return this.hrNo;
	}

	public void setHrNo(Integer hrNo) {
		this.hrNo = hrNo;
	}

	public Integer getBNo() {
		return this.BNo;
	}

	public void setBNo(Integer BNo) {
		this.BNo = BNo;
	}

	public Integer getPSno() {
		return this.PSno;
	}

	public void setPSno(Integer PSno) {
		this.PSno = PSno;
	}

	public String getDName() {
		return this.DName;
	}

	public void setDName(String DName) {
		this.DName = DName;
	}

	public String getDAdvice() {
		return this.DAdvice;
	}

	public void setDAdvice(String DAdvice) {
		this.DAdvice = DAdvice;
	}

	public Date getITime() {
		return this.ITime;
	}

	public void setITime(Date ITime) {
		this.ITime = ITime;
	}

	public Date getOTime() {
		return this.OTime;
	}

	public void setOTime(Date OTime) {
		this.OTime = OTime;
	}

	public Double getYChange() {
		return this.YChange;
	}

	public void setYChange(Double YChange) {
		this.YChange = YChange;
	}

}