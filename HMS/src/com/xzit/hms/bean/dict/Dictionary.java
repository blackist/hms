package com.xzit.hms.bean.dict;

import java.util.HashSet;
import java.util.Set;

/**
 * Dictionary entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("rawtypes")
public class Dictionary implements java.io.Serializable {

	// Fields

	/**
	* @Fields serialVersionUID : TODO <br>
	*/ 
	private static final long serialVersionUID = -607151196813780445L;
	private String dictValue;
	private String dictName;
	private String remark;
	private Set dictionaryDatas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dictionary() {
	}

	/** minimal constructor */
	public Dictionary(String dictValue, String dictName) {
		this.dictValue = dictValue;
		this.dictName = dictName;
	}

	/** full constructor */
	public Dictionary(String dictValue, String dictName, String remark,
			Set dictionaryDatas) {
		this.dictValue = dictValue;
		this.dictName = dictName;
		this.remark = remark;
		this.dictionaryDatas = dictionaryDatas;
	}

	// Property accessors

	public String getDictValue() {
		return this.dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}

	public String getDictName() {
		return this.dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getDictionaryDatas() {
		return this.dictionaryDatas;
	}

	public void setDictionaryDatas(Set dictionaryDatas) {
		this.dictionaryDatas = dictionaryDatas;
	}

}