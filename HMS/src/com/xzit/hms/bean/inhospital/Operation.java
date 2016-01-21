package com.xzit.hms.bean.inhospital;

import java.sql.Timestamp;

/**
 * Operation entity. @author MyEclipse Persistence Tools
 */

public class Operation implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = -8273936264985207488L;
	private Integer id;
	private Integer PNo;
	private Integer DNo;
	private String operType;
	private Timestamp operTime;
	private String operDesc;
	private String operResult;

	// Constructors

	/** default constructor */
	public Operation() {
	}

	/** full constructor */
	public Operation(Integer PNo, Integer DNo, String operType,
			Timestamp operTime, String operDesc, String operResult) {
		this.PNo = PNo;
		this.DNo = DNo;
		this.operType = operType;
		this.operTime = operTime;
		this.operDesc = operDesc;
		this.operResult = operResult;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPNo() {
		return this.PNo;
	}

	public void setPNo(Integer PNo) {
		this.PNo = PNo;
	}

	public Integer getDNo() {
		return this.DNo;
	}

	public void setDNo(Integer DNo) {
		this.DNo = DNo;
	}

	public String getOperType() {
		return this.operType;
	}

	public void setOperType(String operType) {
		this.operType = operType;
	}

	public Timestamp getOperTime() {
		return this.operTime;
	}

	public void setOperTime(Timestamp operTime) {
		this.operTime = operTime;
	}

	public String getOperDesc() {
		return this.operDesc;
	}

	public void setOperDesc(String operDesc) {
		this.operDesc = operDesc;
	}

	public String getOperResult() {
		return this.operResult;
	}

	public void setOperResult(String operResult) {
		this.operResult = operResult;
	}
	
	@Override
	public String toString() {
		return "Operation [id=" + id + ", PNo=" + PNo + ", DNo=" + DNo + ", operType=" + operType + ", operTime="
				+ operTime + ", operDesc=" + operDesc + ", operResult=" + operResult + "]";
	}

}