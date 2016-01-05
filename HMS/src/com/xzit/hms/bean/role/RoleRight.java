package com.xzit.hms.bean.role;

/**
 * RoleRight entity. @author MyEclipse Persistence Tools
 */

public class RoleRight implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 5209378979652117144L;
	private RoleRightId id;

	// Constructors

	/** default constructor */
	public RoleRight() {
	}

	/** full constructor */
	public RoleRight(RoleRightId id) {
		this.id = id;
	}

	// Property accessors

	public RoleRightId getId() {
		return this.id;
	}

	public void setId(RoleRightId id) {
		this.id = id;
	}

}