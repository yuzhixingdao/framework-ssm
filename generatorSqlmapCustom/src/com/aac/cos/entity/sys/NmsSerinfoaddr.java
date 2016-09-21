package com.aac.cos.entity.sys;

import java.math.BigDecimal;
import java.util.Date;

public class NmsSerinfoaddr {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商id
     */
    private Long serid;

    /**
     * 省id
     */
    private String province;

    /**
     * 市id
     */
    private String city;

    /**
     * 区县id
     */
    private String area;

    /**
     * 地址
     */
    private String addr;

    /**
     * 注册地址
     */
    private String registeraddr;

    /**
     * 办公地址
     */
    private String workaddr;

    /**
     * 发车地址
     */
    private String departaddr;

    /**
     * 拖车
     */
    private String trailer;

    /**
     * 路修
     */
    private String roads;

    /**
     * 经度
     */
    private BigDecimal ymap;

    /**
     * 纬度
     */
    private BigDecimal xmap;

    /**
     * 
     */
    private String geoHash;

    /**
     * 邮编
     */
    private String zipcode;

    /**
     * 覆盖物类型
     */
    private String fgwlx;

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
     * 服务商id
     * @return serid 服务商id
     */
    public Long getSerid() {
        return serid;
    }

    /**
     * 服务商id
     * @param serid 服务商id
     */
    public void setSerid(Long serid) {
        this.serid = serid;
    }

    /**
     * 省id
     * @return province 省id
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省id
     * @param province 省id
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 市id
     * @return city 市id
     */
    public String getCity() {
        return city;
    }

    /**
     * 市id
     * @param city 市id
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 区县id
     * @return area 区县id
     */
    public String getArea() {
        return area;
    }

    /**
     * 区县id
     * @param area 区县id
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 地址
     * @return addr 地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 地址
     * @param addr 地址
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * 注册地址
     * @return registeraddr 注册地址
     */
    public String getRegisteraddr() {
        return registeraddr;
    }

    /**
     * 注册地址
     * @param registeraddr 注册地址
     */
    public void setRegisteraddr(String registeraddr) {
        this.registeraddr = registeraddr == null ? null : registeraddr.trim();
    }

    /**
     * 办公地址
     * @return workaddr 办公地址
     */
    public String getWorkaddr() {
        return workaddr;
    }

    /**
     * 办公地址
     * @param workaddr 办公地址
     */
    public void setWorkaddr(String workaddr) {
        this.workaddr = workaddr == null ? null : workaddr.trim();
    }

    /**
     * 发车地址
     * @return departaddr 发车地址
     */
    public String getDepartaddr() {
        return departaddr;
    }

    /**
     * 发车地址
     * @param departaddr 发车地址
     */
    public void setDepartaddr(String departaddr) {
        this.departaddr = departaddr == null ? null : departaddr.trim();
    }

    /**
     * 拖车
     * @return trailer 拖车
     */
    public String getTrailer() {
        return trailer;
    }

    /**
     * 拖车
     * @param trailer 拖车
     */
    public void setTrailer(String trailer) {
        this.trailer = trailer == null ? null : trailer.trim();
    }

    /**
     * 路修
     * @return roads 路修
     */
    public String getRoads() {
        return roads;
    }

    /**
     * 路修
     * @param roads 路修
     */
    public void setRoads(String roads) {
        this.roads = roads == null ? null : roads.trim();
    }

    /**
     * 经度
     * @return ymap 经度
     */
    public BigDecimal getYmap() {
        return ymap;
    }

    /**
     * 经度
     * @param ymap 经度
     */
    public void setYmap(BigDecimal ymap) {
        this.ymap = ymap;
    }

    /**
     * 纬度
     * @return xmap 纬度
     */
    public BigDecimal getXmap() {
        return xmap;
    }

    /**
     * 纬度
     * @param xmap 纬度
     */
    public void setXmap(BigDecimal xmap) {
        this.xmap = xmap;
    }

    /**
     * 
     * @return geo_hash 
     */
    public String getGeoHash() {
        return geoHash;
    }

    /**
     * 
     * @param geoHash 
     */
    public void setGeoHash(String geoHash) {
        this.geoHash = geoHash == null ? null : geoHash.trim();
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
     * 覆盖物类型
     * @return fgwlx 覆盖物类型
     */
    public String getFgwlx() {
        return fgwlx;
    }

    /**
     * 覆盖物类型
     * @param fgwlx 覆盖物类型
     */
    public void setFgwlx(String fgwlx) {
        this.fgwlx = fgwlx == null ? null : fgwlx.trim();
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
}