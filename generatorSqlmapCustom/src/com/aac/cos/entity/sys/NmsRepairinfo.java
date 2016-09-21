package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsRepairinfo {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商ID
     */
    private Long serid;

    /**
     * 维修厂资质
     */
    private Byte repshopsqua;

    /**
     * 维修服务
     */
    private Byte repser;

    /**
     * 维修品牌
     */
    private Byte repband;

    /**
     * 检测服务
     */
    private Byte searchser;

    /**
     * 检测品牌
     */
    private String searchband;

    /**
     * 保险定损理赔资格
     */
    private Byte adjust;

    /**
     * 定损理赔合作保险公司
     */
    private String adjustcom;

    /**
     * 创建者
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新者
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 删除标记
     */
    private Byte delFlag;

    /**
     * id
     * @return id id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 服务商ID
     * @return serid 服务商ID
     */
    public Long getSerid() {
        return serid;
    }

    /**
     * 服务商ID
     * @param serid 服务商ID
     */
    public void setSerid(Long serid) {
        this.serid = serid;
    }

    /**
     * 维修厂资质
     * @return repshopsqua 维修厂资质
     */
    public Byte getRepshopsqua() {
        return repshopsqua;
    }

    /**
     * 维修厂资质
     * @param repshopsqua 维修厂资质
     */
    public void setRepshopsqua(Byte repshopsqua) {
        this.repshopsqua = repshopsqua;
    }

    /**
     * 维修服务
     * @return repser 维修服务
     */
    public Byte getRepser() {
        return repser;
    }

    /**
     * 维修服务
     * @param repser 维修服务
     */
    public void setRepser(Byte repser) {
        this.repser = repser;
    }

    /**
     * 维修品牌
     * @return repband 维修品牌
     */
    public Byte getRepband() {
        return repband;
    }

    /**
     * 维修品牌
     * @param repband 维修品牌
     */
    public void setRepband(Byte repband) {
        this.repband = repband;
    }

    /**
     * 检测服务
     * @return searchser 检测服务
     */
    public Byte getSearchser() {
        return searchser;
    }

    /**
     * 检测服务
     * @param searchser 检测服务
     */
    public void setSearchser(Byte searchser) {
        this.searchser = searchser;
    }

    /**
     * 检测品牌
     * @return searchband 检测品牌
     */
    public String getSearchband() {
        return searchband;
    }

    /**
     * 检测品牌
     * @param searchband 检测品牌
     */
    public void setSearchband(String searchband) {
        this.searchband = searchband == null ? null : searchband.trim();
    }

    /**
     * 保险定损理赔资格
     * @return adjust 保险定损理赔资格
     */
    public Byte getAdjust() {
        return adjust;
    }

    /**
     * 保险定损理赔资格
     * @param adjust 保险定损理赔资格
     */
    public void setAdjust(Byte adjust) {
        this.adjust = adjust;
    }

    /**
     * 定损理赔合作保险公司
     * @return adjustcom 定损理赔合作保险公司
     */
    public String getAdjustcom() {
        return adjustcom;
    }

    /**
     * 定损理赔合作保险公司
     * @param adjustcom 定损理赔合作保险公司
     */
    public void setAdjustcom(String adjustcom) {
        this.adjustcom = adjustcom == null ? null : adjustcom.trim();
    }

    /**
     * 创建者
     * @return create_by 创建者
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 创建者
     * @param createBy 创建者
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
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
     * @return update_by 更新者
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者
     * @param updateBy 更新者
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
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