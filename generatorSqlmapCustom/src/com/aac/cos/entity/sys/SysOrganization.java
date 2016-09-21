package com.aac.cos.entity.sys;

import java.util.Date;

public class SysOrganization {
    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮编
     */
    private String code;

    /**
     * 父id
     */
    private Long pid;

    /**
     * 排序
     */
    private Byte seq;

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
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 邮编
     * @return code 邮编
     */
    public String getCode() {
        return code;
    }

    /**
     * 邮编
     * @param code 邮编
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 父id
     * @return pid 父id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 父id
     * @param pid 父id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 排序
     * @return seq 排序
     */
    public Byte getSeq() {
        return seq;
    }

    /**
     * 排序
     * @param seq 排序
     */
    public void setSeq(Byte seq) {
        this.seq = seq;
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