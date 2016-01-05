package com.xzit.hms.bean.role;

import java.sql.Timestamp;

/**
 * Right entity. @author MyEclipse Persistence Tools
 */

public class Right implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 2797854119430166844L;
	private Integer rightId;
	private String rightName;
	private Integer rightPos;
	private Long rightCode;
	private String rightUrl;
	private String isPublic;
	private String state;
	private Timestamp stateTime;

	// Constructors

	/** default constructor */
	public Right() {
	}

	/** minimal constructor */
	public Right(Integer rightPos, Long rightCode, String rightUrl,
			String isPublic, String state) {
		this.rightPos = rightPos;
		this.rightCode = rightCode;
		this.rightUrl = rightUrl;
		this.isPublic = isPublic;
		this.state = state;
	}

	/** full constructor */
	public Right(String rightName, Integer rightPos, Long rightCode,
			String rightUrl, String isPublic, String state, Timestamp stateTime) {
		this.rightName = rightName;
		this.rightPos = rightPos;
		this.rightCode = rightCode;
		this.rightUrl = rightUrl;
		this.isPublic = isPublic;
		this.state = state;
		this.stateTime = stateTime;
	}

	// Property accessors

	public Integer getRightId() {
		return this.rightId;
	}

	public void setRightId(Integer rightId) {
		this.rightId = rightId;
	}

	public String getRightName() {
		return this.rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}

	public Integer getRightPos() {
		return this.rightPos;
	}

	public void setRightPos(Integer rightPos) {
		this.rightPos = rightPos;
	}

	public Long getRightCode() {
		return this.rightCode;
	}

	public void setRightCode(Long rightCode) {
		this.rightCode = rightCode;
	}

	public String getRightUrl() {
		return this.rightUrl;
	}

	public void setRightUrl(String rightUrl) {
		this.rightUrl = rightUrl;
	}

	public String getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getStateTime() {
		return this.stateTime;
	}

	public void setStateTime(Timestamp stateTime) {
		this.stateTime = stateTime;
	}

}