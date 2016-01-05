package com.xzit.hms.bean.patient;

import java.util.Date;

/**
 * DiagnosticInfo entity. @author MyEclipse Persistence Tools
 */

public class DiagnosticInfo implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 5860576406521689721L;
	private Integer RId;
	private Date DDate;
	private String DInfo;
	private String DName;
	private String PName;
	private String PMnos;
	private String SName;

	// Constructors

	/** default constructor */
	public DiagnosticInfo() {
	}

	/** minimal constructor */
	public DiagnosticInfo(Integer RId) {
		this.RId = RId;
	}

	/** full constructor */
	public DiagnosticInfo(Integer RId, Date DDate, String DInfo, String DName,
			String PName, String PMnos, String SName) {
		this.RId = RId;
		this.DDate = DDate;
		this.DInfo = DInfo;
		this.DName = DName;
		this.PName = PName;
		this.PMnos = PMnos;
		this.SName = SName;
	}

	// Property accessors

	public Integer getRId() {
		return this.RId;
	}

	public void setRId(Integer RId) {
		this.RId = RId;
	}

	public Date getDDate() {
		return this.DDate;
	}

	public void setDDate(Date DDate) {
		this.DDate = DDate;
	}

	public String getDInfo() {
		return this.DInfo;
	}

	public void setDInfo(String DInfo) {
		this.DInfo = DInfo;
	}

	public String getDName() {
		return this.DName;
	}

	public void setDName(String DName) {
		this.DName = DName;
	}

	public String getPName() {
		return this.PName;
	}

	public void setPName(String PName) {
		this.PName = PName;
	}

	public String getPMnos() {
		return this.PMnos;
	}

	public void setPMnos(String PMnos) {
		this.PMnos = PMnos;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

}