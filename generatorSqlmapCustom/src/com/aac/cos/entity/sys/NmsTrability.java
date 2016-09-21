package com.aac.cos.entity.sys;

import java.util.Date;

public class NmsTrability {
    /**
     * id
     */
    private Long id;

    /**
     * 服务商id
     */
    private Long serid;

    /**
     * 拖车级别
     */
    private Byte tralevel;

    /**
     * 高速拖车资质
     */
    private Byte hightraqual;

    /**
     * 计费模式
     */
    private Byte billmodel;

    /**
     * 辅助轮
     */
    private Byte trainwheel;

    /**
     * 万向辅助轮
     */
    private Byte univtrainwheel;

    /**
     * 地库叉车
     */
    private Byte basefork;

    /**
     * 八字绑带
     */
    private Byte bangdai;

    /**
     * 拖车保险
     */
    private Byte trainsu;

    /**
     * 导航GPS
     */
    private Byte gps;

    /**
     * 轨迹回放
     */
    private Byte rectrack;

    /**
     * 高速拖车资质路段
     */
    private String traqualsea;

    /**
     * 货物运输险
     */
    private Byte goodsinsu;

    /**
     * 承保范围
     */
    private Byte coverage;

    /**
     * 承保价格
     */
    private String coverprice;

    /**
     * 3T平板
     */
    private String thrtab;

    /**
     * 5T平板
     */
    private String fivtab;

    /**
     * 落地平板
     */
    private String falltab;

    /**
     * 拖掉一体
     */
    private String tardrop;

    /**
     * 3T改装厂品牌
     */
    private String thrmodbra;

    /**
     * 3T底盘种类
     */
    private String thrchaspe;

    /**
     * 3T拖车尺寸
     */
    private String thrtrasize;

    /**
     * 5T改装厂品牌
     */
    private String fivmodbra;

    /**
     * 5T底盘种类
     */
    private String fivchaspe;

    /**
     * 5T拖车尺寸
     */
    private String fivtrasize;

    /**
     * 落平改装厂品牌
     */
    private String falltabmodbra;

    /**
     * 落平底盘种类
     */
    private String falltabchaspe;

    /**
     * 落平拖车尺寸
     */
    private String falltabtrasize;

    /**
     * 拖吊改装厂品牌
     */
    private String tardropmodbra;

    /**
     * 拖吊底盘种类
     */
    private String tardropchaspe;

    /**
     * 拖吊拖车尺寸
     */
    private String tardroptrasize;

    /**
     * 拖吊最大起重量
     */
    private String tarmaxweight;

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
     * 拖车级别
     * @return tralevel 拖车级别
     */
    public Byte getTralevel() {
        return tralevel;
    }

    /**
     * 拖车级别
     * @param tralevel 拖车级别
     */
    public void setTralevel(Byte tralevel) {
        this.tralevel = tralevel;
    }

    /**
     * 高速拖车资质
     * @return hightraqual 高速拖车资质
     */
    public Byte getHightraqual() {
        return hightraqual;
    }

    /**
     * 高速拖车资质
     * @param hightraqual 高速拖车资质
     */
    public void setHightraqual(Byte hightraqual) {
        this.hightraqual = hightraqual;
    }

    /**
     * 计费模式
     * @return billmodel 计费模式
     */
    public Byte getBillmodel() {
        return billmodel;
    }

    /**
     * 计费模式
     * @param billmodel 计费模式
     */
    public void setBillmodel(Byte billmodel) {
        this.billmodel = billmodel;
    }

    /**
     * 辅助轮
     * @return trainwheel 辅助轮
     */
    public Byte getTrainwheel() {
        return trainwheel;
    }

    /**
     * 辅助轮
     * @param trainwheel 辅助轮
     */
    public void setTrainwheel(Byte trainwheel) {
        this.trainwheel = trainwheel;
    }

    /**
     * 万向辅助轮
     * @return univtrainwheel 万向辅助轮
     */
    public Byte getUnivtrainwheel() {
        return univtrainwheel;
    }

    /**
     * 万向辅助轮
     * @param univtrainwheel 万向辅助轮
     */
    public void setUnivtrainwheel(Byte univtrainwheel) {
        this.univtrainwheel = univtrainwheel;
    }

    /**
     * 地库叉车
     * @return basefork 地库叉车
     */
    public Byte getBasefork() {
        return basefork;
    }

    /**
     * 地库叉车
     * @param basefork 地库叉车
     */
    public void setBasefork(Byte basefork) {
        this.basefork = basefork;
    }

    /**
     * 八字绑带
     * @return bangdai 八字绑带
     */
    public Byte getBangdai() {
        return bangdai;
    }

    /**
     * 八字绑带
     * @param bangdai 八字绑带
     */
    public void setBangdai(Byte bangdai) {
        this.bangdai = bangdai;
    }

    /**
     * 拖车保险
     * @return trainsu 拖车保险
     */
    public Byte getTrainsu() {
        return trainsu;
    }

    /**
     * 拖车保险
     * @param trainsu 拖车保险
     */
    public void setTrainsu(Byte trainsu) {
        this.trainsu = trainsu;
    }

    /**
     * 导航GPS
     * @return gps 导航GPS
     */
    public Byte getGps() {
        return gps;
    }

    /**
     * 导航GPS
     * @param gps 导航GPS
     */
    public void setGps(Byte gps) {
        this.gps = gps;
    }

    /**
     * 轨迹回放
     * @return rectrack 轨迹回放
     */
    public Byte getRectrack() {
        return rectrack;
    }

    /**
     * 轨迹回放
     * @param rectrack 轨迹回放
     */
    public void setRectrack(Byte rectrack) {
        this.rectrack = rectrack;
    }

    /**
     * 高速拖车资质路段
     * @return traqualsea 高速拖车资质路段
     */
    public String getTraqualsea() {
        return traqualsea;
    }

    /**
     * 高速拖车资质路段
     * @param traqualsea 高速拖车资质路段
     */
    public void setTraqualsea(String traqualsea) {
        this.traqualsea = traqualsea == null ? null : traqualsea.trim();
    }

    /**
     * 货物运输险
     * @return goodsinsu 货物运输险
     */
    public Byte getGoodsinsu() {
        return goodsinsu;
    }

    /**
     * 货物运输险
     * @param goodsinsu 货物运输险
     */
    public void setGoodsinsu(Byte goodsinsu) {
        this.goodsinsu = goodsinsu;
    }

    /**
     * 承保范围
     * @return coverage 承保范围
     */
    public Byte getCoverage() {
        return coverage;
    }

    /**
     * 承保范围
     * @param coverage 承保范围
     */
    public void setCoverage(Byte coverage) {
        this.coverage = coverage;
    }

    /**
     * 承保价格
     * @return coverprice 承保价格
     */
    public String getCoverprice() {
        return coverprice;
    }

    /**
     * 承保价格
     * @param coverprice 承保价格
     */
    public void setCoverprice(String coverprice) {
        this.coverprice = coverprice == null ? null : coverprice.trim();
    }

    /**
     * 3T平板
     * @return thrtab 3T平板
     */
    public String getThrtab() {
        return thrtab;
    }

    /**
     * 3T平板
     * @param thrtab 3T平板
     */
    public void setThrtab(String thrtab) {
        this.thrtab = thrtab == null ? null : thrtab.trim();
    }

    /**
     * 5T平板
     * @return fivtab 5T平板
     */
    public String getFivtab() {
        return fivtab;
    }

    /**
     * 5T平板
     * @param fivtab 5T平板
     */
    public void setFivtab(String fivtab) {
        this.fivtab = fivtab == null ? null : fivtab.trim();
    }

    /**
     * 落地平板
     * @return falltab 落地平板
     */
    public String getFalltab() {
        return falltab;
    }

    /**
     * 落地平板
     * @param falltab 落地平板
     */
    public void setFalltab(String falltab) {
        this.falltab = falltab == null ? null : falltab.trim();
    }

    /**
     * 拖掉一体
     * @return tardrop 拖掉一体
     */
    public String getTardrop() {
        return tardrop;
    }

    /**
     * 拖掉一体
     * @param tardrop 拖掉一体
     */
    public void setTardrop(String tardrop) {
        this.tardrop = tardrop == null ? null : tardrop.trim();
    }

    /**
     * 3T改装厂品牌
     * @return thrmodbra 3T改装厂品牌
     */
    public String getThrmodbra() {
        return thrmodbra;
    }

    /**
     * 3T改装厂品牌
     * @param thrmodbra 3T改装厂品牌
     */
    public void setThrmodbra(String thrmodbra) {
        this.thrmodbra = thrmodbra == null ? null : thrmodbra.trim();
    }

    /**
     * 3T底盘种类
     * @return thrchaspe 3T底盘种类
     */
    public String getThrchaspe() {
        return thrchaspe;
    }

    /**
     * 3T底盘种类
     * @param thrchaspe 3T底盘种类
     */
    public void setThrchaspe(String thrchaspe) {
        this.thrchaspe = thrchaspe == null ? null : thrchaspe.trim();
    }

    /**
     * 3T拖车尺寸
     * @return thrtrasize 3T拖车尺寸
     */
    public String getThrtrasize() {
        return thrtrasize;
    }

    /**
     * 3T拖车尺寸
     * @param thrtrasize 3T拖车尺寸
     */
    public void setThrtrasize(String thrtrasize) {
        this.thrtrasize = thrtrasize == null ? null : thrtrasize.trim();
    }

    /**
     * 5T改装厂品牌
     * @return fivmodbra 5T改装厂品牌
     */
    public String getFivmodbra() {
        return fivmodbra;
    }

    /**
     * 5T改装厂品牌
     * @param fivmodbra 5T改装厂品牌
     */
    public void setFivmodbra(String fivmodbra) {
        this.fivmodbra = fivmodbra == null ? null : fivmodbra.trim();
    }

    /**
     * 5T底盘种类
     * @return fivchaspe 5T底盘种类
     */
    public String getFivchaspe() {
        return fivchaspe;
    }

    /**
     * 5T底盘种类
     * @param fivchaspe 5T底盘种类
     */
    public void setFivchaspe(String fivchaspe) {
        this.fivchaspe = fivchaspe == null ? null : fivchaspe.trim();
    }

    /**
     * 5T拖车尺寸
     * @return fivtrasize 5T拖车尺寸
     */
    public String getFivtrasize() {
        return fivtrasize;
    }

    /**
     * 5T拖车尺寸
     * @param fivtrasize 5T拖车尺寸
     */
    public void setFivtrasize(String fivtrasize) {
        this.fivtrasize = fivtrasize == null ? null : fivtrasize.trim();
    }

    /**
     * 落平改装厂品牌
     * @return falltabmodbra 落平改装厂品牌
     */
    public String getFalltabmodbra() {
        return falltabmodbra;
    }

    /**
     * 落平改装厂品牌
     * @param falltabmodbra 落平改装厂品牌
     */
    public void setFalltabmodbra(String falltabmodbra) {
        this.falltabmodbra = falltabmodbra == null ? null : falltabmodbra.trim();
    }

    /**
     * 落平底盘种类
     * @return falltabchaspe 落平底盘种类
     */
    public String getFalltabchaspe() {
        return falltabchaspe;
    }

    /**
     * 落平底盘种类
     * @param falltabchaspe 落平底盘种类
     */
    public void setFalltabchaspe(String falltabchaspe) {
        this.falltabchaspe = falltabchaspe == null ? null : falltabchaspe.trim();
    }

    /**
     * 落平拖车尺寸
     * @return falltabtrasize 落平拖车尺寸
     */
    public String getFalltabtrasize() {
        return falltabtrasize;
    }

    /**
     * 落平拖车尺寸
     * @param falltabtrasize 落平拖车尺寸
     */
    public void setFalltabtrasize(String falltabtrasize) {
        this.falltabtrasize = falltabtrasize == null ? null : falltabtrasize.trim();
    }

    /**
     * 拖吊改装厂品牌
     * @return tardropmodbra 拖吊改装厂品牌
     */
    public String getTardropmodbra() {
        return tardropmodbra;
    }

    /**
     * 拖吊改装厂品牌
     * @param tardropmodbra 拖吊改装厂品牌
     */
    public void setTardropmodbra(String tardropmodbra) {
        this.tardropmodbra = tardropmodbra == null ? null : tardropmodbra.trim();
    }

    /**
     * 拖吊底盘种类
     * @return tardropchaspe 拖吊底盘种类
     */
    public String getTardropchaspe() {
        return tardropchaspe;
    }

    /**
     * 拖吊底盘种类
     * @param tardropchaspe 拖吊底盘种类
     */
    public void setTardropchaspe(String tardropchaspe) {
        this.tardropchaspe = tardropchaspe == null ? null : tardropchaspe.trim();
    }

    /**
     * 拖吊拖车尺寸
     * @return tardroptrasize 拖吊拖车尺寸
     */
    public String getTardroptrasize() {
        return tardroptrasize;
    }

    /**
     * 拖吊拖车尺寸
     * @param tardroptrasize 拖吊拖车尺寸
     */
    public void setTardroptrasize(String tardroptrasize) {
        this.tardroptrasize = tardroptrasize == null ? null : tardroptrasize.trim();
    }

    /**
     * 拖吊最大起重量
     * @return tarmaxweight 拖吊最大起重量
     */
    public String getTarmaxweight() {
        return tarmaxweight;
    }

    /**
     * 拖吊最大起重量
     * @param tarmaxweight 拖吊最大起重量
     */
    public void setTarmaxweight(String tarmaxweight) {
        this.tarmaxweight = tarmaxweight == null ? null : tarmaxweight.trim();
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