package com.xzit.hms.bean.user;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", userRole=" + userRole + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1995950581025459564L;
	
	private Integer userId;
	private String userName;
	private String password;
	private String userRole;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer userId) {
		this.userId = userId;
	}

	/** full constructor */
	public User(Integer userId, String userName, String password,
			String userRole) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userRole = userRole;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}