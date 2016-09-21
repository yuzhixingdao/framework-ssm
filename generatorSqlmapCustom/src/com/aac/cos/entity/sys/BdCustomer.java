package com.aac.cos.entity.sys;

import java.util.Date;

public class BdCustomer {
    /**
     * 主键
     */
    private Long id;

    /**
     * 所属通道
     */
    private Long conlinId;

    /**
     * 客户姓名
     */
    private String cusName;

    /**
     *  客户性别：1- 先生、0-女士
     */
    private Byte cusSex;

    /**
     * 客户联系电话
     */
    private String cusNumber;

    /**
     * 客户级别
     */
    private String cusLevel;

    /**
     * 客户身份证
     */
    private String cusIdcard;

    /**
     * 客户居住地
     */
    private String cusAddress;

    /**
     * 客户省份
     */
    private String cusProvince;

    /**
     * 客户城市
     */
    private String cusCity;

    /**
     * 客户邮编
     */
    private String cusZipCode;

    /**
     * 客户备注
     */
    private String cusRemark;

    /**
     * 
     */
    private String policyNumber;

    /**
     * 
     */
    private String cardNumber;

    /**
     * 开卡日期
     */
    private Date openCardDate;

    /**
     * 购险日期
     */
    private Date purchasedDates;

    /**
     * 服务生效日期
     */
    private Date serStartDate;

    /**
     * 服务截止日期
     */
    private Date serEndDate;

    /**
     * 服务备注
     */
    private String serRemark;

    /**
     * 
     */
    private String vinNumber;

    /**
     * 车牌号
     */
    private String plateNumber;

    /**
     * 车辆颜色
     */
    private String carColor;

    /**
     * 车辆品牌
     */
    private String carBrand;

    /**
     * 车辆车型
     */
    private String carModel;

    /**
     * 车辆系列
     */
    private String carSeries;

    /**
     * 
     */
    private String powerType;

    /**
     * 驱动方式
     */
    private String driveMode;

    /**
     * 购车日期
     */
    private Date purchasedCarDate;

    /**
     * 购车经销商
     */
    private String purchasedCardealer;

    /**
     * 车辆备注
     */
    private String carRemark;

    /**
     * 驾驶证照片
     */
    private String drivingPhoto;

    /**
     * 行驶证照片
     */
    private String runPhoto;

    /**
     * 车辆照片
     */
    private String carPhot;

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
     * 所属通道
     * @return conlin_id 所属通道
     */
    public Long getConlinId() {
        return conlinId;
    }

    /**
     * 所属通道
     * @param conlinId 所属通道
     */
    public void setConlinId(Long conlinId) {
        this.conlinId = conlinId;
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
     *  客户性别：1- 先生、0-女士
     * @return cus_sex  客户性别：1- 先生、0-女士
     */
    public Byte getCusSex() {
        return cusSex;
    }

    /**
     *  客户性别：1- 先生、0-女士
     * @param cusSex  客户性别：1- 先生、0-女士
     */
    public void setCusSex(Byte cusSex) {
        this.cusSex = cusSex;
    }

    /**
     * 客户联系电话
     * @return cus_number 客户联系电话
     */
    public String getCusNumber() {
        return cusNumber;
    }

    /**
     * 客户联系电话
     * @param cusNumber 客户联系电话
     */
    public void setCusNumber(String cusNumber) {
        this.cusNumber = cusNumber == null ? null : cusNumber.trim();
    }

    /**
     * 客户级别
     * @return cus_level 客户级别
     */
    public String getCusLevel() {
        return cusLevel;
    }

    /**
     * 客户级别
     * @param cusLevel 客户级别
     */
    public void setCusLevel(String cusLevel) {
        this.cusLevel = cusLevel == null ? null : cusLevel.trim();
    }

    /**
     * 客户身份证
     * @return cus_idcard 客户身份证
     */
    public String getCusIdcard() {
        return cusIdcard;
    }

    /**
     * 客户身份证
     * @param cusIdcard 客户身份证
     */
    public void setCusIdcard(String cusIdcard) {
        this.cusIdcard = cusIdcard == null ? null : cusIdcard.trim();
    }

    /**
     * 客户居住地
     * @return cus_address 客户居住地
     */
    public String getCusAddress() {
        return cusAddress;
    }

    /**
     * 客户居住地
     * @param cusAddress 客户居住地
     */
    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress == null ? null : cusAddress.trim();
    }

    /**
     * 客户省份
     * @return cus_province 客户省份
     */
    public String getCusProvince() {
        return cusProvince;
    }

    /**
     * 客户省份
     * @param cusProvince 客户省份
     */
    public void setCusProvince(String cusProvince) {
        this.cusProvince = cusProvince == null ? null : cusProvince.trim();
    }

    /**
     * 客户城市
     * @return cus_city 客户城市
     */
    public String getCusCity() {
        return cusCity;
    }

    /**
     * 客户城市
     * @param cusCity 客户城市
     */
    public void setCusCity(String cusCity) {
        this.cusCity = cusCity == null ? null : cusCity.trim();
    }

    /**
     * 客户邮编
     * @return cus_zip_code 客户邮编
     */
    public String getCusZipCode() {
        return cusZipCode;
    }

    /**
     * 客户邮编
     * @param cusZipCode 客户邮编
     */
    public void setCusZipCode(String cusZipCode) {
        this.cusZipCode = cusZipCode == null ? null : cusZipCode.trim();
    }

    /**
     * 客户备注
     * @return cus_remark 客户备注
     */
    public String getCusRemark() {
        return cusRemark;
    }

    /**
     * 客户备注
     * @param cusRemark 客户备注
     */
    public void setCusRemark(String cusRemark) {
        this.cusRemark = cusRemark == null ? null : cusRemark.trim();
    }

    /**
     * 
     * @return policy_number 
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * 
     * @param policyNumber 
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber == null ? null : policyNumber.trim();
    }

    /**
     * 
     * @return card_number 
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 
     * @param cardNumber 
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    /**
     * 开卡日期
     * @return open_card_date 开卡日期
     */
    public Date getOpenCardDate() {
        return openCardDate;
    }

    /**
     * 开卡日期
     * @param openCardDate 开卡日期
     */
    public void setOpenCardDate(Date openCardDate) {
        this.openCardDate = openCardDate;
    }

    /**
     * 购险日期
     * @return purchased_dates 购险日期
     */
    public Date getPurchasedDates() {
        return purchasedDates;
    }

    /**
     * 购险日期
     * @param purchasedDates 购险日期
     */
    public void setPurchasedDates(Date purchasedDates) {
        this.purchasedDates = purchasedDates;
    }

    /**
     * 服务生效日期
     * @return ser_start_date 服务生效日期
     */
    public Date getSerStartDate() {
        return serStartDate;
    }

    /**
     * 服务生效日期
     * @param serStartDate 服务生效日期
     */
    public void setSerStartDate(Date serStartDate) {
        this.serStartDate = serStartDate;
    }

    /**
     * 服务截止日期
     * @return ser_end_date 服务截止日期
     */
    public Date getSerEndDate() {
        return serEndDate;
    }

    /**
     * 服务截止日期
     * @param serEndDate 服务截止日期
     */
    public void setSerEndDate(Date serEndDate) {
        this.serEndDate = serEndDate;
    }

    /**
     * 服务备注
     * @return ser_remark 服务备注
     */
    public String getSerRemark() {
        return serRemark;
    }

    /**
     * 服务备注
     * @param serRemark 服务备注
     */
    public void setSerRemark(String serRemark) {
        this.serRemark = serRemark == null ? null : serRemark.trim();
    }

    /**
     * 
     * @return vin_number 
     */
    public String getVinNumber() {
        return vinNumber;
    }

    /**
     * 
     * @param vinNumber 
     */
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber == null ? null : vinNumber.trim();
    }

    /**
     * 车牌号
     * @return plate_number 车牌号
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 车牌号
     * @param plateNumber 车牌号
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    /**
     * 车辆颜色
     * @return car_color 车辆颜色
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * 车辆颜色
     * @param carColor 车辆颜色
     */
    public void setCarColor(String carColor) {
        this.carColor = carColor == null ? null : carColor.trim();
    }

    /**
     * 车辆品牌
     * @return car_brand 车辆品牌
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * 车辆品牌
     * @param carBrand 车辆品牌
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    /**
     * 车辆车型
     * @return car_model 车辆车型
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 车辆车型
     * @param carModel 车辆车型
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel == null ? null : carModel.trim();
    }

    /**
     * 车辆系列
     * @return car_series 车辆系列
     */
    public String getCarSeries() {
        return carSeries;
    }

    /**
     * 车辆系列
     * @param carSeries 车辆系列
     */
    public void setCarSeries(String carSeries) {
        this.carSeries = carSeries == null ? null : carSeries.trim();
    }

    /**
     * 
     * @return power_type 
     */
    public String getPowerType() {
        return powerType;
    }

    /**
     * 
     * @param powerType 
     */
    public void setPowerType(String powerType) {
        this.powerType = powerType == null ? null : powerType.trim();
    }

    /**
     * 驱动方式
     * @return drive_mode 驱动方式
     */
    public String getDriveMode() {
        return driveMode;
    }

    /**
     * 驱动方式
     * @param driveMode 驱动方式
     */
    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode == null ? null : driveMode.trim();
    }

    /**
     * 购车日期
     * @return purchased_car_date 购车日期
     */
    public Date getPurchasedCarDate() {
        return purchasedCarDate;
    }

    /**
     * 购车日期
     * @param purchasedCarDate 购车日期
     */
    public void setPurchasedCarDate(Date purchasedCarDate) {
        this.purchasedCarDate = purchasedCarDate;
    }

    /**
     * 购车经销商
     * @return purchased_cardealer 购车经销商
     */
    public String getPurchasedCardealer() {
        return purchasedCardealer;
    }

    /**
     * 购车经销商
     * @param purchasedCardealer 购车经销商
     */
    public void setPurchasedCardealer(String purchasedCardealer) {
        this.purchasedCardealer = purchasedCardealer == null ? null : purchasedCardealer.trim();
    }

    /**
     * 车辆备注
     * @return car_remark 车辆备注
     */
    public String getCarRemark() {
        return carRemark;
    }

    /**
     * 车辆备注
     * @param carRemark 车辆备注
     */
    public void setCarRemark(String carRemark) {
        this.carRemark = carRemark == null ? null : carRemark.trim();
    }

    /**
     * 驾驶证照片
     * @return driving_photo 驾驶证照片
     */
    public String getDrivingPhoto() {
        return drivingPhoto;
    }

    /**
     * 驾驶证照片
     * @param drivingPhoto 驾驶证照片
     */
    public void setDrivingPhoto(String drivingPhoto) {
        this.drivingPhoto = drivingPhoto == null ? null : drivingPhoto.trim();
    }

    /**
     * 行驶证照片
     * @return run_photo 行驶证照片
     */
    public String getRunPhoto() {
        return runPhoto;
    }

    /**
     * 行驶证照片
     * @param runPhoto 行驶证照片
     */
    public void setRunPhoto(String runPhoto) {
        this.runPhoto = runPhoto == null ? null : runPhoto.trim();
    }

    /**
     * 车辆照片
     * @return car_phot 车辆照片
     */
    public String getCarPhot() {
        return carPhot;
    }

    /**
     * 车辆照片
     * @param carPhot 车辆照片
     */
    public void setCarPhot(String carPhot) {
        this.carPhot = carPhot == null ? null : carPhot.trim();
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