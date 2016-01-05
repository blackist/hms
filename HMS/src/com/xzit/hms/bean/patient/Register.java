package com.xzit.hms.bean.patient;

/**
 * Register entity. @author MyEclipse Persistence Tools
 */

public class Register implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 73542160003069363L;
	private Integer RNo;
	private String PName;
	private Integer PId;
	private Double PCost;
	private String SName;

	// Constructors

	/** default constructor */
	public Register() {
	}

	/** minimal constructor */
	public Register(Integer RNo) {
		this.RNo = RNo;
	}

	/** full constructor */
	public Register(Integer RNo, String PName, Integer PId, Double PCost,
			String SName) {
		this.RNo = RNo;
		this.PName = PName;
		this.PId = PId;
		this.PCost = PCost;
		this.SName = SName;
	}

	// Property accessors

	public Integer getRNo() {
		return this.RNo;
	}

	public void setRNo(Integer RNo) {
		this.RNo = RNo;
	}

	public String getPName() {
		return this.PName;
	}

	public void setPName(String PName) {
		this.PName = PName;
	}

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public Double getPCost() {
		return this.PCost;
	}

	public void setPCost(Double PCost) {
		this.PCost = PCost;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

}