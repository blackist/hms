package com.xzit.hms.bean.inhospital;

/**
 * Bed entity. @author MyEclipse Persistence Tools
 */

public class Bed implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 8312375464129199202L;
	private Integer BNo;
	private String BSta;
	private String BTy;

	// Constructors

	/** default constructor */
	public Bed() {
	}

	/** minimal constructor */
	public Bed(Integer BNo) {
		this.BNo = BNo;
	}

	/** full constructor */
	public Bed(Integer BNo, String BSta, String BTy) {
		this.BNo = BNo;
		this.BSta = BSta;
		this.BTy = BTy;
	}

	// Property accessors

	public Integer getBNo() {
		return this.BNo;
	}

	public void setBNo(Integer BNo) {
		this.BNo = BNo;
	}

	public String getBSta() {
		return this.BSta;
	}

	public void setBSta(String BSta) {
		this.BSta = BSta;
	}

	public String getBTy() {
		return this.BTy;
	}

	public void setBTy(String BTy) {
		this.BTy = BTy;
	}

}