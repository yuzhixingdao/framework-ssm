package com.aac.cos.entity.sys;

import java.util.Date;

public class CosCase {
    /**
     * 主键
     */
    private Long id;

    /**
     * 案件编码
     */
    private String caseCode;

    /**
     * 案件状态
     */
    private Byte stateCode;

    /**
     * 客户ID
     */
    private Long cusId;

    /**
     * 
     */
    private Long conlinId;

    /**
     * 
     */
    private String conlinName;

    /**
     * 客户电话
     */
    private String cusPhone;

    /**
     * 客户姓名
     */
    private String cusName;

    /**
     * 车旁电话
     */
    private String sidePhone;

    /**
     * 故障地点
     */
    private String bdPlace;

    /**
     * 故障经度
     */
    private Double bdLong;

    /**
     * 故障纬度
     */
    private Double bdLat;

    /**
     * 拖至地点
     */
    private String rdPlace;

    /**
     * 拖至经度
     */
    private Double rdLong;

    /**
     * 拖至纬度
     */
    private Double rdLat;

    /**
     * 坐席人员
     */
    private Long workId;

    /**
     * 坐席人员名称
     */
    private String workName;

    /**
     * 坐席时间
     */
    private Date workDate;

    /**
     * 故障类型
     */
    private Byte accidentType;

    /**
     * 故障详情
     */
    private Byte accidentInfoType;

    /**
     * 是否自费：0-否、1-是
     */
    private Byte isMyCost;

    /**
     * 
     */
    private String remarks;

    /**
     * 创建者
     */
    private Long createId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新者
     */
    private Long updateId;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 删除标记
     */
    private Byte delFlag;

    /**
     * 车旁姓名
     */
    private byte[] sideName;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 案件编码
     * @return case_code 案件编码
     */
    public String getCaseCode() {
        return caseCode;
    }

    /**
     * 案件编码
     * @param caseCode 案件编码
     */
    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode == null ? null : caseCode.trim();
    }

    /**
     * 案件状态
     * @return state_code 案件状态
     */
    public Byte getStateCode() {
        return stateCode;
    }

    /**
     * 案件状态
     * @param stateCode 案件状态
     */
    public void setStateCode(Byte stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * 客户ID
     * @return cus_id 客户ID
     */
    public Long getCusId() {
        return cusId;
    }

    /**
     * 客户ID
     * @param cusId 客户ID
     */
    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    /**
     * 
     * @return conlin_id 
     */
    public Long getConlinId() {
        return conlinId;
    }

    /**
     * 
     * @param conlinId 
     */
    public void setConlinId(Long conlinId) {
        this.conlinId = conlinId;
    }

    /**
     * 
     * @return conlin_name 
     */
    public String getConlinName() {
        return conlinName;
    }

    /**
     * 
     * @param conlinName 
     */
    public void setConlinName(String conlinName) {
        this.conlinName = conlinName == null ? null : conlinName.trim();
    }

    /**
     * 客户电话
     * @return cus_phone 客户电话
     */
    public String getCusPhone() {
        return cusPhone;
    }

    /**
     * 客户电话
     * @param cusPhone 客户电话
     */
    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone == null ? null : cusPhone.trim();
    }

    /**
     * 客户姓名
     * @return cus_name 客户姓名
     */
    public String getCusName() {
        return cusName;
    }

    /**
     * 客户姓名
     * @param cusName 客户姓名
     */
    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    /**
     * 车旁电话
     * @return side_phone 车旁电话
     */
    public String getSidePhone() {
        return sidePhone;
    }

    /**
     * 车旁电话
     * @param sidePhone 车旁电话
     */
    public void setSidePhone(String sidePhone) {
        this.sidePhone = sidePhone == null ? null : sidePhone.trim();
    }

    /**
     * 故障地点
     * @return bd_place 故障地点
     */
    public String getBdPlace() {
        return bdPlace;
    }

    /**
     * 故障地点
     * @param bdPlace 故障地点
     */
    public void setBdPlace(String bdPlace) {
        this.bdPlace = bdPlace == null ? null : bdPlace.trim();
    }

    /**
     * 故障经度
     * @return bd_long 故障经度
     */
    public Double getBdLong() {
        return bdLong;
    }

    /**
     * 故障经度
     * @param bdLong 故障经度
     */
    public void setBdLong(Double bdLong) {
        this.bdLong = bdLong;
    }

    /**
     * 故障纬度
     * @return bd_lat 故障纬度
     */
    public Double getBdLat() {
        return bdLat;
    }

    /**
     * 故障纬度
     * @param bdLat 故障纬度
     */
    public void setBdLat(Double bdLat) {
        this.bdLat = bdLat;
    }

    /**
     * 拖至地点
     * @return rd_place 拖至地点
     */
    public String getRdPlace() {
        return rdPlace;
    }

    /**
     * 拖至地点
     * @param rdPlace 拖至地点
     */
    public void setRdPlace(String rdPlace) {
        this.rdPlace = rdPlace == null ? null : rdPlace.trim();
    }

    /**
     * 拖至经度
     * @return rd_long 拖至经度
     */
    public Double getRdLong() {
        return rdLong;
    }

    /**
     * 拖至经度
     * @param rdLong 拖至经度
     */
    public void setRdLong(Double rdLong) {
        this.rdLong = rdLong;
    }

    /**
     * 拖至纬度
     * @return rd_lat 拖至纬度
     */
    public Double getRdLat() {
        return rdLat;
    }

    /**
     * 拖至纬度
     * @param rdLat 拖至纬度
     */
    public void setRdLat(Double rdLat) {
        this.rdLat = rdLat;
    }

    /**
     * 坐席人员
     * @return work_id 坐席人员
     */
    public Long getWorkId() {
        return workId;
    }

    /**
     * 坐席人员
     * @param workId 坐席人员
     */
    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    /**
     * 坐席人员名称
     * @return work_name 坐席人员名称
     */
    public String getWorkName() {
        return workName;
    }

    /**
     * 坐席人员名称
     * @param workName 坐席人员名称
     */
    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    /**
     * 坐席时间
     * @return work_date 坐席时间
     */
    public Date getWorkDate() {
        return workDate;
    }

    /**
     * 坐席时间
     * @param workDate 坐席时间
     */
    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    /**
     * 故障类型
     * @return accident_type 故障类型
     */
    public Byte getAccidentType() {
        return accidentType;
    }

    /**
     * 故障类型
     * @param accidentType 故障类型
     */
    public void setAccidentType(Byte accidentType) {
        this.accidentType = accidentType;
    }

    /**
     * 故障详情
     * @return accident_info_type 故障详情
     */
    public Byte getAccidentInfoType() {
        return accidentInfoType;
    }

    /**
     * 故障详情
     * @param accidentInfoType 故障详情
     */
    public void setAccidentInfoType(Byte accidentInfoType) {
        this.accidentInfoType = accidentInfoType;
    }

    /**
     * 是否自费：0-否、1-是
     * @return is_my_cost 是否自费：0-否、1-是
     */
    public Byte getIsMyCost() {
        return isMyCost;
    }

    /**
     * 是否自费：0-否、1-是
     * @param isMyCost 是否自费：0-否、1-是
     */
    public void setIsMyCost(Byte isMyCost) {
        this.isMyCost = isMyCost;
    }

    /**
     * 
     * @return remarks 
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 
     * @param remarks 
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 创建者
     * @return create_id 创建者
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 创建者
     * @param createId 创建者
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
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
     * @return update_id 更新者
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 更新者
     * @param updateId 更新者
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
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
     * 车旁姓名
     * @return side_name 车旁姓名
     */
    public byte[] getSideName() {
        return sideName;
    }

    /**
     * 车旁姓名
     * @param sideName 车旁姓名
     */
    public void setSideName(byte[] sideName) {
        this.sideName = sideName;
    }
}