package com.xzit.hms.bean.dict;

/**
 * DictionaryData entity. @author MyEclipse Persistence Tools
 */

public class DictionaryData implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = 3126302703690754292L;
	private Integer id;
	private Dictionary dictionary;
	private String dictdataName;
	private String dictdataValue;
	private String isFixed;
	private String isCancel;
	private String parentId;

	// Constructors

	/** default constructor */
	public DictionaryData() {
	}

	/** minimal constructor */
	public DictionaryData(Dictionary dictionary, String dictdataName,
			String dictdataValue, String isFixed) {
		this.dictionary = dictionary;
		this.dictdataName = dictdataName;
		this.dictdataValue = dictdataValue;
		this.isFixed = isFixed;
	}

	/** full constructor */
	public DictionaryData(Dictionary dictionary, String dictdataName,
			String dictdataValue, String isFixed, String isCancel,
			String parentId) {
		this.dictionary = dictionary;
		this.dictdataName = dictdataName;
		this.dictdataValue = dictdataValue;
		this.isFixed = isFixed;
		this.isCancel = isCancel;
		this.parentId = parentId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dictionary getDictionary() {
		return this.dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	public String getDictdataName() {
		return this.dictdataName;
	}

	public void setDictdataName(String dictdataName) {
		this.dictdataName = dictdataName;
	}

	public String getDictdataValue() {
		return this.dictdataValue;
	}

	public void setDictdataValue(String dictdataValue) {
		this.dictdataValue = dictdataValue;
	}

	public String getIsFixed() {
		return this.isFixed;
	}

	public void setIsFixed(String isFixed) {
		this.isFixed = isFixed;
	}

	public String getIsCancel() {
		return this.isCancel;
	}

	public void setIsCancel(String isCancel) {
		this.isCancel = isCancel;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}