package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsSerinfo {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商名称
     */
    private String sername;

    /**
     * 区域
     */
    private Byte areaid;

    /**
     * 合同编号
     */
    private String contract;

    /**
     * 父id
     */
    private Long pid;

    /**
     * 服务商属性
     */
    private String serattr;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 详细信息
     */
    private String detailaddr;

    /**
     * 邮编
     */
    private String zipcode;

    /**
     * 服务商备注
     */
    private String sermarks;

    /**
     * 网络经理
     */
    private Long userid;

    /**
     * 代码
     */
    private String scode;

    /**
     * 状态
     */
    private Byte sstate;

    /**
     * 企业法人
     */
    private String businessuser;

    /**
     * 称呼
     */
    private Byte scall;

    /**
     * 注册日期
     */
    private Date createtime;

    /**
     * 注册资金
     */
    private String createfunds;

    /**
     * 企业性质
     */
    private Byte comnature;

    /**
     * 备注
     */
    private String marks;

    /**
     * 服务商编号
     */
    private String sercode;

    /**
     * 从属
     */
    private String depend;

    /**
     * 服务商类别
     */
    private String sertype;

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
     * 服务能力
     */
    private String serAbility;

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
     * 服务商名称
     * @return sername 服务商名称
     */
    public String getSername() {
        return sername;
    }

    /**
     * 服务商名称
     * @param sername 服务商名称
     */
    public void setSername(String sername) {
        this.sername = sername == null ? null : sername.trim();
    }

    /**
     * 区域
     * @return areaid 区域
     */
    public Byte getAreaid() {
        return areaid;
    }

    /**
     * 区域
     * @param areaid 区域
     */
    public void setAreaid(Byte areaid) {
        this.areaid = areaid;
    }

    /**
     * 合同编号
     * @return contract 合同编号
     */
    public String getContract() {
        return contract;
    }

    /**
     * 合同编号
     * @param contract 合同编号
     */
    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
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
     * 服务商属性
     * @return serAttr 服务商属性
     */
    public String getSerattr() {
        return serattr;
    }

    /**
     * 服务商属性
     * @param serattr 服务商属性
     */
    public void setSerattr(String serattr) {
        this.serattr = serattr == null ? null : serattr.trim();
    }

    /**
     * 品牌
     * @return brand 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 品牌
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * 省
     * @return province 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 市
     * @return city 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 区县
     * @return area 区县
     */
    public String getArea() {
        return area;
    }

    /**
     * 区县
     * @param area 区县
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 详细信息
     * @return detailAddr 详细信息
     */
    public String getDetailaddr() {
        return detailaddr;
    }

    /**
     * 详细信息
     * @param detailaddr 详细信息
     */
    public void setDetailaddr(String detailaddr) {
        this.detailaddr = detailaddr == null ? null : detailaddr.trim();
    }

    /**
     * 邮编
     * @return zipcode 邮编
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 邮编
     * @param zipcode 邮编
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    /**
     * 服务商备注
     * @return sermarks 服务商备注
     */
    public String getSermarks() {
        return sermarks;
    }

    /**
     * 服务商备注
     * @param sermarks 服务商备注
     */
    public void setSermarks(String sermarks) {
        this.sermarks = sermarks == null ? null : sermarks.trim();
    }

    /**
     * 网络经理
     * @return userid 网络经理
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 网络经理
     * @param userid 网络经理
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 代码
     * @return scode 代码
     */
    public String getScode() {
        return scode;
    }

    /**
     * 代码
     * @param scode 代码
     */
    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    /**
     * 状态
     * @return sstate 状态
     */
    public Byte getSstate() {
        return sstate;
    }

    /**
     * 状态
     * @param sstate 状态
     */
    public void setSstate(Byte sstate) {
        this.sstate = sstate;
    }

    /**
     * 企业法人
     * @return businessuser 企业法人
     */
    public String getBusinessuser() {
        return businessuser;
    }

    /**
     * 企业法人
     * @param businessuser 企业法人
     */
    public void setBusinessuser(String businessuser) {
        this.businessuser = businessuser == null ? null : businessuser.trim();
    }

    /**
     * 称呼
     * @return scall 称呼
     */
    public Byte getScall() {
        return scall;
    }

    /**
     * 称呼
     * @param scall 称呼
     */
    public void setScall(Byte scall) {
        this.scall = scall;
    }

    /**
     * 注册日期
     * @return createtime 注册日期
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 注册日期
     * @param createtime 注册日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 注册资金
     * @return createfunds 注册资金
     */
    public String getCreatefunds() {
        return createfunds;
    }

    /**
     * 注册资金
     * @param createfunds 注册资金
     */
    public void setCreatefunds(String createfunds) {
        this.createfunds = createfunds == null ? null : createfunds.trim();
    }

    /**
     * 企业性质
     * @return comnature 企业性质
     */
    public Byte getComnature() {
        return comnature;
    }

    /**
     * 企业性质
     * @param comnature 企业性质
     */
    public void setComnature(Byte comnature) {
        this.comnature = comnature;
    }

    /**
     * 备注
     * @return marks 备注
     */
    public String getMarks() {
        return marks;
    }

    /**
     * 备注
     * @param marks 备注
     */
    public void setMarks(String marks) {
        this.marks = marks == null ? null : marks.trim();
    }

    /**
     * 服务商编号
     * @return sercode 服务商编号
     */
    public String getSercode() {
        return sercode;
    }

    /**
     * 服务商编号
     * @param sercode 服务商编号
     */
    public void setSercode(String sercode) {
        this.sercode = sercode == null ? null : sercode.trim();
    }

    /**
     * 从属
     * @return depend 从属
     */
    public String getDepend() {
        return depend;
    }

    /**
     * 从属
     * @param depend 从属
     */
    public void setDepend(String depend) {
        this.depend = depend == null ? null : depend.trim();
    }

    /**
     * 服务商类别
     * @return sertype 服务商类别
     */
    public String getSertype() {
        return sertype;
    }

    /**
     * 服务商类别
     * @param sertype 服务商类别
     */
    public void setSertype(String sertype) {
        this.sertype = sertype == null ? null : sertype.trim();
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

    /**
     * 服务能力
     * @return ser_ability 服务能力
     */
    public String getSerAbility() {
        return serAbility;
    }

    /**
     * 服务能力
     * @param serAbility 服务能力
     */
    public void setSerAbility(String serAbility) {
        this.serAbility = serAbility == null ? null : serAbility.trim();
    }
}