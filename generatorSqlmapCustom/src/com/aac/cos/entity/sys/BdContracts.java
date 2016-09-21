package com.aac.cos.entity.sys;

import java.util.Date;

public class BdContracts {
    /**
     * 主键
     */
    private Long id;

    /**
     * 合同编号
     */
    private String code;

    /**
     * 甲方公司
     */
    private String firstParty;

    /**
     * 乙方公司：默认中路救援
     */
    private String secondParty;

    /**
     * 签订时间
     */
    private Date signingDate;

    /**
     * 创建者
     */
    private Long createId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 服务生效日期
     */
    private Date startDate;

    /**
     * 服务截止日期
     */
    private Date endDate;

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
     * 合同编号
     * @return code 合同编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 合同编号
     * @param code 合同编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 甲方公司
     * @return first_party 甲方公司
     */
    public String getFirstParty() {
        return firstParty;
    }

    /**
     * 甲方公司
     * @param firstParty 甲方公司
     */
    public void setFirstParty(String firstParty) {
        this.firstParty = firstParty == null ? null : firstParty.trim();
    }

    /**
     * 乙方公司：默认中路救援
     * @return second_party 乙方公司：默认中路救援
     */
    public String getSecondParty() {
        return secondParty;
    }

    /**
     * 乙方公司：默认中路救援
     * @param secondParty 乙方公司：默认中路救援
     */
    public void setSecondParty(String secondParty) {
        this.secondParty = secondParty == null ? null : secondParty.trim();
    }

    /**
     * 签订时间
     * @return signing_date 签订时间
     */
    public Date getSigningDate() {
        return signingDate;
    }

    /**
     * 签订时间
     * @param signingDate 签订时间
     */
    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
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
     * 服务生效日期
     * @return start_date 服务生效日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 服务生效日期
     * @param startDate 服务生效日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 服务截止日期
     * @return end_date 服务截止日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 服务截止日期
     * @param endDate 服务截止日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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