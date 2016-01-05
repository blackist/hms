package com.xzit.hms.bean.medicine;

/**
 * MediList entity. @author MyEclipse Persistence Tools
 */

public class MediList implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 7882430038988366306L;
	private Integer MNo;
	private String DName;
	private String PName;
	private String MName;
	private Integer MQuantily;
	private String MPrice;
	private String sumprice;
	private String isinHos;

	// Constructors

	/** default constructor */
	public MediList() {
	}

	/** full constructor */
	public MediList(String DName, String PName, String MName,
			Integer MQuantily, String MPrice, String sumprice, String isinHos) {
		this.DName = DName;
		this.PName = PName;
		this.MName = MName;
		this.MQuantily = MQuantily;
		this.MPrice = MPrice;
		this.sumprice = sumprice;
		this.isinHos = isinHos;
	}

	// Property accessors

	public Integer getMNo() {
		return this.MNo;
	}

	public void setMNo(Integer MNo) {
		this.MNo = MNo;
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

	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

	public Integer getMQuantily() {
		return this.MQuantily;
	}

	public void setMQuantily(Integer MQuantily) {
		this.MQuantily = MQuantily;
	}

	public String getMPrice() {
		return this.MPrice;
	}

	public void setMPrice(String MPrice) {
		this.MPrice = MPrice;
	}

	public String getSumprice() {
		return this.sumprice;
	}

	public void setSumprice(String sumprice) {
		this.sumprice = sumprice;
	}

	public String getIsinHos() {
		return this.isinHos;
	}

	public void setIsinHos(String isinHos) {
		this.isinHos = isinHos;
	}

}