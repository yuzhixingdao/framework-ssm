package com.aac.framework.entity;

import java.util.Date;

/**
 * Dictionary entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Dictionary implements java.io.Serializable {

	// Fields

	private String dictId;
	private String dictType;
	private String dictText;
	private String dictCode;
	private Integer dictOrder;
	private Date createDate;
	private String explains;

	// Constructors

	/** default constructor */
	public Dictionary() {
	}

	/** full constructor */
	public Dictionary(String dictType, String dictText, String dictCode,
			Integer dictOrder, Date createDate, String explains) {
		this.dictType = dictType;
		this.dictText = dictText;
		this.dictCode = dictCode;
		this.dictOrder = dictOrder;
		this.createDate = createDate;
		this.explains = explains;
	}

	// Property accessors

	public String getDictId() {
		return this.dictId;
	}

	public void setDictId(String dictId) {
		this.dictId = dictId;
	}

	public String getDictType() {
		return this.dictType;
	}

	public void setDictType(String dictType) {
		this.dictType = dictType;
	}

	public String getDictText() {
		return this.dictText;
	}

	public void setDictText(String dictText) {
		this.dictText = dictText;
	}

	public String getDictCode() {
		return this.dictCode;
	}

	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	public Integer getDictOrder() {
		return this.dictOrder;
	}

	public void setDictOrder(Integer dictOrder) {
		this.dictOrder = dictOrder;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getExplains() {
		return explains;
	}

	public void setExplains(String explains) {
		this.explains = explains;
	}


}