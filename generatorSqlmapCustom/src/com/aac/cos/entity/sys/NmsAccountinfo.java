package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsAccountinfo {
    /**
     * accid
     */
    private Long id;

    /**
     * 账户名称
     */
    private String accname;

    /**
     * 开户行名称
     */
    private String openaccbank;

    /**
     * 银行账号
     */
    private String banknum;

    /**
     * 开户地址
     */
    private String openaccaddr;

    /**
     * 银行代码
     */
    private String bankcode;

    /**
     * 主要
     */
    private Byte main;

    /**
     * 服务商id
     */
    private Long serid;

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
     * accid
     * @return id accid
     */
    public Long getId() {
        return id;
    }

    /**
     * accid
     * @param id accid
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 账户名称
     * @return accname 账户名称
     */
    public String getAccname() {
        return accname;
    }

    /**
     * 账户名称
     * @param accname 账户名称
     */
    public void setAccname(String accname) {
        this.accname = accname == null ? null : accname.trim();
    }

    /**
     * 开户行名称
     * @return openaccbank 开户行名称
     */
    public String getOpenaccbank() {
        return openaccbank;
    }

    /**
     * 开户行名称
     * @param openaccbank 开户行名称
     */
    public void setOpenaccbank(String openaccbank) {
        this.openaccbank = openaccbank == null ? null : openaccbank.trim();
    }

    /**
     * 银行账号
     * @return banknum 银行账号
     */
    public String getBanknum() {
        return banknum;
    }

    /**
     * 银行账号
     * @param banknum 银行账号
     */
    public void setBanknum(String banknum) {
        this.banknum = banknum == null ? null : banknum.trim();
    }

    /**
     * 开户地址
     * @return openaccaddr 开户地址
     */
    public String getOpenaccaddr() {
        return openaccaddr;
    }

    /**
     * 开户地址
     * @param openaccaddr 开户地址
     */
    public void setOpenaccaddr(String openaccaddr) {
        this.openaccaddr = openaccaddr == null ? null : openaccaddr.trim();
    }

    /**
     * 银行代码
     * @return bankcode 银行代码
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * 银行代码
     * @param bankcode 银行代码
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode == null ? null : bankcode.trim();
    }

    /**
     * 主要
     * @return main 主要
     */
    public Byte getMain() {
        return main;
    }

    /**
     * 主要
     * @param main 主要
     */
    public void setMain(Byte main) {
        this.main = main;
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