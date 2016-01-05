package com.xzit.hms.bean.hospital;

/**
 * DoctorInfo entity. @author MyEclipse Persistence Tools
 */

public class DoctorInfo implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = -5046888494279306269L;
	private Integer DNo;
	private String DName;
	private Integer DAge;
	private String SName;
	private Integer SNo;

	// Constructors

	/** default constructor */
	public DoctorInfo() {
	}

	/** full constructor */
	public DoctorInfo(String DName, Integer DAge, String SName, Integer SNo) {
		this.DName = DName;
		this.DAge = DAge;
		this.SName = SName;
		this.SNo = SNo;
	}

	// Property accessors

	public Integer getDNo() {
		return this.DNo;
	}

	public void setDNo(Integer DNo) {
		this.DNo = DNo;
	}

	public String getDName() {
		return this.DName;
	}

	public void setDName(String DName) {
		this.DName = DName;
	}

	public Integer getDAge() {
		return this.DAge;
	}

	public void setDAge(Integer DAge) {
		this.DAge = DAge;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public Integer getSNo() {
		return this.SNo;
	}

	public void setSNo(Integer SNo) {
		this.SNo = SNo;
	}

}