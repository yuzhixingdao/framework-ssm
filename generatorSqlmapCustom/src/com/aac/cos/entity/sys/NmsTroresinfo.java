package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsTroresinfo {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商ID
     */
    private Long serid;

    /**
     * 吊车服务
     */
    private Byte craneser;

    /**
     * 吊车吨位
     */
    private String craneton;

    /**
     * 吊车数量
     */
    private String cranenum;

    /**
     * 联系吊车
     */
    private Byte contactcra;

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
     * 吊车服务
     * @return craneser 吊车服务
     */
    public Byte getCraneser() {
        return craneser;
    }

    /**
     * 吊车服务
     * @param craneser 吊车服务
     */
    public void setCraneser(Byte craneser) {
        this.craneser = craneser;
    }

    /**
     * 吊车吨位
     * @return craneton 吊车吨位
     */
    public String getCraneton() {
        return craneton;
    }

    /**
     * 吊车吨位
     * @param craneton 吊车吨位
     */
    public void setCraneton(String craneton) {
        this.craneton = craneton == null ? null : craneton.trim();
    }

    /**
     * 吊车数量
     * @return cranenum 吊车数量
     */
    public String getCranenum() {
        return cranenum;
    }

    /**
     * 吊车数量
     * @param cranenum 吊车数量
     */
    public void setCranenum(String cranenum) {
        this.cranenum = cranenum == null ? null : cranenum.trim();
    }

    /**
     * 联系吊车
     * @return contactcra 联系吊车
     */
    public Byte getContactcra() {
        return contactcra;
    }

    /**
     * 联系吊车
     * @param contactcra 联系吊车
     */
    public void setContactcra(Byte contactcra) {
        this.contactcra = contactcra;
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