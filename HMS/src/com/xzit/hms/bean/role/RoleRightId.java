package com.xzit.hms.bean.role;

/**
 * RoleRightId entity. @author MyEclipse Persistence Tools
 */

public class RoleRightId implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 8495125653510462922L;
	private Integer roleId;
	private Integer rightId;

	// Constructors

	/** default constructor */
	public RoleRightId() {
	}

	/** full constructor */
	public RoleRightId(Integer roleId, Integer rightId) {
		this.roleId = roleId;
		this.rightId = rightId;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getRightId() {
		return this.rightId;
	}

	public void setRightId(Integer rightId) {
		this.rightId = rightId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleRightId))
			return false;
		RoleRightId castOther = (RoleRightId) other;

		return ((this.getRoleId() == castOther.getRoleId()) || (this
				.getRoleId() != null && castOther.getRoleId() != null && this
				.getRoleId().equals(castOther.getRoleId())))
				&& ((this.getRightId() == castOther.getRightId()) || (this
						.getRightId() != null && castOther.getRightId() != null && this
						.getRightId().equals(castOther.getRightId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result
				+ (getRightId() == null ? 0 : this.getRightId().hashCode());
		return result;
	}

}