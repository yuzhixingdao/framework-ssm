package com.aac.cos.entity.gga;

import java.util.Date;

public class AccessToken {
    /**
     * 
     */
    private String tokenId;

    /**
     * 
     */
    private String accessToken;

    /**
     * 
     */
    private String terminalType;

    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private String isContentMian;

    /**
     * 备注、说明
     */
    private String remarks;

    /**
     * 
     * @return TOKEN_ID 
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * 
     * @param tokenId 
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    /**
     * 
     * @return ACCESS_TOKEN 
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 
     * @param accessToken 
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    /**
     * 
     * @return TERMINAL_TYPE 
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * 
     * @param terminalType 
     */
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    /**
     * 
     * @return USER_ID 
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 
     * @return CREATE_DATE 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 
     * @param createDate 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 
     * @return IS_CONTENT_MIAN 
     */
    public String getIsContentMian() {
        return isContentMian;
    }

    /**
     * 
     * @param isContentMian 
     */
    public void setIsContentMian(String isContentMian) {
        this.isContentMian = isContentMian == null ? null : isContentMian.trim();
    }

    /**
     * 备注、说明
     * @return REMARKS 备注、说明
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注、说明
     * @param remarks 备注、说明
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}