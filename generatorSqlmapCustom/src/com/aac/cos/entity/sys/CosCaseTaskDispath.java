package com.aac.cos.entity.sys;

import java.util.Date;

public class CosCaseTaskDispath {
    /**
     * 主键
     */
    private Long id;

    /**
     * 
     */
    private Long caseId;

    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 服务商ID
     */
    private Long pdId;

    /**
     * 遣派状态:0-待受理、1-拒绝、2-接受
     */
    private String dispathState;

    /**
     * 遣派开始时间
     */
    private Double acceptanceAskDate;

    /**
     * 派遣反馈时间
     */
    private Double acceptanceReturnDate;

    /**
     * 拒绝选项，多项用逗号隔开
     */
    private String refuseOption;

    /**
     * 拒绝原因
     */
    private Double refuseContent;

    /**
     * 拒绝时间
     */
    private Double refuseDate;

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
     * 任务ID
     * @return task_id 任务ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 任务ID
     * @param taskId 任务ID
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 服务商ID
     * @return pd_id 服务商ID
     */
    public Long getPdId() {
        return pdId;
    }

    /**
     * 服务商ID
     * @param pdId 服务商ID
     */
    public void setPdId(Long pdId) {
        this.pdId = pdId;
    }

    /**
     * 遣派状态:0-待受理、1-拒绝、2-接受
     * @return dispath_state 遣派状态:0-待受理、1-拒绝、2-接受
     */
    public String getDispathState() {
        return dispathState;
    }

    /**
     * 遣派状态:0-待受理、1-拒绝、2-接受
     * @param dispathState 遣派状态:0-待受理、1-拒绝、2-接受
     */
    public void setDispathState(String dispathState) {
        this.dispathState = dispathState == null ? null : dispathState.trim();
    }

    /**
     * 遣派开始时间
     * @return ACCEPTANCE_ASK_DATE 遣派开始时间
     */
    public Double getAcceptanceAskDate() {
        return acceptanceAskDate;
    }

    /**
     * 遣派开始时间
     * @param acceptanceAskDate 遣派开始时间
     */
    public void setAcceptanceAskDate(Double acceptanceAskDate) {
        this.acceptanceAskDate = acceptanceAskDate;
    }

    /**
     * 派遣反馈时间
     * @return ACCEPTANCE_RETURN_DATE 派遣反馈时间
     */
    public Double getAcceptanceReturnDate() {
        return acceptanceReturnDate;
    }

    /**
     * 派遣反馈时间
     * @param acceptanceReturnDate 派遣反馈时间
     */
    public void setAcceptanceReturnDate(Double acceptanceReturnDate) {
        this.acceptanceReturnDate = acceptanceReturnDate;
    }

    /**
     * 拒绝选项，多项用逗号隔开
     * @return REFUSE_OPTION 拒绝选项，多项用逗号隔开
     */
    public String getRefuseOption() {
        return refuseOption;
    }

    /**
     * 拒绝选项，多项用逗号隔开
     * @param refuseOption 拒绝选项，多项用逗号隔开
     */
    public void setRefuseOption(String refuseOption) {
        this.refuseOption = refuseOption == null ? null : refuseOption.trim();
    }

    /**
     * 拒绝原因
     * @return REFUSE_CONTENT 拒绝原因
     */
    public Double getRefuseContent() {
        return refuseContent;
    }

    /**
     * 拒绝原因
     * @param refuseContent 拒绝原因
     */
    public void setRefuseContent(Double refuseContent) {
        this.refuseContent = refuseContent;
    }

    /**
     * 拒绝时间
     * @return REFUSE_DATE 拒绝时间
     */
    public Double getRefuseDate() {
        return refuseDate;
    }

    /**
     * 拒绝时间
     * @param refuseDate 拒绝时间
     */
    public void setRefuseDate(Double refuseDate) {
        this.refuseDate = refuseDate;
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