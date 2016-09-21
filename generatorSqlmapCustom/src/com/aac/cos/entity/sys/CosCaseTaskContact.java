package com.aac.cos.entity.sys;

import java.util.Date;

public class CosCaseTaskContact {
    /**
     * 主键
     */
    private Long id;

    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 
     */
    private Byte conType;

    /**
     * 
     */
    private Byte conState;

    /**
     * 
     */
    private Byte objType;

    /**
     * 
     */
    private Byte cause;

    /**
     * 
     */
    private Byte purpose;

    /**
     * 
     */
    private String conPerson;

    /**
     * 
     */
    private String conPhone;

    /**
     * 
     */
    private Byte returnState;

    /**
     * 
     */
    private Date finishDate;

    /**
     * 
     */
    private Long dateNumber;

    /**
     * 
     */
    private Date dlbjDate;

    /**
     * 
     */
    private String conRemark;

    /**
     * 创建者
     */
    private Long createId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新者
     */
    private Long updateId;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 删除标记
     */
    private Byte delFlag;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 任务ID
     * @return task_id 任务ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 任务ID
     * @param taskId 任务ID
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 
     * @return con_type 
     */
    public Byte getConType() {
        return conType;
    }

    /**
     * 
     * @param conType 
     */
    public void setConType(Byte conType) {
        this.conType = conType;
    }

    /**
     * 
     * @return con_state 
     */
    public Byte getConState() {
        return conState;
    }

    /**
     * 
     * @param conState 
     */
    public void setConState(Byte conState) {
        this.conState = conState;
    }

    /**
     * 
     * @return obj_type 
     */
    public Byte getObjType() {
        return objType;
    }

    /**
     * 
     * @param objType 
     */
    public void setObjType(Byte objType) {
        this.objType = objType;
    }

    /**
     * 
     * @return cause 
     */
    public Byte getCause() {
        return cause;
    }

    /**
     * 
     * @param cause 
     */
    public void setCause(Byte cause) {
        this.cause = cause;
    }

    /**
     * 
     * @return purpose 
     */
    public Byte getPurpose() {
        return purpose;
    }

    /**
     * 
     * @param purpose 
     */
    public void setPurpose(Byte purpose) {
        this.purpose = purpose;
    }

    /**
     * 
     * @return con_person 
     */
    public String getConPerson() {
        return conPerson;
    }

    /**
     * 
     * @param conPerson 
     */
    public void setConPerson(String conPerson) {
        this.conPerson = conPerson == null ? null : conPerson.trim();
    }

    /**
     * 
     * @return con_phone 
     */
    public String getConPhone() {
        return conPhone;
    }

    /**
     * 
     * @param conPhone 
     */
    public void setConPhone(String conPhone) {
        this.conPhone = conPhone == null ? null : conPhone.trim();
    }

    /**
     * 
     * @return return_state 
     */
    public Byte getReturnState() {
        return returnState;
    }

    /**
     * 
     * @param returnState 
     */
    public void setReturnState(Byte returnState) {
        this.returnState = returnState;
    }

    /**
     * 
     * @return finish_date 
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
     * 
     * @param finishDate 
     */
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * 
     * @return date_number 
     */
    public Long getDateNumber() {
        return dateNumber;
    }

    /**
     * 
     * @param dateNumber 
     */
    public void setDateNumber(Long dateNumber) {
        this.dateNumber = dateNumber;
    }

    /**
     * 
     * @return dlbj_date 
     */
    public Date getDlbjDate() {
        return dlbjDate;
    }

    /**
     * 
     * @param dlbjDate 
     */
    public void setDlbjDate(Date dlbjDate) {
        this.dlbjDate = dlbjDate;
    }

    /**
     * 
     * @return con_remark 
     */
    public String getConRemark() {
        return conRemark;
    }

    /**
     * 
     * @param conRemark 
     */
    public void setConRemark(String conRemark) {
        this.conRemark = conRemark == null ? null : conRemark.trim();
    }

    /**
     * 创建者
     * @return create_id 创建者
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 创建者
     * @param createId 创建者
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新者
     * @return update_id 更新者
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 更新者
     * @param updateId 更新者
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /**
     * 更新时间
     * @return update_date 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 删除标记
     * @return del_flag 删除标记
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 删除标记
     * @param delFlag 删除标记
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}