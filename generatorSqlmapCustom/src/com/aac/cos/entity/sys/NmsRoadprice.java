package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsRoadprice {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商ID
     */
    private Long serid;

    /**
     * 路修服务
     */
    private Byte roadrepairser;

    /**
     * 路修类型
     */
    private Byte roadrepairtype;

    /**
     * 计费基准
     */
    private Byte standar;

    /**
     * 基准数
     */
    private String refnum;

    /**
     * 起步价
     */
    private String beginprice;

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
     * 路修服务
     * @return roadrepairser 路修服务
     */
    public Byte getRoadrepairser() {
        return roadrepairser;
    }

    /**
     * 路修服务
     * @param roadrepairser 路修服务
     */
    public void setRoadrepairser(Byte roadrepairser) {
        this.roadrepairser = roadrepairser;
    }

    /**
     * 路修类型
     * @return roadrepairtype 路修类型
     */
    public Byte getRoadrepairtype() {
        return roadrepairtype;
    }

    /**
     * 路修类型
     * @param roadrepairtype 路修类型
     */
    public void setRoadrepairtype(Byte roadrepairtype) {
        this.roadrepairtype = roadrepairtype;
    }

    /**
     * 计费基准
     * @return standar 计费基准
     */
    public Byte getStandar() {
        return standar;
    }

    /**
     * 计费基准
     * @param standar 计费基准
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
     * @return beginprice 起步价
     */
    public String getBeginprice() {
        return beginprice;
    }

    /**
     * 起步价
     * @param beginprice 起步价
     */
    public void setBeginprice(String beginprice) {
        this.beginprice = beginprice == null ? null : beginprice.trim();
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