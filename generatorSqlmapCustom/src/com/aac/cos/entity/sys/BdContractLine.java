package com.aac.cos.entity.sys;

import java.util.Date;

public class BdContractLine {
    /**
     * 主键
     */
    private Long id;

    /**
     * 通道名称
     */
    private String name;

    /**
     * 通道编码
     */
    private String code;

    /**
     * 通道号码
     */
    private String number;

    /**
     * 
     */
    private Date startDate;

    /**
     * 服务截止时间
     */
    private Date endDate;

    /**
     * 
     */
    private Long conId;

    /**
     * 
     */
    private String conCode;

    /**
     * 
     */
    private String conGreeting;

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
     * 通道名称
     * @return name 通道名称
     */
    public String getName() {
        return name;
    }

    /**
     * 通道名称
     * @param name 通道名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 通道编码
     * @return code 通道编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 通道编码
     * @param code 通道编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 通道号码
     * @return number 通道号码
     */
    public String getNumber() {
        return number;
    }

    /**
     * 通道号码
     * @param number 通道号码
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 
     * @return start_date 
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate 
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 服务截止时间
     * @return end_date 服务截止时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 服务截止时间
     * @param endDate 服务截止时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return con_id 
     */
    public Long getConId() {
        return conId;
    }

    /**
     * 
     * @param conId 
     */
    public void setConId(Long conId) {
        this.conId = conId;
    }

    /**
     * 
     * @return con_code 
     */
    public String getConCode() {
        return conCode;
    }

    /**
     * 
     * @param conCode 
     */
    public void setConCode(String conCode) {
        this.conCode = conCode == null ? null : conCode.trim();
    }

    /**
     * 
     * @return con_greeting 
     */
    public String getConGreeting() {
        return conGreeting;
    }

    /**
     * 
     * @param conGreeting 
     */
    public void setConGreeting(String conGreeting) {
        this.conGreeting = conGreeting == null ? null : conGreeting.trim();
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