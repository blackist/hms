package com.xzit.hms.bean.hospital;

/**
 * Section entity. @author MyEclipse Persistence Tools
 */

public class Section implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 1321309536954425147L;
	private Integer SNo;
	private String SName;

	// Constructors

	/** default constructor */
	public Section() {
	}

	/** full constructor */
	public Section(String SName) {
		this.SName = SName;
	}

	// Property accessors

	public Integer getSNo() {
		return this.SNo;
	}

	public void setSNo(Integer SNo) {
		this.SNo = SNo;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

}