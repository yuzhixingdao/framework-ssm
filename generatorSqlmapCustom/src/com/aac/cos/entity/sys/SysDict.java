package com.aac.cos.entity.sys;

import java.util.Date;

public class SysDict {
    /**
     * 编号
     */
    private Long id;

    /**
     * 标签名
     */
    private String dictLabel;

    /**
     * 数据值
     */
    private String dictValue;

    /**
     * 类型
     */
    private String dictType;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序（升序）
     */
    private Integer dictSort;

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
     * 备注信息
     */
    private String remarks;

    /**
     * 删除标记
     */
    private Byte delFlag;

    /**
     * 编号
     * @return id 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 编号
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 标签名
     * @return dict_label 标签名
     */
    public String getDictLabel() {
        return dictLabel;
    }

    /**
     * 标签名
     * @param dictLabel 标签名
     */
    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel == null ? null : dictLabel.trim();
    }

    /**
     * 数据值
     * @return dict_value 数据值
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * 数据值
     * @param dictValue 数据值
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    /**
     * 类型
     * @return dict_type 类型
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * 类型
     * @param dictType 类型
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
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
     * 排序（升序）
     * @return dict_sort 排序（升序）
     */
    public Integer getDictSort() {
        return dictSort;
    }

    /**
     * 排序（升序）
     * @param dictSort 排序（升序）
     */
    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
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
     * 备注信息
     * @return remarks 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注信息
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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