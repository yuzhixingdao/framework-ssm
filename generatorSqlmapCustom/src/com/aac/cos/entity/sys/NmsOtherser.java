package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsOtherser {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商ID
     */
    private Long serid;

    /**
     * 销售服务
     */
    private Byte saleser;

    /**
     * 美容服务
     */
    private Byte beaser;

    /**
     * 备注
     */
    private String node;

    /**
     * 汽车美容
     */
    private Byte carbeauty;

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
     * 销售服务
     * @return saleser 销售服务
     */
    public Byte getSaleser() {
        return saleser;
    }

    /**
     * 销售服务
     * @param saleser 销售服务
     */
    public void setSaleser(Byte saleser) {
        this.saleser = saleser;
    }

    /**
     * 美容服务
     * @return beaser 美容服务
     */
    public Byte getBeaser() {
        return beaser;
    }

    /**
     * 美容服务
     * @param beaser 美容服务
     */
    public void setBeaser(Byte beaser) {
        this.beaser = beaser;
    }

    /**
     * 备注
     * @return node 备注
     */
    public String getNode() {
        return node;
    }

    /**
     * 备注
     * @param node 备注
     */
    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    /**
     * 汽车美容
     * @return carbeauty 汽车美容
     */
    public Byte getCarbeauty() {
        return carbeauty;
    }

    /**
     * 汽车美容
     * @param carbeauty 汽车美容
     */
    public void setCarbeauty(Byte carbeauty) {
        this.carbeauty = carbeauty;
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