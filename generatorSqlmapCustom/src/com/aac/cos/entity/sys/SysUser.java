package com.aac.cos.entity.sys;

import java.util.Date;

public class SysUser {
    /**
     * id
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 登录名
     */
    private String loginname;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 用户类型
     */
    private Byte usertype;

    /**
     * 状态
     */
    private Byte state;

    /**
     * 部门id
     */
    private Long orgid;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 删除标记
     */
    private Byte delFlag;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 座席工号
     */
    private Integer agentId;

    /**
     * 创建者
     */
    private Long createBy;

    /**
     * 更新者
     */
    private Long updateBy;

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
     * 登录名
     * @return loginname 登录名
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * 登录名
     * @param loginname 登录名
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * 用户名
     * @return name 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 用户名
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 性别
     * @return sex 性别
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 年龄
     * @return age 年龄
     */
    public Byte getAge() {
        return age;
    }

    /**
     * 年龄
     * @param age 年龄
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * 用户类型
     * @return usertype 用户类型
     */
    public Byte getUsertype() {
        return usertype;
    }

    /**
     * 用户类型
     * @param usertype 用户类型
     */
    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
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
     * 部门id
     * @return orgid 部门id
     */
    public Long getOrgid() {
        return orgid;
    }

    /**
     * 部门id
     * @param orgid 部门id
     */
    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
     * 修改时间
     * @return update_date 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 修改时间
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 座席工号
     * @return agent_id 座席工号
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * 座席工号
     * @param agentId 座席工号
     */
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
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
}