package com.xzit.hms.bean.patient;

/**
 * Patient entity. @author MyEclipse Persistence Tools
 */

public class Patient implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 1153625630480359097L;
	private Integer PNo;
	private String PName;
	private String PSex;
	private Integer PAge;
	private String PHistory;

	// Constructors

	/** default constructor */
	public Patient() {
	}

	/** full constructor */
	public Patient(String PName, String PSex, Integer PAge, String PHistory) {
		this.PName = PName;
		this.PSex = PSex;
		this.PAge = PAge;
		this.PHistory = PHistory;
	}

	// Property accessors

	public Integer getPNo() {
		return this.PNo;
	}

	public void setPNo(Integer PNo) {
		this.PNo = PNo;
	}

	public String getPName() {
		return this.PName;
	}

	public void setPName(String PName) {
		this.PName = PName;
	}

	public String getPSex() {
		return this.PSex;
	}

	public void setPSex(String PSex) {
		this.PSex = PSex;
	}

	public Integer getPAge() {
		return this.PAge;
	}

	public void setPAge(Integer PAge) {
		this.PAge = PAge;
	}

	public String getPHistory() {
		return this.PHistory;
	}

	public void setPHistory(String PHistory) {
		this.PHistory = PHistory;
	}

}