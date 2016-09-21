package com.aac.cos.entity.gga;

import java.util.Date;

public class LpFlowTask {
    /**
     * 
     */
    private String id;

    /**
     * 追加任务ID，关联主键ID
     */
    private String taskId;

    /**
     * 
     */
    private String claimCode;

    /**
     * 
     */
    private String taskType;

    /**
     * 
     */
    private String flowId;

    /**
     * 机构ID（救援商ID）
     */
    private String orgId;

    /**
     * 调度时间
     */
    private Date dispatchDate;

    /**
     * 
     */
    private String updatedBy;

    /**
     * 
     */
    private Date updatedDate;

    /**
     * 
     */
    private String ggVehicleId;

    /**
     * 
     */
    private String ggVehicleCode;

    /**
     * 
     */
    private String personName;

    /**
     * 
     */
    private String personPhone;

    /**
     * 
     */
    private String stateCode;

    /**
     * 救援人ID(多个用逗号隔开)
     */
    private String personId;

    /**
     * 
     */
    private Date predictArriveDate;

    /**
     * 
     */
    private Date predictFinishDate;

    /**
     * 
     */
    private String dispatchPersonId;

    /**
     * 调度人姓名
     */
    private String dispatchPersonName;

    /**
     * 完成时间
     */
    private Date submitDate;

    /**
     * 
     */
    private Double submitSum;

    /**
     * 
     */
    private String invoiceNo;

    /**
     * 
     */
    private String repairSiteName;

    /**
     * 
     */
    private String sendPhoneFlag;

    /**
     * 
     */
    private String autoSendPhoneFlag;

    /**
     * 智能派遣调度标志：0-不是、1-是
     */
    private String autoFlag;

    /**
     * 智能模式：1-单一派遣模式、2-抢单模式
     */
    private String autoModel;

    /**
     * 
     */
    private Date mobileReceiverDate;

    /**
     * 
     */
    private Date mobileAcceptDate;

    /**
     * 
     */
    private Date trailCarStartDate;

    /**
     * 
     */
    private String trailCarStartLng;

    /**
     * 
     */
    private String trailCarStartLat;

    /**
     * 
     */
    private Date trailCarEndDate;

    /**
     * 
     */
    private String trailCarEndLng;

    /**
     * 
     */
    private String trailCarEndLat;

    /**
     * 
     */
    private Date arriveSceneDate;

    /**
     * 
     */
    private String arriveSceneLng;

    /**
     * 
     */
    private String arriveSceneLat;

    /**
     * 
     */
    private String vehicleStatus;

    /**
     * 
     */
    private String invoiceFlag;

    /**
     * 
     */
    private String outCarPrice;

    /**
     * 
     */
    private String trailerMileage;

    /**
     * 
     */
    private String priceStandardid;

    /**
     * 
     */
    private String priceStandard;

    /**
     * 
     */
    private String savePrice;

    /**
     * 
     */
    private String waitPrice;

    /**
     * 
     */
    private String lossSum;

    /**
     * 支付方式
     */
    private String priceType;

    /**
     * 
     */
    private String receiveDate;

    /**
     * 
     */
    private String dealDate;

    /**
     * 
     */
    private String driveLine;

    /**
     * 
     */
    private Date bespeakDate;

    /**
     * 故事地点
     */
    private String surveyPlace;

    /**
     * 
     */
    private String surveyLng;

    /**
     * 
     */
    private String surveyLat;

    /**
     * 
     */
    private String evalPlace;

    /**
     * 
     */
    private String evalPlaceLng;

    /**
     * 
     */
    private String evalPlaceLat;

    /**
     * 
     */
    private String payCompany;

    /**
     * 
     */
    private String updateFlag;

    /**
     * 取消时间
     */
    private Date cancelDate;

    /**
     * 添加时间
     */
    private Date createDate;

    /**
     * 取消备注
     */
    private String cancelDescrip;

    /**
     * 过桥过路费
     */
    private Double tollPrice;

    /**
     * 过桥过路费支付方式
     */
    private String tollPayType;

    /**
     * 始起里程表数
     */
    private Double startOdometer;

    /**
     * 到底现场里程表数
     */
    private Double arriveOdometer;

    /**
     * 拖车结束里程表数
     */
    private Double endOdometer;

    /**
     * 车牌号或车架号
     */
    private String numberPlate;

    /**
     * 颜色
     */
    private String productModel;

    /**
     * 车型
     */
    private String vehicleName;

    /**
     * 救援项目:(10-搭电、11-拖车、12-补胎、13-加油、14-维修、15-其他)
     */
    private String rescueItemType;

    /**
     * 救援备注
     */
    private String rescueRemark;

    /**
     * 客户电话
     */
    private String moblePhone;

    /**
     * 接车电话
     */
    private String jiechePhone;

    /**
     * 客户姓名
     */
    private String moblePhoneName;

    /**
     * 接车姓名
     */
    private String jiechePhoneName;

    /**
     * 
     */
    private String saveVehicleType;

    /**
     * 务话注备
     */
    private String dispatchDescrip;

    /**
     * 是否在五环内：0-否、1-是
     */
    private String isFiveRing;

    /**
     * 受理请申时间(派遣开始时间)
     */
    private Date acceptanceAskDate;

    /**
     * 受理成功时间(派遣成功时间)
     */
    private Date acceptanceSuccessDate;

    /**
     * 
     */
    private String devolveFlag;

    /**
     * 短信发送标志：1-已发送、0-未发送
     */
    private String smsSendFlag;

    /**
     * 路修：爆胎个数（1/2/3/4）
     */
    private String lxBtgsState;

    /**
     * 路修：备胎完好（1是2否）
     */
    private String lxBtwhState;

    /**
     * 路修：电瓶位置（1前置-机舱2后置-后备箱3中间-车内）
     */
    private String lxDpwzState;

    /**
     * 路修：防盗螺丝（1是2否）
     */
    private String lxFdlsState;

    /**
     * 路修：混合动力（1是2否）
     */
    private String lxHhdlState;

    /**
     * 路修：换胎工具（1是2否）
     */
    private String lxHtgjState;

    /**
     * 路修：加油工具（1有2无）
     */
    private String lxJygjState;

    /**
     * 路修：空间（1有2无）
     */
    private String lxKjState;

    /**
     * 路修：燃油类型（1汽油2柴油）
     */
    private String lxRylxState;

    /**
     * 路修：是否改装（1是2否）
     */
    private String lxSfgzState;

    /**
     * 路修：是否有备胎（1是2否）
     */
    private String lxSfybtState;

    /**
     * 路修：位置（1左前2右前3左后4右后）
     */
    private String lxWzState;

    /**
     * 路修：油号#90#92#93#95#97    0号   #-10#-20#-30
     */
    private String lxYh;

    /**
     * 加油升数
     */
    private Double lxSs;

    /**
     * 拖车：车辆位置（1地上车库、2地下车库、3地面）
     */
    private String tcClwzType;

    /**
     * 拖车：方向盘（1可转动、2锁死）
     */
    private String tcFxpState;

    /**
     * 拖车：减速带（1有、2无）
     */
    private String tcJsdState;

    /**
     * 拖车：坡度（1平缓、2陡峭）
     */
    private String tcPdState;

    /**
     * 拖车：手刹（1是2否）
     */
    private String tcShoushaType;

    /**
     * 拖车：拖车钩（1有、2无）
     */
    private String tcTcgState;

    /**
     * 拖车：拖车空间（1有、2无）
     */
    private String tcTckjState;

    /**
     * 拖车：弯道（1圆弧形、2螺旋形、3折返形、4U形）
     */
    private String tcWdState;

    /**
     * 拖车：限高（1:2米以内、2:2-3米、3:3-5米、4：5米以上）
     */
    private String tcXgState;

    /**
     * 拖车：档位（1是、2否）
     */
    private String tcDwState;

    /**
     * 车库（1是、2否）
     */
    private String tcCk;

    /**
     * 待定时间
     */
    private Date awaitDate;

    /**
     * 待定状态
     */
    private String awaitState;

    /**
     * 
     * @return ID 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 追加任务ID，关联主键ID
     * @return TASK_ID 追加任务ID，关联主键ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 追加任务ID，关联主键ID
     * @param taskId 追加任务ID，关联主键ID
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * 
     * @return CLAIM_CODE 
     */
    public String getClaimCode() {
        return claimCode;
    }

    /**
     * 
     * @param claimCode 
     */
    public void setClaimCode(String claimCode) {
        this.claimCode = claimCode == null ? null : claimCode.trim();
    }

    /**
     * 
     * @return TASK_TYPE 
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * 
     * @param taskType 
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    /**
     * 
     * @return FLOW_ID 
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * 
     * @param flowId 
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    /**
     * 机构ID（救援商ID）
     * @return ORG_ID 机构ID（救援商ID）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 机构ID（救援商ID）
     * @param orgId 机构ID（救援商ID）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 调度时间
     * @return DISPATCH_DATE 调度时间
     */
    public Date getDispatchDate() {
        return dispatchDate;
    }

    /**
     * 调度时间
     * @param dispatchDate 调度时间
     */
    public void setDispatchDate(Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    /**
     * 
     * @return UPDATED_BY 
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 
     * @param updatedBy 
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 
     * @return UPDATED_DATE 
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * 
     * @param updatedDate 
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * 
     * @return GG_VEHICLE_ID 
     */
    public String getGgVehicleId() {
        return ggVehicleId;
    }

    /**
     * 
     * @param ggVehicleId 
     */
    public void setGgVehicleId(String ggVehicleId) {
        this.ggVehicleId = ggVehicleId == null ? null : ggVehicleId.trim();
    }

    /**
     * 
     * @return GG_VEHICLE_CODE 
     */
    public String getGgVehicleCode() {
        return ggVehicleCode;
    }

    /**
     * 
     * @param ggVehicleCode 
     */
    public void setGgVehicleCode(String ggVehicleCode) {
        this.ggVehicleCode = ggVehicleCode == null ? null : ggVehicleCode.trim();
    }

    /**
     * 
     * @return PERSON_NAME 
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 
     * @param personName 
     */
    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    /**
     * 
     * @return PERSON_PHONE 
     */
    public String getPersonPhone() {
        return personPhone;
    }

    /**
     * 
     * @param personPhone 
     */
    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone == null ? null : personPhone.trim();
    }

    /**
     * 
     * @return STATE_CODE 
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * 
     * @param stateCode 
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode == null ? null : stateCode.trim();
    }

    /**
     * 救援人ID(多个用逗号隔开)
     * @return PERSON_ID 救援人ID(多个用逗号隔开)
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * 救援人ID(多个用逗号隔开)
     * @param personId 救援人ID(多个用逗号隔开)
     */
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    /**
     * 
     * @return PREDICT_ARRIVE_DATE 
     */
    public Date getPredictArriveDate() {
        return predictArriveDate;
    }

    /**
     * 
     * @param predictArriveDate 
     */
    public void setPredictArriveDate(Date predictArriveDate) {
        this.predictArriveDate = predictArriveDate;
    }

    /**
     * 
     * @return PREDICT_FINISH_DATE 
     */
    public Date getPredictFinishDate() {
        return predictFinishDate;
    }

    /**
     * 
     * @param predictFinishDate 
     */
    public void setPredictFinishDate(Date predictFinishDate) {
        this.predictFinishDate = predictFinishDate;
    }

    /**
     * 
     * @return DISPATCH_PERSON_ID 
     */
    public String getDispatchPersonId() {
        return dispatchPersonId;
    }

    /**
     * 
     * @param dispatchPersonId 
     */
    public void setDispatchPersonId(String dispatchPersonId) {
        this.dispatchPersonId = dispatchPersonId == null ? null : dispatchPersonId.trim();
    }

    /**
     * 调度人姓名
     * @return DISPATCH_PERSON_NAME 调度人姓名
     */
    public String getDispatchPersonName() {
        return dispatchPersonName;
    }

    /**
     * 调度人姓名
     * @param dispatchPersonName 调度人姓名
     */
    public void setDispatchPersonName(String dispatchPersonName) {
        this.dispatchPersonName = dispatchPersonName == null ? null : dispatchPersonName.trim();
    }

    /**
     * 完成时间
     * @return SUBMIT_DATE 完成时间
     */
    public Date getSubmitDate() {
        return submitDate;
    }

    /**
     * 完成时间
     * @param submitDate 完成时间
     */
    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    /**
     * 
     * @return SUBMIT_SUM 
     */
    public Double getSubmitSum() {
        return submitSum;
    }

    /**
     * 
     * @param submitSum 
     */
    public void setSubmitSum(Double submitSum) {
        this.submitSum = submitSum;
    }

    /**
     * 
     * @return INVOICE_NO 
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 
     * @param invoiceNo 
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    /**
     * 
     * @return REPAIR_SITE_NAME 
     */
    public String getRepairSiteName() {
        return repairSiteName;
    }

    /**
     * 
     * @param repairSiteName 
     */
    public void setRepairSiteName(String repairSiteName) {
        this.repairSiteName = repairSiteName == null ? null : repairSiteName.trim();
    }

    /**
     * 
     * @return SEND_PHONE_FLAG 
     */
    public String getSendPhoneFlag() {
        return sendPhoneFlag;
    }

    /**
     * 
     * @param sendPhoneFlag 
     */
    public void setSendPhoneFlag(String sendPhoneFlag) {
        this.sendPhoneFlag = sendPhoneFlag == null ? null : sendPhoneFlag.trim();
    }

    /**
     * 
     * @return AUTO_SEND_PHONE_FLAG 
     */
    public String getAutoSendPhoneFlag() {
        return autoSendPhoneFlag;
    }

    /**
     * 
     * @param autoSendPhoneFlag 
     */
    public void setAutoSendPhoneFlag(String autoSendPhoneFlag) {
        this.autoSendPhoneFlag = autoSendPhoneFlag == null ? null : autoSendPhoneFlag.trim();
    }

    /**
     * 智能派遣调度标志：0-不是、1-是
     * @return AUTO_FLAG 智能派遣调度标志：0-不是、1-是
     */
    public String getAutoFlag() {
        return autoFlag;
    }

    /**
     * 智能派遣调度标志：0-不是、1-是
     * @param autoFlag 智能派遣调度标志：0-不是、1-是
     */
    public void setAutoFlag(String autoFlag) {
        this.autoFlag = autoFlag == null ? null : autoFlag.trim();
    }

    /**
     * 智能模式：1-单一派遣模式、2-抢单模式
     * @return AUTO_MODEL 智能模式：1-单一派遣模式、2-抢单模式
     */
    public String getAutoModel() {
        return autoModel;
    }

    /**
     * 智能模式：1-单一派遣模式、2-抢单模式
     * @param autoModel 智能模式：1-单一派遣模式、2-抢单模式
     */
    public void setAutoModel(String autoModel) {
        this.autoModel = autoModel == null ? null : autoModel.trim();
    }

    /**
     * 
     * @return MOBILE_RECEIVER_DATE 
     */
    public Date getMobileReceiverDate() {
        return mobileReceiverDate;
    }

    /**
     * 
     * @param mobileReceiverDate 
     */
    public void setMobileReceiverDate(Date mobileReceiverDate) {
        this.mobileReceiverDate = mobileReceiverDate;
    }

    /**
     * 
     * @return MOBILE_ACCEPT_DATE 
     */
    public Date getMobileAcceptDate() {
        return mobileAcceptDate;
    }

    /**
     * 
     * @param mobileAcceptDate 
     */
    public void setMobileAcceptDate(Date mobileAcceptDate) {
        this.mobileAcceptDate = mobileAcceptDate;
    }

    /**
     * 
     * @return TRAIL_CAR_START_DATE 
     */
    public Date getTrailCarStartDate() {
        return trailCarStartDate;
    }

    /**
     * 
     * @param trailCarStartDate 
     */
    public void setTrailCarStartDate(Date trailCarStartDate) {
        this.trailCarStartDate = trailCarStartDate;
    }

    /**
     * 
     * @return TRAIL_CAR_START_LNG 
     */
    public String getTrailCarStartLng() {
        return trailCarStartLng;
    }

    /**
     * 
     * @param trailCarStartLng 
     */
    public void setTrailCarStartLng(String trailCarStartLng) {
        this.trailCarStartLng = trailCarStartLng == null ? null : trailCarStartLng.trim();
    }

    /**
     * 
     * @return TRAIL_CAR_START_LAT 
     */
    public String getTrailCarStartLat() {
        return trailCarStartLat;
    }

    /**
     * 
     * @param trailCarStartLat 
     */
    public void setTrailCarStartLat(String trailCarStartLat) {
        this.trailCarStartLat = trailCarStartLat == null ? null : trailCarStartLat.trim();
    }

    /**
     * 
     * @return TRAIL_CAR_END_DATE 
     */
    public Date getTrailCarEndDate() {
        return trailCarEndDate;
    }

    /**
     * 
     * @param trailCarEndDate 
     */
    public void setTrailCarEndDate(Date trailCarEndDate) {
        this.trailCarEndDate = trailCarEndDate;
    }

    /**
     * 
     * @return TRAIL_CAR_END_LNG 
     */
    public String getTrailCarEndLng() {
        return trailCarEndLng;
    }

    /**
     * 
     * @param trailCarEndLng 
     */
    public void setTrailCarEndLng(String trailCarEndLng) {
        this.trailCarEndLng = trailCarEndLng == null ? null : trailCarEndLng.trim();
    }

    /**
     * 
     * @return TRAIL_CAR_END_LAT 
     */
    public String getTrailCarEndLat() {
        return trailCarEndLat;
    }

    /**
     * 
     * @param trailCarEndLat 
     */
    public void setTrailCarEndLat(String trailCarEndLat) {
        this.trailCarEndLat = trailCarEndLat == null ? null : trailCarEndLat.trim();
    }

    /**
     * 
     * @return ARRIVE_SCENE_DATE 
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
     * @return ARRIVE_SCENE_LNG 
     */
    public String getArriveSceneLng() {
        return arriveSceneLng;
    }

    /**
     * 
     * @param arriveSceneLng 
     */
    public void setArriveSceneLng(String arriveSceneLng) {
        this.arriveSceneLng = arriveSceneLng == null ? null : arriveSceneLng.trim();
    }

    /**
     * 
     * @return ARRIVE_SCENE_LAT 
     */
    public String getArriveSceneLat() {
        return arriveSceneLat;
    }

    /**
     * 
     * @param arriveSceneLat 
     */
    public void setArriveSceneLat(String arriveSceneLat) {
        this.arriveSceneLat = arriveSceneLat == null ? null : arriveSceneLat.trim();
    }

    /**
     * 
     * @return VEHICLE_STATUS 
     */
    public String getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * 
     * @param vehicleStatus 
     */
    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus == null ? null : vehicleStatus.trim();
    }

    /**
     * 
     * @return INVOICE_FLAG 
     */
    public String getInvoiceFlag() {
        return invoiceFlag;
    }

    /**
     * 
     * @param invoiceFlag 
     */
    public void setInvoiceFlag(String invoiceFlag) {
        this.invoiceFlag = invoiceFlag == null ? null : invoiceFlag.trim();
    }

    /**
     * 
     * @return OUT_CAR_PRICE 
     */
    public String getOutCarPrice() {
        return outCarPrice;
    }

    /**
     * 
     * @param outCarPrice 
     */
    public void setOutCarPrice(String outCarPrice) {
        this.outCarPrice = outCarPrice == null ? null : outCarPrice.trim();
    }

    /**
     * 
     * @return TRAILER_MILEAGE 
     */
    public String getTrailerMileage() {
        return trailerMileage;
    }

    /**
     * 
     * @param trailerMileage 
     */
    public void setTrailerMileage(String trailerMileage) {
        this.trailerMileage = trailerMileage == null ? null : trailerMileage.trim();
    }

    /**
     * 
     * @return PRICE_STANDARDID 
     */
    public String getPriceStandardid() {
        return priceStandardid;
    }

    /**
     * 
     * @param priceStandardid 
     */
    public void setPriceStandardid(String priceStandardid) {
        this.priceStandardid = priceStandardid == null ? null : priceStandardid.trim();
    }

    /**
     * 
     * @return PRICE_STANDARD 
     */
    public String getPriceStandard() {
        return priceStandard;
    }

    /**
     * 
     * @param priceStandard 
     */
    public void setPriceStandard(String priceStandard) {
        this.priceStandard = priceStandard == null ? null : priceStandard.trim();
    }

    /**
     * 
     * @return SAVE_PRICE 
     */
    public String getSavePrice() {
        return savePrice;
    }

    /**
     * 
     * @param savePrice 
     */
    public void setSavePrice(String savePrice) {
        this.savePrice = savePrice == null ? null : savePrice.trim();
    }

    /**
     * 
     * @return WAIT_PRICE 
     */
    public String getWaitPrice() {
        return waitPrice;
    }

    /**
     * 
     * @param waitPrice 
     */
    public void setWaitPrice(String waitPrice) {
        this.waitPrice = waitPrice == null ? null : waitPrice.trim();
    }

    /**
     * 
     * @return LOSS_SUM 
     */
    public String getLossSum() {
        return lossSum;
    }

    /**
     * 
     * @param lossSum 
     */
    public void setLossSum(String lossSum) {
        this.lossSum = lossSum == null ? null : lossSum.trim();
    }

    /**
     * 支付方式
     * @return PRICE_TYPE 支付方式
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * 支付方式
     * @param priceType 支付方式
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType == null ? null : priceType.trim();
    }

    /**
     * 
     * @return RECEIVE_DATE 
     */
    public String getReceiveDate() {
        return receiveDate;
    }

    /**
     * 
     * @param receiveDate 
     */
    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate == null ? null : receiveDate.trim();
    }

    /**
     * 
     * @return DEAL_DATE 
     */
    public String getDealDate() {
        return dealDate;
    }

    /**
     * 
     * @param dealDate 
     */
    public void setDealDate(String dealDate) {
        this.dealDate = dealDate == null ? null : dealDate.trim();
    }

    /**
     * 
     * @return DRIVE_LINE 
     */
    public String getDriveLine() {
        return driveLine;
    }

    /**
     * 
     * @param driveLine 
     */
    public void setDriveLine(String driveLine) {
        this.driveLine = driveLine == null ? null : driveLine.trim();
    }

    /**
     * 
     * @return BESPEAK_DATE 
     */
    public Date getBespeakDate() {
        return bespeakDate;
    }

    /**
     * 
     * @param bespeakDate 
     */
    public void setBespeakDate(Date bespeakDate) {
        this.bespeakDate = bespeakDate;
    }

    /**
     * 故事地点
     * @return SURVEY_PLACE 故事地点
     */
    public String getSurveyPlace() {
        return surveyPlace;
    }

    /**
     * 故事地点
     * @param surveyPlace 故事地点
     */
    public void setSurveyPlace(String surveyPlace) {
        this.surveyPlace = surveyPlace == null ? null : surveyPlace.trim();
    }

    /**
     * 
     * @return SURVEY_LNG 
     */
    public String getSurveyLng() {
        return surveyLng;
    }

    /**
     * 
     * @param surveyLng 
     */
    public void setSurveyLng(String surveyLng) {
        this.surveyLng = surveyLng == null ? null : surveyLng.trim();
    }

    /**
     * 
     * @return SURVEY_LAT 
     */
    public String getSurveyLat() {
        return surveyLat;
    }

    /**
     * 
     * @param surveyLat 
     */
    public void setSurveyLat(String surveyLat) {
        this.surveyLat = surveyLat == null ? null : surveyLat.trim();
    }

    /**
     * 
     * @return EVAL_PLACE 
     */
    public String getEvalPlace() {
        return evalPlace;
    }

    /**
     * 
     * @param evalPlace 
     */
    public void setEvalPlace(String evalPlace) {
        this.evalPlace = evalPlace == null ? null : evalPlace.trim();
    }

    /**
     * 
     * @return EVAL_PLACE_LNG 
     */
    public String getEvalPlaceLng() {
        return evalPlaceLng;
    }

    /**
     * 
     * @param evalPlaceLng 
     */
    public void setEvalPlaceLng(String evalPlaceLng) {
        this.evalPlaceLng = evalPlaceLng == null ? null : evalPlaceLng.trim();
    }

    /**
     * 
     * @return EVAL_PLACE_LAT 
     */
    public String getEvalPlaceLat() {
        return evalPlaceLat;
    }

    /**
     * 
     * @param evalPlaceLat 
     */
    public void setEvalPlaceLat(String evalPlaceLat) {
        this.evalPlaceLat = evalPlaceLat == null ? null : evalPlaceLat.trim();
    }

    /**
     * 
     * @return PAY_COMPANY 
     */
    public String getPayCompany() {
        return payCompany;
    }

    /**
     * 
     * @param payCompany 
     */
    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany == null ? null : payCompany.trim();
    }

    /**
     * 
     * @return UPDATE_FLAG 
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * 
     * @param updateFlag 
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag == null ? null : updateFlag.trim();
    }

    /**
     * 取消时间
     * @return CANCEL_DATE 取消时间
     */
    public Date getCancelDate() {
        return cancelDate;
    }

    /**
     * 取消时间
     * @param cancelDate 取消时间
     */
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    /**
     * 添加时间
     * @return CREATE_DATE 添加时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 添加时间
     * @param createDate 添加时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 取消备注
     * @return CANCEL_DESCRIP 取消备注
     */
    public String getCancelDescrip() {
        return cancelDescrip;
    }

    /**
     * 取消备注
     * @param cancelDescrip 取消备注
     */
    public void setCancelDescrip(String cancelDescrip) {
        this.cancelDescrip = cancelDescrip == null ? null : cancelDescrip.trim();
    }

    /**
     * 过桥过路费
     * @return TOLL_PRICE 过桥过路费
     */
    public Double getTollPrice() {
        return tollPrice;
    }

    /**
     * 过桥过路费
     * @param tollPrice 过桥过路费
     */
    public void setTollPrice(Double tollPrice) {
        this.tollPrice = tollPrice;
    }

    /**
     * 过桥过路费支付方式
     * @return TOLL_PAY_TYPE 过桥过路费支付方式
     */
    public String getTollPayType() {
        return tollPayType;
    }

    /**
     * 过桥过路费支付方式
     * @param tollPayType 过桥过路费支付方式
     */
    public void setTollPayType(String tollPayType) {
        this.tollPayType = tollPayType == null ? null : tollPayType.trim();
    }

    /**
     * 始起里程表数
     * @return START_ODOMETER 始起里程表数
     */
    public Double getStartOdometer() {
        return startOdometer;
    }

    /**
     * 始起里程表数
     * @param startOdometer 始起里程表数
     */
    public void setStartOdometer(Double startOdometer) {
        this.startOdometer = startOdometer;
    }

    /**
     * 到底现场里程表数
     * @return ARRIVE_ODOMETER 到底现场里程表数
     */
    public Double getArriveOdometer() {
        return arriveOdometer;
    }

    /**
     * 到底现场里程表数
     * @param arriveOdometer 到底现场里程表数
     */
    public void setArriveOdometer(Double arriveOdometer) {
        this.arriveOdometer = arriveOdometer;
    }

    /**
     * 拖车结束里程表数
     * @return END_ODOMETER 拖车结束里程表数
     */
    public Double getEndOdometer() {
        return endOdometer;
    }

    /**
     * 拖车结束里程表数
     * @param endOdometer 拖车结束里程表数
     */
    public void setEndOdometer(Double endOdometer) {
        this.endOdometer = endOdometer;
    }

    /**
     * 车牌号或车架号
     * @return NUMBER_PLATE 车牌号或车架号
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
     * 车牌号或车架号
     * @param numberPlate 车牌号或车架号
     */
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate == null ? null : numberPlate.trim();
    }

    /**
     * 颜色
     * @return PRODUCT_MODEL 颜色
     */
    public String getProductModel() {
        return productModel;
    }

    /**
     * 颜色
     * @param productModel 颜色
     */
    public void setProductModel(String productModel) {
        this.productModel = productModel == null ? null : productModel.trim();
    }

    /**
     * 车型
     * @return VEHICLE_NAME 车型
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * 车型
     * @param vehicleName 车型
     */
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName == null ? null : vehicleName.trim();
    }

    /**
     * 救援项目:(10-搭电、11-拖车、12-补胎、13-加油、14-维修、15-其他)
     * @return RESCUE_ITEM_TYPE 救援项目:(10-搭电、11-拖车、12-补胎、13-加油、14-维修、15-其他)
     */
    public String getRescueItemType() {
        return rescueItemType;
    }

    /**
     * 救援项目:(10-搭电、11-拖车、12-补胎、13-加油、14-维修、15-其他)
     * @param rescueItemType 救援项目:(10-搭电、11-拖车、12-补胎、13-加油、14-维修、15-其他)
     */
    public void setRescueItemType(String rescueItemType) {
        this.rescueItemType = rescueItemType == null ? null : rescueItemType.trim();
    }

    /**
     * 救援备注
     * @return RESCUE_REMARK 救援备注
     */
    public String getRescueRemark() {
        return rescueRemark;
    }

    /**
     * 救援备注
     * @param rescueRemark 救援备注
     */
    public void setRescueRemark(String rescueRemark) {
        this.rescueRemark = rescueRemark == null ? null : rescueRemark.trim();
    }

    /**
     * 客户电话
     * @return MOBLE_PHONE 客户电话
     */
    public String getMoblePhone() {
        return moblePhone;
    }

    /**
     * 客户电话
     * @param moblePhone 客户电话
     */
    public void setMoblePhone(String moblePhone) {
        this.moblePhone = moblePhone == null ? null : moblePhone.trim();
    }

    /**
     * 接车电话
     * @return JIECHE_PHONE 接车电话
     */
    public String getJiechePhone() {
        return jiechePhone;
    }

    /**
     * 接车电话
     * @param jiechePhone 接车电话
     */
    public void setJiechePhone(String jiechePhone) {
        this.jiechePhone = jiechePhone == null ? null : jiechePhone.trim();
    }

    /**
     * 客户姓名
     * @return MOBLE_PHONE_NAME 客户姓名
     */
    public String getMoblePhoneName() {
        return moblePhoneName;
    }

    /**
     * 客户姓名
     * @param moblePhoneName 客户姓名
     */
    public void setMoblePhoneName(String moblePhoneName) {
        this.moblePhoneName = moblePhoneName == null ? null : moblePhoneName.trim();
    }

    /**
     * 接车姓名
     * @return JIECHE_PHONE_NAME 接车姓名
     */
    public String getJiechePhoneName() {
        return jiechePhoneName;
    }

    /**
     * 接车姓名
     * @param jiechePhoneName 接车姓名
     */
    public void setJiechePhoneName(String jiechePhoneName) {
        this.jiechePhoneName = jiechePhoneName == null ? null : jiechePhoneName.trim();
    }

    /**
     * 
     * @return SAVE_VEHICLE_TYPE 
     */
    public String getSaveVehicleType() {
        return saveVehicleType;
    }

    /**
     * 
     * @param saveVehicleType 
     */
    public void setSaveVehicleType(String saveVehicleType) {
        this.saveVehicleType = saveVehicleType == null ? null : saveVehicleType.trim();
    }

    /**
     * 务话注备
     * @return DISPATCH_DESCRIP 务话注备
     */
    public String getDispatchDescrip() {
        return dispatchDescrip;
    }

    /**
     * 务话注备
     * @param dispatchDescrip 务话注备
     */
    public void setDispatchDescrip(String dispatchDescrip) {
        this.dispatchDescrip = dispatchDescrip == null ? null : dispatchDescrip.trim();
    }

    /**
     * 是否在五环内：0-否、1-是
     * @return IS_FIVE_RING 是否在五环内：0-否、1-是
     */
    public String getIsFiveRing() {
        return isFiveRing;
    }

    /**
     * 是否在五环内：0-否、1-是
     * @param isFiveRing 是否在五环内：0-否、1-是
     */
    public void setIsFiveRing(String isFiveRing) {
        this.isFiveRing = isFiveRing == null ? null : isFiveRing.trim();
    }

    /**
     * 受理请申时间(派遣开始时间)
     * @return ACCEPTANCE_ASK_DATE 受理请申时间(派遣开始时间)
     */
    public Date getAcceptanceAskDate() {
        return acceptanceAskDate;
    }

    /**
     * 受理请申时间(派遣开始时间)
     * @param acceptanceAskDate 受理请申时间(派遣开始时间)
     */
    public void setAcceptanceAskDate(Date acceptanceAskDate) {
        this.acceptanceAskDate = acceptanceAskDate;
    }

    /**
     * 受理成功时间(派遣成功时间)
     * @return ACCEPTANCE_SUCCESS_DATE 受理成功时间(派遣成功时间)
     */
    public Date getAcceptanceSuccessDate() {
        return acceptanceSuccessDate;
    }

    /**
     * 受理成功时间(派遣成功时间)
     * @param acceptanceSuccessDate 受理成功时间(派遣成功时间)
     */
    public void setAcceptanceSuccessDate(Date acceptanceSuccessDate) {
        this.acceptanceSuccessDate = acceptanceSuccessDate;
    }

    /**
     * 
     * @return DEVOLVE_FLAG 
     */
    public String getDevolveFlag() {
        return devolveFlag;
    }

    /**
     * 
     * @param devolveFlag 
     */
    public void setDevolveFlag(String devolveFlag) {
        this.devolveFlag = devolveFlag == null ? null : devolveFlag.trim();
    }

    /**
     * 短信发送标志：1-已发送、0-未发送
     * @return SMS_SEND_FLAG 短信发送标志：1-已发送、0-未发送
     */
    public String getSmsSendFlag() {
        return smsSendFlag;
    }

    /**
     * 短信发送标志：1-已发送、0-未发送
     * @param smsSendFlag 短信发送标志：1-已发送、0-未发送
     */
    public void setSmsSendFlag(String smsSendFlag) {
        this.smsSendFlag = smsSendFlag == null ? null : smsSendFlag.trim();
    }

    /**
     * 路修：爆胎个数（1/2/3/4）
     * @return LX_BTGS_STATE 路修：爆胎个数（1/2/3/4）
     */
    public String getLxBtgsState() {
        return lxBtgsState;
    }

    /**
     * 路修：爆胎个数（1/2/3/4）
     * @param lxBtgsState 路修：爆胎个数（1/2/3/4）
     */
    public void setLxBtgsState(String lxBtgsState) {
        this.lxBtgsState = lxBtgsState == null ? null : lxBtgsState.trim();
    }

    /**
     * 路修：备胎完好（1是2否）
     * @return LX_BTWH_STATE 路修：备胎完好（1是2否）
     */
    public String getLxBtwhState() {
        return lxBtwhState;
    }

    /**
     * 路修：备胎完好（1是2否）
     * @param lxBtwhState 路修：备胎完好（1是2否）
     */
    public void setLxBtwhState(String lxBtwhState) {
        this.lxBtwhState = lxBtwhState == null ? null : lxBtwhState.trim();
    }

    /**
     * 路修：电瓶位置（1前置-机舱2后置-后备箱3中间-车内）
     * @return LX_DPWZ_STATE 路修：电瓶位置（1前置-机舱2后置-后备箱3中间-车内）
     */
    public String getLxDpwzState() {
        return lxDpwzState;
    }

    /**
     * 路修：电瓶位置（1前置-机舱2后置-后备箱3中间-车内）
     * @param lxDpwzState 路修：电瓶位置（1前置-机舱2后置-后备箱3中间-车内）
     */
    public void setLxDpwzState(String lxDpwzState) {
        this.lxDpwzState = lxDpwzState == null ? null : lxDpwzState.trim();
    }

    /**
     * 路修：防盗螺丝（1是2否）
     * @return LX_FDLS_STATE 路修：防盗螺丝（1是2否）
     */
    public String getLxFdlsState() {
        return lxFdlsState;
    }

    /**
     * 路修：防盗螺丝（1是2否）
     * @param lxFdlsState 路修：防盗螺丝（1是2否）
     */
    public void setLxFdlsState(String lxFdlsState) {
        this.lxFdlsState = lxFdlsState == null ? null : lxFdlsState.trim();
    }

    /**
     * 路修：混合动力（1是2否）
     * @return LX_HHDL_STATE 路修：混合动力（1是2否）
     */
    public String getLxHhdlState() {
        return lxHhdlState;
    }

    /**
     * 路修：混合动力（1是2否）
     * @param lxHhdlState 路修：混合动力（1是2否）
     */
    public void setLxHhdlState(String lxHhdlState) {
        this.lxHhdlState = lxHhdlState == null ? null : lxHhdlState.trim();
    }

    /**
     * 路修：换胎工具（1是2否）
     * @return LX_HTGJ_STATE 路修：换胎工具（1是2否）
     */
    public String getLxHtgjState() {
        return lxHtgjState;
    }

    /**
     * 路修：换胎工具（1是2否）
     * @param lxHtgjState 路修：换胎工具（1是2否）
     */
    public void setLxHtgjState(String lxHtgjState) {
        this.lxHtgjState = lxHtgjState == null ? null : lxHtgjState.trim();
    }

    /**
     * 路修：加油工具（1有2无）
     * @return LX_JYGJ_STATE 路修：加油工具（1有2无）
     */
    public String getLxJygjState() {
        return lxJygjState;
    }

    /**
     * 路修：加油工具（1有2无）
     * @param lxJygjState 路修：加油工具（1有2无）
     */
    public void setLxJygjState(String lxJygjState) {
        this.lxJygjState = lxJygjState == null ? null : lxJygjState.trim();
    }

    /**
     * 路修：空间（1有2无）
     * @return LX_KJ_STATE 路修：空间（1有2无）
     */
    public String getLxKjState() {
        return lxKjState;
    }

    /**
     * 路修：空间（1有2无）
     * @param lxKjState 路修：空间（1有2无）
     */
    public void setLxKjState(String lxKjState) {
        this.lxKjState = lxKjState == null ? null : lxKjState.trim();
    }

    /**
     * 路修：燃油类型（1汽油2柴油）
     * @return LX_RYLX_STATE 路修：燃油类型（1汽油2柴油）
     */
    public String getLxRylxState() {
        return lxRylxState;
    }

    /**
     * 路修：燃油类型（1汽油2柴油）
     * @param lxRylxState 路修：燃油类型（1汽油2柴油）
     */
    public void setLxRylxState(String lxRylxState) {
        this.lxRylxState = lxRylxState == null ? null : lxRylxState.trim();
    }

    /**
     * 路修：是否改装（1是2否）
     * @return LX_SFGZ_STATE 路修：是否改装（1是2否）
     */
    public String getLxSfgzState() {
        return lxSfgzState;
    }

    /**
     * 路修：是否改装（1是2否）
     * @param lxSfgzState 路修：是否改装（1是2否）
     */
    public void setLxSfgzState(String lxSfgzState) {
        this.lxSfgzState = lxSfgzState == null ? null : lxSfgzState.trim();
    }

    /**
     * 路修：是否有备胎（1是2否）
     * @return LX_SFYBT_STATE 路修：是否有备胎（1是2否）
     */
    public String getLxSfybtState() {
        return lxSfybtState;
    }

    /**
     * 路修：是否有备胎（1是2否）
     * @param lxSfybtState 路修：是否有备胎（1是2否）
     */
    public void setLxSfybtState(String lxSfybtState) {
        this.lxSfybtState = lxSfybtState == null ? null : lxSfybtState.trim();
    }

    /**
     * 路修：位置（1左前2右前3左后4右后）
     * @return LX_WZ_STATE 路修：位置（1左前2右前3左后4右后）
     */
    public String getLxWzState() {
        return lxWzState;
    }

    /**
     * 路修：位置（1左前2右前3左后4右后）
     * @param lxWzState 路修：位置（1左前2右前3左后4右后）
     */
    public void setLxWzState(String lxWzState) {
        this.lxWzState = lxWzState == null ? null : lxWzState.trim();
    }

    /**
     * 路修：油号#90#92#93#95#97    0号   #-10#-20#-30
     * @return LX_YH 路修：油号#90#92#93#95#97    0号   #-10#-20#-30
     */
    public String getLxYh() {
        return lxYh;
    }

    /**
     * 路修：油号#90#92#93#95#97    0号   #-10#-20#-30
     * @param lxYh 路修：油号#90#92#93#95#97    0号   #-10#-20#-30
     */
    public void setLxYh(String lxYh) {
        this.lxYh = lxYh == null ? null : lxYh.trim();
    }

    /**
     * 加油升数
     * @return LX_SS 加油升数
     */
    public Double getLxSs() {
        return lxSs;
    }

    /**
     * 加油升数
     * @param lxSs 加油升数
     */
    public void setLxSs(Double lxSs) {
        this.lxSs = lxSs;
    }

    /**
     * 拖车：车辆位置（1地上车库、2地下车库、3地面）
     * @return TC_CLWZ_TYPE 拖车：车辆位置（1地上车库、2地下车库、3地面）
     */
    public String getTcClwzType() {
        return tcClwzType;
    }

    /**
     * 拖车：车辆位置（1地上车库、2地下车库、3地面）
     * @param tcClwzType 拖车：车辆位置（1地上车库、2地下车库、3地面）
     */
    public void setTcClwzType(String tcClwzType) {
        this.tcClwzType = tcClwzType == null ? null : tcClwzType.trim();
    }

    /**
     * 拖车：方向盘（1可转动、2锁死）
     * @return TC_FXP_STATE 拖车：方向盘（1可转动、2锁死）
     */
    public String getTcFxpState() {
        return tcFxpState;
    }

    /**
     * 拖车：方向盘（1可转动、2锁死）
     * @param tcFxpState 拖车：方向盘（1可转动、2锁死）
     */
    public void setTcFxpState(String tcFxpState) {
        this.tcFxpState = tcFxpState == null ? null : tcFxpState.trim();
    }

    /**
     * 拖车：减速带（1有、2无）
     * @return TC_JSD_STATE 拖车：减速带（1有、2无）
     */
    public String getTcJsdState() {
        return tcJsdState;
    }

    /**
     * 拖车：减速带（1有、2无）
     * @param tcJsdState 拖车：减速带（1有、2无）
     */
    public void setTcJsdState(String tcJsdState) {
        this.tcJsdState = tcJsdState == null ? null : tcJsdState.trim();
    }

    /**
     * 拖车：坡度（1平缓、2陡峭）
     * @return TC_PD_STATE 拖车：坡度（1平缓、2陡峭）
     */
    public String getTcPdState() {
        return tcPdState;
    }

    /**
     * 拖车：坡度（1平缓、2陡峭）
     * @param tcPdState 拖车：坡度（1平缓、2陡峭）
     */
    public void setTcPdState(String tcPdState) {
        this.tcPdState = tcPdState == null ? null : tcPdState.trim();
    }

    /**
     * 拖车：手刹（1是2否）
     * @return TC_SHOUSHA_TYPE 拖车：手刹（1是2否）
     */
    public String getTcShoushaType() {
        return tcShoushaType;
    }

    /**
     * 拖车：手刹（1是2否）
     * @param tcShoushaType 拖车：手刹（1是2否）
     */
    public void setTcShoushaType(String tcShoushaType) {
        this.tcShoushaType = tcShoushaType == null ? null : tcShoushaType.trim();
    }

    /**
     * 拖车：拖车钩（1有、2无）
     * @return TC_TCG_STATE 拖车：拖车钩（1有、2无）
     */
    public String getTcTcgState() {
        return tcTcgState;
    }

    /**
     * 拖车：拖车钩（1有、2无）
     * @param tcTcgState 拖车：拖车钩（1有、2无）
     */
    public void setTcTcgState(String tcTcgState) {
        this.tcTcgState = tcTcgState == null ? null : tcTcgState.trim();
    }

    /**
     * 拖车：拖车空间（1有、2无）
     * @return TC_TCKJ_STATE 拖车：拖车空间（1有、2无）
     */
    public String getTcTckjState() {
        return tcTckjState;
    }

    /**
     * 拖车：拖车空间（1有、2无）
     * @param tcTckjState 拖车：拖车空间（1有、2无）
     */
    public void setTcTckjState(String tcTckjState) {
        this.tcTckjState = tcTckjState == null ? null : tcTckjState.trim();
    }

    /**
     * 拖车：弯道（1圆弧形、2螺旋形、3折返形、4U形）
     * @return TC_WD_STATE 拖车：弯道（1圆弧形、2螺旋形、3折返形、4U形）
     */
    public String getTcWdState() {
        return tcWdState;
    }

    /**
     * 拖车：弯道（1圆弧形、2螺旋形、3折返形、4U形）
     * @param tcWdState 拖车：弯道（1圆弧形、2螺旋形、3折返形、4U形）
     */
    public void setTcWdState(String tcWdState) {
        this.tcWdState = tcWdState == null ? null : tcWdState.trim();
    }

    /**
     * 拖车：限高（1:2米以内、2:2-3米、3:3-5米、4：5米以上）
     * @return TC_XG_STATE 拖车：限高（1:2米以内、2:2-3米、3:3-5米、4：5米以上）
     */
    public String getTcXgState() {
        return tcXgState;
    }

    /**
     * 拖车：限高（1:2米以内、2:2-3米、3:3-5米、4：5米以上）
     * @param tcXgState 拖车：限高（1:2米以内、2:2-3米、3:3-5米、4：5米以上）
     */
    public void setTcXgState(String tcXgState) {
        this.tcXgState = tcXgState == null ? null : tcXgState.trim();
    }

    /**
     * 拖车：档位（1是、2否）
     * @return TC_DW_STATE 拖车：档位（1是、2否）
     */
    public String getTcDwState() {
        return tcDwState;
    }

    /**
     * 拖车：档位（1是、2否）
     * @param tcDwState 拖车：档位（1是、2否）
     */
    public void setTcDwState(String tcDwState) {
        this.tcDwState = tcDwState == null ? null : tcDwState.trim();
    }

    /**
     * 车库（1是、2否）
     * @return TC_CK 车库（1是、2否）
     */
    public String getTcCk() {
        return tcCk;
    }

    /**
     * 车库（1是、2否）
     * @param tcCk 车库（1是、2否）
     */
    public void setTcCk(String tcCk) {
        this.tcCk = tcCk == null ? null : tcCk.trim();
    }

    /**
     * 待定时间
     * @return AWAIT_DATE 待定时间
     */
    public Date getAwaitDate() {
        return awaitDate;
    }

    /**
     * 待定时间
     * @param awaitDate 待定时间
     */
    public void setAwaitDate(Date awaitDate) {
        this.awaitDate = awaitDate;
    }

    /**
     * 待定状态
     * @return AWAIT_STATE 待定状态
     */
    public String getAwaitState() {
        return awaitState;
    }

    /**
     * 待定状态
     * @param awaitState 待定状态
     */
    public void setAwaitState(String awaitState) {
        this.awaitState = awaitState == null ? null : awaitState.trim();
    }
}