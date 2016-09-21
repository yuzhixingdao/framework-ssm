package com.aac.cos.entity.sys;

import java.util.Date;

public class CosCaseTask {
    /**
     * 主键
     */
    private Long id;

    /**
     * 
     */
    private Long caseId;

    /**
     * 案件编码
     */
    private String taskCode;

    /**
     * 活动状态
     */
    private Byte stateCode;

    /**
     * 救援项目
     */
    private Byte rescueItem;

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
     * 
     */
    private String remarks;

    /**
     * 活动创建时间
     */
    private Date taskCreateDate;

    /**
     * 
     */
    private Date distributionDate;

    /**
     * 
     */
    private Date distributionSuccessDate;

    /**
     * 
     */
    private Long pdId;

    /**
     * 
     */
    private String pdName;

    /**
     * 
     */
    private Date acceptDate;

    /**
     * 
     */
    private Date dispatchtDate;

    /**
     * 
     */
    private Date driverAcceptDate;

    /**
     * 
     */
    private Date arriveSceneDate;

    /**
     * 
     */
    private Date rescueStartDate;

    /**
     * 
     */
    private Date rescueFinishDate;

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
     * 
     * @return case_id 
     */
    public Long getCaseId() {
        return caseId;
    }

    /**
     * 
     * @param caseId 
     */
    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    /**
     * 案件编码
     * @return task_code 案件编码
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * 案件编码
     * @param taskCode 案件编码
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    /**
     * 活动状态
     * @return state_code 活动状态
     */
    public Byte getStateCode() {
        return stateCode;
    }

    /**
     * 活动状态
     * @param stateCode 活动状态
     */
    public void setStateCode(Byte stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * 救援项目
     * @return rescue_item 救援项目
     */
    public Byte getRescueItem() {
        return rescueItem;
    }

    /**
     * 救援项目
     * @param rescueItem 救援项目
     */
    public void setRescueItem(Byte rescueItem) {
        this.rescueItem = rescueItem;
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
     * 活动创建时间
     * @return task_create_date 活动创建时间
     */
    public Date getTaskCreateDate() {
        return taskCreateDate;
    }

    /**
     * 活动创建时间
     * @param taskCreateDate 活动创建时间
     */
    public void setTaskCreateDate(Date taskCreateDate) {
        this.taskCreateDate = taskCreateDate;
    }

    /**
     * 
     * @return distribution_date 
     */
    public Date getDistributionDate() {
        return distributionDate;
    }

    /**
     * 
     * @param distributionDate 
     */
    public void setDistributionDate(Date distributionDate) {
        this.distributionDate = distributionDate;
    }

    /**
     * 
     * @return distribution_success_date 
     */
    public Date getDistributionSuccessDate() {
        return distributionSuccessDate;
    }

    /**
     * 
     * @param distributionSuccessDate 
     */
    public void setDistributionSuccessDate(Date distributionSuccessDate) {
        this.distributionSuccessDate = distributionSuccessDate;
    }

    /**
     * 
     * @return pd_id 
     */
    public Long getPdId() {
        return pdId;
    }

    /**
     * 
     * @param pdId 
     */
    public void setPdId(Long pdId) {
        this.pdId = pdId;
    }

    /**
     * 
     * @return pd_name 
     */
    public String getPdName() {
        return pdName;
    }

    /**
     * 
     * @param pdName 
     */
    public void setPdName(String pdName) {
        this.pdName = pdName == null ? null : pdName.trim();
    }

    /**
     * 
     * @return accept_date 
     */
    public Date getAcceptDate() {
        return acceptDate;
    }

    /**
     * 
     * @param acceptDate 
     */
    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * 
     * @return dispatcht_date 
     */
    public Date getDispatchtDate() {
        return dispatchtDate;
    }

    /**
     * 
     * @param dispatchtDate 
     */
    public void setDispatchtDate(Date dispatchtDate) {
        this.dispatchtDate = dispatchtDate;
    }

    /**
     * 
     * @return driver_accept_date 
     */
    public Date getDriverAcceptDate() {
        return driverAcceptDate;
    }

    /**
     * 
     * @param driverAcceptDate 
     */
    public void setDriverAcceptDate(Date driverAcceptDate) {
        this.driverAcceptDate = driverAcceptDate;
    }

    /**
     * 
     * @return arrive_scene_date 
     */
    public Date getArriveSceneDate() {
        return arriveSceneDate;
    }

    /**
     * 
     * @param arriveSceneDate 
     */
    public void setArriveSceneDate(Date arriveSceneDate) {
        this.arriveSceneDate = arriveSceneDate;
    }

    /**
     * 
     * @return rescue_start_date 
     */
    public Date getRescueStartDate() {
        return rescueStartDate;
    }

    /**
     * 
     * @param rescueStartDate 
     */
    public void setRescueStartDate(Date rescueStartDate) {
        this.rescueStartDate = rescueStartDate;
    }

    /**
     * 
     * @return rescue_finish_date 
     */
    public Date getRescueFinishDate() {
        return rescueFinishDate;
    }

    /**
     * 
     * @param rescueFinishDate 
     */
    public void setRescueFinishDate(Date rescueFinishDate) {
        this.rescueFinishDate = rescueFinishDate;
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
}