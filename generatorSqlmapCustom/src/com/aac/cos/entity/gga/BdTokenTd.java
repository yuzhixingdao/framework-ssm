package com.aac.cos.entity.gga;

public class BdTokenTd {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String tokenId;

    /**
     * token与通道关系表
     */
    private String tdId;

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
     * token与通道关系表
     * @return TD_ID token与通道关系表
     */
    public String getTdId() {
        return tdId;
    }

    /**
     * token与通道关系表
     * @param tdId token与通道关系表
     */
    public void setTdId(String tdId) {
        this.tdId = tdId == null ? null : tdId.trim();
    }
}