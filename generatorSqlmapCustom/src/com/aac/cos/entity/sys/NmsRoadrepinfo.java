package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsRoadrepinfo {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商id
     */
    private Long serid;

    /**
     * 路修级别
     */
    private Byte roadreplev;

    /**
     * 计费模式
     */
    private Byte billplan;

    /**
     * 送油服务
     */
    private Byte oilser;

    /**
     * 常规路修车数量
     */
    private String noroadrepnum;

    /**
     * 电动路修车数量
     */
    private String eleroadrepnum;

    /**
     * 低位卧式千斤顶
     */
    private Byte lowdrojack;

    /**
     * 电瓶诊断仪
     */
    private Byte batteryapp;

    /**
     * 便携式加油桶
     */
    private Byte proilbucket;

    /**
     * 备注
     */
    private String note;

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
     * 服务商id
     * @return serid 服务商id
     */
    public Long getSerid() {
        return serid;
    }

    /**
     * 服务商id
     * @param serid 服务商id
     */
    public void setSerid(Long serid) {
        this.serid = serid;
    }

    /**
     * 路修级别
     * @return roadreplev 路修级别
     */
    public Byte getRoadreplev() {
        return roadreplev;
    }

    /**
     * 路修级别
     * @param roadreplev 路修级别
     */
    public void setRoadreplev(Byte roadreplev) {
        this.roadreplev = roadreplev;
    }

    /**
     * 计费模式
     * @return billplan 计费模式
     */
    public Byte getBillplan() {
        return billplan;
    }

    /**
     * 计费模式
     * @param billplan 计费模式
     */
    public void setBillplan(Byte billplan) {
        this.billplan = billplan;
    }

    /**
     * 送油服务
     * @return oilser 送油服务
     */
    public Byte getOilser() {
        return oilser;
    }

    /**
     * 送油服务
     * @param oilser 送油服务
     */
    public void setOilser(Byte oilser) {
        this.oilser = oilser;
    }

    /**
     * 常规路修车数量
     * @return noroadrepnum 常规路修车数量
     */
    public String getNoroadrepnum() {
        return noroadrepnum;
    }

    /**
     * 常规路修车数量
     * @param noroadrepnum 常规路修车数量
     */
    public void setNoroadrepnum(String noroadrepnum) {
        this.noroadrepnum = noroadrepnum == null ? null : noroadrepnum.trim();
    }

    /**
     * 电动路修车数量
     * @return eleroadrepnum 电动路修车数量
     */
    public String getEleroadrepnum() {
        return eleroadrepnum;
    }

    /**
     * 电动路修车数量
     * @param eleroadrepnum 电动路修车数量
     */
    public void setEleroadrepnum(String eleroadrepnum) {
        this.eleroadrepnum = eleroadrepnum == null ? null : eleroadrepnum.trim();
    }

    /**
     * 低位卧式千斤顶
     * @return lowdrojack 低位卧式千斤顶
     */
    public Byte getLowdrojack() {
        return lowdrojack;
    }

    /**
     * 低位卧式千斤顶
     * @param lowdrojack 低位卧式千斤顶
     */
    public void setLowdrojack(Byte lowdrojack) {
        this.lowdrojack = lowdrojack;
    }

    /**
     * 电瓶诊断仪
     * @return batteryapp 电瓶诊断仪
     */
    public Byte getBatteryapp() {
        return batteryapp;
    }

    /**
     * 电瓶诊断仪
     * @param batteryapp 电瓶诊断仪
     */
    public void setBatteryapp(Byte batteryapp) {
        this.batteryapp = batteryapp;
    }

    /**
     * 便携式加油桶
     * @return proilbucket 便携式加油桶
     */
    public Byte getProilbucket() {
        return proilbucket;
    }

    /**
     * 便携式加油桶
     * @param proilbucket 便携式加油桶
     */
    public void setProilbucket(Byte proilbucket) {
        this.proilbucket = proilbucket;
    }

    /**
     * 备注
     * @return note 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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