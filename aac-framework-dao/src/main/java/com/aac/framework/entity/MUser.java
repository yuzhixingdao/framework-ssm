package com.aac.framework.entity;

import java.io.Serializable;
import java.util.Date;

public class MUser implements Serializable {

	/** ID */
	private String id;

	/** LOGIN_NAME */
	private String loginName;

	/** PASSWORD */
	private String password;

	/** �û����� */
	private String userNo;

	/** PERSON_NAME */
	private String personName;

	/** DESCRIPTION */
	private String description;

	/** IS_VALID */
	private String isValid;

	/** DEL_FLAG */
	private String delFlag;

	/** UPDATE_ID */
	private String updateId;

	/** UPDATE_DATE */
	private Date updateDate;

	/** CREATE_ID */
	private String createId;

	/** CREATE_DATE */
	private Date createDate;

	/** ORG_ID */
	private String orgId;

	/** ORG_NAME */
	private String orgName;

	private String idCard;
	private Date birthDate;
	private String sex;
	private String employeeNo;
	private String employeeType;
	private String mobilePhone;
	private String remark;
	private String isRegularEmp;
	private String type;
	private String agentid;

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	/** ������ʼ�� */
	public MUser(String id, String loginName, String password, String userNo,
			String personName, String description, String isValid,
			String delFlag, String updateId, Date updateDate, String createId,
			Date createDate, String orgId, String orgName) {
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.userNo = userNo;
		this.personName = personName;
		this.description = description;
		this.isValid = isValid;
		this.delFlag = delFlag;
		this.updateId = updateId;
		this.updateDate = updateDate;
		this.createId = createId;
		this.createDate = createDate;
		this.orgId = orgId;
		this.orgName = orgName;
	}

	/** Ĭ�ϳ�ʼ�� */
	public MUser() {
	}

	/** ���� ID(�����Բ�����Ϊ��) */
	public void setId(String id) {
		this.id = id;
	}

	/** ȡ�� ID(�����Բ�����Ϊ��) */
	public String getId() {
		return this.id;
	}

	/** ���� LOGIN_NAME(�����Բ�����Ϊ��) */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/** ȡ�� LOGIN_NAME(�����Բ�����Ϊ��) */
	public String getLoginName() {
		return this.loginName;
	}

	/** ���� PASSWORD(�����Բ�����Ϊ��) */
	public void setPassword(String password) {
		this.password = password;
	}

	/** ȡ�� PASSWORD(�����Բ�����Ϊ��) */
	public String getPassword() {
		return this.password;
	}

	/** ���� PERSON_NAME(�����Կ���Ϊ��) */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/** ȡ�� PERSON_NAME(�����Կ���Ϊ��) */
	public String getPersonName() {
		return this.personName;
	}

	/** ���� DESCRIPTION(�����Կ���Ϊ��) */
	public void setDescription(String description) {
		this.description = description;
	}

	/** ȡ�� DESCRIPTION(�����Կ���Ϊ��) */
	public String getDescription() {
		return this.description;
	}

	/** ���� IS_VALID(�����Կ���Ϊ��) */
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	/** ȡ�� IS_VALID(�����Կ���Ϊ��) */
	public String getIsValid() {
		return this.isValid;
	}

	/** ���� DEL_FLAG(�����Բ�����Ϊ��) */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	/** ȡ�� DEL_FLAG(�����Բ�����Ϊ��) */
	public String getDelFlag() {
		return this.delFlag;
	}

	/** ���� UPDATE_ID(�����Բ�����Ϊ��) */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	/** ȡ�� UPDATE_ID(�����Բ�����Ϊ��) */
	public String getUpdateId() {
		return this.updateId;
	}

	/** ���� UPDATE_DATE(�����Բ�����Ϊ��) */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/** ȡ�� UPDATE_DATE(�����Բ�����Ϊ��) */
	public Date getUpdateDate() {
		return this.updateDate;
	}

	/** ���� CREATE_ID(�����Բ�����Ϊ��) */
	public void setCreateId(String createId) {
		this.createId = createId;
	}

	/** ȡ�� CREATE_ID(�����Բ�����Ϊ��) */
	public String getCreateId() {
		return this.createId;
	}

	/** ���� CREATE_DATE(�����Բ�����Ϊ��) */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/** ȡ�� CREATE_DATE(�����Բ�����Ϊ��) */
	public Date getCreateDate() {
		return this.createDate;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsRegularEmp() {
		return isRegularEmp;
	}

	public void setIsRegularEmp(String isRegularEmp) {
		this.isRegularEmp = isRegularEmp;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MUser [id=" + id + ", loginName=" + loginName + ", password="
				+ password + ", userNo=" + userNo + ", personName="
				+ personName + ", description=" + description + ", isValid="
				+ isValid + ", delFlag=" + delFlag + ", updateId=" + updateId
				+ ", updateDate=" + updateDate + ", createId=" + createId
				+ ", createDate=" + createDate + ", orgId=" + orgId
				+ ", orgName=" + orgName + ", idCard=" + idCard
				+ ", birthDate=" + birthDate + ", sex=" + sex + ", employeeNo="
				+ employeeNo + ", employeeType=" + employeeType
				+ ", mobilePhone=" + mobilePhone + ", remark=" + remark
				+ ", isRegularEmp=" + isRegularEmp + ", type=" + type
				+ ", agentid=" + agentid + "]";
	}

}
