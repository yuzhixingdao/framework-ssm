package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsSerinfouser {
    /**
     * id
     */
    private Long id;

    /**
     * 联系人
     */
    private String contactuser;

    /**
     * 性别
     */
    private Byte contactsex;

    /**
     * 优先级
     */
    private Byte contactlevel;

    /**
     * 联系范围7X24
     */
    private Byte contactarea;

    /**
     * 服务商ID
     */
    private Long serid;

    /**
     * 联系方式
     */
    private Byte contacttype;

    /**
     * 联系信息
     */
    private String contactmess;

    /**
     * 职位信息
     */
    private String conposition;

    /**
     * 分机号
     */
    private String extcode;

    /**
     * 区号
     */
    private String areacode;

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
     * 联系人
     * @return contactuser 联系人
     */
    public String getContactuser() {
        return contactuser;
    }

    /**
     * 联系人
     * @param contactuser 联系人
     */
    public void setContactuser(String contactuser) {
        this.contactuser = contactuser == null ? null : contactuser.trim();
    }

    /**
     * 性别
     * @return contactsex 性别
     */
    public Byte getContactsex() {
        return contactsex;
    }

    /**
     * 性别
     * @param contactsex 性别
     */
    public void setContactsex(Byte contactsex) {
        this.contactsex = contactsex;
    }

    /**
     * 优先级
     * @return contactlevel 优先级
     */
    public Byte getContactlevel() {
        return contactlevel;
    }

    /**
     * 优先级
     * @param contactlevel 优先级
     */
    public void setContactlevel(Byte contactlevel) {
        this.contactlevel = contactlevel;
    }

    /**
     * 联系范围7X24
     * @return contactarea 联系范围7X24
     */
    public Byte getContactarea() {
        return contactarea;
    }

    /**
     * 联系范围7X24
     * @param contactarea 联系范围7X24
     */
    public void setContactarea(Byte contactarea) {
        this.contactarea = contactarea;
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
     * 联系方式
     * @return contacttype 联系方式
     */
    public Byte getContacttype() {
        return contacttype;
    }

    /**
     * 联系方式
     * @param contacttype 联系方式
     */
    public void setContacttype(Byte contacttype) {
        this.contacttype = contacttype;
    }

    /**
     * 联系信息
     * @return contactmess 联系信息
     */
    public String getContactmess() {
        return contactmess;
    }

    /**
     * 联系信息
     * @param contactmess 联系信息
     */
    public void setContactmess(String contactmess) {
        this.contactmess = contactmess == null ? null : contactmess.trim();
    }

    /**
     * 职位信息
     * @return conposition 职位信息
     */
    public String getConposition() {
        return conposition;
    }

    /**
     * 职位信息
     * @param conposition 职位信息
     */
    public void setConposition(String conposition) {
        this.conposition = conposition == null ? null : conposition.trim();
    }

    /**
     * 分机号
     * @return extcode 分机号
     */
    public String getExtcode() {
        return extcode;
    }

    /**
     * 分机号
     * @param extcode 分机号
     */
    public void setExtcode(String extcode) {
        this.extcode = extcode == null ? null : extcode.trim();
    }

    /**
     * 区号
     * @return areacode 区号
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * 区号
     * @param areacode 区号
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
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