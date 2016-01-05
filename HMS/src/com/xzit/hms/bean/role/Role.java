package com.xzit.hms.bean.role;

import java.sql.Timestamp;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 6324355946919028184L;
	private Integer roleId;
	private String roleName;
	private String roleValue;
	private Timestamp createTime;
	private String state;
	private Timestamp stateTime;

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(String roleName, String roleValue, Timestamp createTime,
			String state) {
		this.roleName = roleName;
		this.roleValue = roleValue;
		this.createTime = createTime;
		this.state = state;
	}

	/** full constructor */
	public Role(String roleName, String roleValue, Timestamp createTime,
			String state, Timestamp stateTime) {
		this.roleName = roleName;
		this.roleValue = roleValue;
		this.createTime = createTime;
		this.state = state;
		this.stateTime = stateTime;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleValue() {
		return this.roleValue;
	}

	public void setRoleValue(String roleValue) {
		this.roleValue = roleValue;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
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