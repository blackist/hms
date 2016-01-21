package com.xzit.hms.bean.medicine;

import java.sql.Timestamp;

/**
 * MediInfo entity. @author MyEclipse Persistence Tools
 */

public class MediInfo implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 1955395822564852528L;
	private Integer MNo;
	private String MName;
	private String MType;
	private String MCostprice;
	private String MPrice;
	private Integer MCount;
	private String MProduce;
	private Timestamp MValidtime;
	private String MLotno;

	// Constructors

	/** default constructor */
	public MediInfo() {
	}

	/** minimal constructor */
	public MediInfo(Integer MNo) {
		this.MNo = MNo;
	}

	/** full constructor */
	public MediInfo(Integer MNo, String MName, String MType, String MCostprice,
			String MPrice, Integer MCount, String MProduce,
			Timestamp MValidtime, String MLotno) {
		this.MNo = MNo;
		this.MName = MName;
		this.MType = MType;
		this.MCostprice = MCostprice;
		this.MPrice = MPrice;
		this.MCount = MCount;
		this.MProduce = MProduce;
		this.MValidtime = MValidtime;
		this.MLotno = MLotno;
	}

	// Property accessors

	public Integer getMNo() {
		return this.MNo;
	}

	public void setMNo(Integer MNo) {
		this.MNo = MNo;
	}

	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

	public String getMType() {
		return this.MType;
	}

	public void setMType(String MType) {
		this.MType = MType;
	}

	public String getMCostprice() {
		return this.MCostprice;
	}

	public void setMCostprice(String MCostprice) {
		this.MCostprice = MCostprice;
	}

	public String getMPrice() {
		return this.MPrice;
	}

	public void setMPrice(String MPrice) {
		this.MPrice = MPrice;
	}

	public Integer getMCount() {
		return this.MCount;
	}

	public void setMCount(Integer MCount) {
		this.MCount = MCount;
	}

	public String getMProduce() {
		return this.MProduce;
	}

	public void setMProduce(String MProduce) {
		this.MProduce = MProduce;
	}

	public Timestamp getMValidtime() {
		return this.MValidtime;
	}

	public void setMValidtime(Timestamp MValidtime) {
		this.MValidtime = MValidtime;
	}

	public String getMLotno() {
		return this.MLotno;
	}

	public void setMLotno(String MLotno) {
		this.MLotno = MLotno;
	}

	@Override
	public String toString() {
		return "MediInfo [MNo=" + MNo + ", MName=" + MName + ", MType=" + MType
				+ ", MCostprice=" + MCostprice + ", MPrice=" + MPrice
				+ ", MCount=" + MCount + ", MProduce=" + MProduce
				+ ", MValidtime=" + MValidtime + ", MLotno=" + MLotno + "]";
	}

}