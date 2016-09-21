package com.aac.cos.entity.sys;

import java.util.Date;

public class SysResource {
    /**
     * id
     */
    private Long id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 描述
     */
    private String description;

    /**
     * pid
     */
    private Long pid;

    /**
     * 状态
     */
    private Byte state;

    /**
     * 资源类型
     */
    private Byte resourcetype;

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
     * 资源名称
     * @return name 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 资源名称
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 资源路径
     * @return url 资源路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 资源路径
     * @param url 资源路径
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * pid
     * @return pid pid
     */
    public Long getPid() {
        return pid;
    }

    /**
     * pid
     * @param pid pid
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 状态
     * @return state 状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 状态
     * @param state 状态
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 资源类型
     * @return resourcetype 资源类型
     */
    public Byte getResourcetype() {
        return resourcetype;
    }

    /**
     * 资源类型
     * @param resourcetype 资源类型
     */
    public void setResourcetype(Byte resourcetype) {
        this.resourcetype = resourcetype;
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