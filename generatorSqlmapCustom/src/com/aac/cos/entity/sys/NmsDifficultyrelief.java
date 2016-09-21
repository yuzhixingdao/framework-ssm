package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsDifficultyrelief {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商ID
     */
    private Long serid;

    /**
     * 服务类别
     */
    private Byte sercate;

    /**
     * 服务类型
     */
    private Byte sertype;

    /**
     * 计费标准
     */
    private Byte standar;

    /**
     * 基准数
     */
    private String refnum;

    /**
     * 起步价
     */
    private String beginnprice;

    /**
     * 单价
     */
    private String price;

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
     * 服务类别
     * @return sercate 服务类别
     */
    public Byte getSercate() {
        return sercate;
    }

    /**
     * 服务类别
     * @param sercate 服务类别
     */
    public void setSercate(Byte sercate) {
        this.sercate = sercate;
    }

    /**
     * 服务类型
     * @return sertype 服务类型
     */
    public Byte getSertype() {
        return sertype;
    }

    /**
     * 服务类型
     * @param sertype 服务类型
     */
    public void setSertype(Byte sertype) {
        this.sertype = sertype;
    }

    /**
     * 计费标准
     * @return standar 计费标准
     */
    public Byte getStandar() {
        return standar;
    }

    /**
     * 计费标准
     * @param standar 计费标准
     */
    public void setStandar(Byte standar) {
        this.standar = standar;
    }

    /**
     * 基准数
     * @return refnum 基准数
     */
    public String getRefnum() {
        return refnum;
    }

    /**
     * 基准数
     * @param refnum 基准数
     */
    public void setRefnum(String refnum) {
        this.refnum = refnum == null ? null : refnum.trim();
    }

    /**
     * 起步价
     * @return beginnprice 起步价
     */
    public String getBeginnprice() {
        return beginnprice;
    }

    /**
     * 起步价
     * @param beginnprice 起步价
     */
    public void setBeginnprice(String beginnprice) {
        this.beginnprice = beginnprice == null ? null : beginnprice.trim();
    }

    /**
     * 单价
     * @return price 单价
     */
    public String getPrice() {
        return price;
    }

    /**
     * 单价
     * @param price 单价
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
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