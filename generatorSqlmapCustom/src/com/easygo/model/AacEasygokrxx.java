package com.easygo.model;

import java.util.Date;

public class AacEasygokrxx {
    /**
     * 客人信息ID
     */
    private Long krxxid;

    /**
     * 客人姓名
     */
    private String krxm;

    /**
     * 客人称谓 0 先生; 1女士
     */
    private Byte krcw;

    /**
     * 客人所属通道
     */
    private String krsstd;

    /**
     * 客人来电号码
     */
    private String krldhm;

    /**
     * 客人级别
     */
    private Byte krjb;

    /**
     * 客人居住地
     */
    private String krjzd;

    /**
     * 客人邮编
     */
    private String kryb;

    /**
     * 客人保单号
     */
    private String krbdh;

    /**
     * 客人卡号
     */
    private String krkh;

    /**
     * 客人购险日期
     */
    private Date krgxrq;

    /**
     * 客人开卡日期
     */
    private Date krkkrq;

    /**
     * 客人服务生效日期
     */
    private Date krfwsxrq;

    /**
     * 客人服务截止日期
     */
    private Date krfwjzrq;

    /**
     * 客人服务信息备注
     */
    private String krfwxxbz;

    /**
     * 客人创建人ID
     */
    private Long krcjrid;

    /**
     * 客人创建时间
     */
    private Date krcjsj;

    /**
     * 客人修改人ID
     */
    private Long krxgrid;

    /**
     * 客人修改时间
     */
    private Date krxgsj;

    /**
     * 车辆车架号
     */
    private String clcjh;

    /**
     * 车辆车牌号
     */
    private String clcph;

    /**
     * 车辆颜色
     */
    private String clclys;

    /**
     * 车辆品牌
     */
    private String clpp;

    /**
     * 车辆车型
     */
    private String clcx;

    /**
     * 车辆系列
     */
    private String clcxl;

    /**
     * 车辆动力类型
     */
    private Byte cldllx;

    /**
     * 车辆驱动方式
     */
    private Byte clqdfs;

    /**
     * 车辆行驶公里数
     */
    private String clxsgls;

    /**
     * 车辆购买日期
     */
    private Date clgmrq;

    /**
     * 车辆购买经销商
     */
    private String clgmjxs;

    /**
     * 车辆信息备注
     */
    private String clxxbz;

    /**
     * 车辆修改人ID
     */
    private Long clxgrid;

    /**
     * 车辆修改时间
     */
    private Date clxgsj;

    /**
     * 车辆所在城市
     */
    private String clszcs;

    /**
     * 身份证信息
     */
    private String sfzxx;

    /**
     * 头像
     */
    private String txxx;

    /**
     * 驾驶证照片
     */
    private String drivephoto;

    /**
     * 行驶证照片
     */
    private String runphoto;

    /**
     * 车辆照片
     */
    private String carphoto;

    /**
     * 是否来自APP
     */
    private Byte isapp;

    /**
     * 注册来源
     */
    private Byte zcly;

    /**
     * 随车0随人1
     */
    private String scsrflag;

    /**
     * 客人备注
     */
    private String kebz;

    /**
     * 客人信息ID
     * @return krxxid 客人信息ID
     */
    public Long getKrxxid() {
        return krxxid;
    }

    /**
     * 客人信息ID
     * @param krxxid 客人信息ID
     */
    public void setKrxxid(Long krxxid) {
        this.krxxid = krxxid;
    }

    /**
     * 客人姓名
     * @return krxm 客人姓名
     */
    public String getKrxm() {
        return krxm;
    }

    /**
     * 客人姓名
     * @param krxm 客人姓名
     */
    public void setKrxm(String krxm) {
        this.krxm = krxm == null ? null : krxm.trim();
    }

    /**
     * 客人称谓 0 先生; 1女士
     * @return krcw 客人称谓 0 先生; 1女士
     */
    public Byte getKrcw() {
        return krcw;
    }

    /**
     * 客人称谓 0 先生; 1女士
     * @param krcw 客人称谓 0 先生; 1女士
     */
    public void setKrcw(Byte krcw) {
        this.krcw = krcw;
    }

    /**
     * 客人所属通道
     * @return krsstd 客人所属通道
     */
    public String getKrsstd() {
        return krsstd;
    }

    /**
     * 客人所属通道
     * @param krsstd 客人所属通道
     */
    public void setKrsstd(String krsstd) {
        this.krsstd = krsstd == null ? null : krsstd.trim();
    }

    /**
     * 客人来电号码
     * @return krldhm 客人来电号码
     */
    public String getKrldhm() {
        return krldhm;
    }

    /**
     * 客人来电号码
     * @param krldhm 客人来电号码
     */
    public void setKrldhm(String krldhm) {
        this.krldhm = krldhm == null ? null : krldhm.trim();
    }

    /**
     * 客人级别
     * @return krjb 客人级别
     */
    public Byte getKrjb() {
        return krjb;
    }

    /**
     * 客人级别
     * @param krjb 客人级别
     */
    public void setKrjb(Byte krjb) {
        this.krjb = krjb;
    }

    /**
     * 客人居住地
     * @return krjzd 客人居住地
     */
    public String getKrjzd() {
        return krjzd;
    }

    /**
     * 客人居住地
     * @param krjzd 客人居住地
     */
    public void setKrjzd(String krjzd) {
        this.krjzd = krjzd == null ? null : krjzd.trim();
    }

    /**
     * 客人邮编
     * @return kryb 客人邮编
     */
    public String getKryb() {
        return kryb;
    }

    /**
     * 客人邮编
     * @param kryb 客人邮编
     */
    public void setKryb(String kryb) {
        this.kryb = kryb == null ? null : kryb.trim();
    }

    /**
     * 客人保单号
     * @return krbdh 客人保单号
     */
    public String getKrbdh() {
        return krbdh;
    }

    /**
     * 客人保单号
     * @param krbdh 客人保单号
     */
    public void setKrbdh(String krbdh) {
        this.krbdh = krbdh == null ? null : krbdh.trim();
    }

    /**
     * 客人卡号
     * @return krkh 客人卡号
     */
    public String getKrkh() {
        return krkh;
    }

    /**
     * 客人卡号
     * @param krkh 客人卡号
     */
    public void setKrkh(String krkh) {
        this.krkh = krkh == null ? null : krkh.trim();
    }

    /**
     * 客人购险日期
     * @return krgxrq 客人购险日期
     */
    public Date getKrgxrq() {
        return krgxrq;
    }

    /**
     * 客人购险日期
     * @param krgxrq 客人购险日期
     */
    public void setKrgxrq(Date krgxrq) {
        this.krgxrq = krgxrq;
    }

    /**
     * 客人开卡日期
     * @return krkkrq 客人开卡日期
     */
    public Date getKrkkrq() {
        return krkkrq;
    }

    /**
     * 客人开卡日期
     * @param krkkrq 客人开卡日期
     */
    public void setKrkkrq(Date krkkrq) {
        this.krkkrq = krkkrq;
    }

    /**
     * 客人服务生效日期
     * @return krfwsxrq 客人服务生效日期
     */
    public Date getKrfwsxrq() {
        return krfwsxrq;
    }

    /**
     * 客人服务生效日期
     * @param krfwsxrq 客人服务生效日期
     */
    public void setKrfwsxrq(Date krfwsxrq) {
        this.krfwsxrq = krfwsxrq;
    }

    /**
     * 客人服务截止日期
     * @return krfwjzrq 客人服务截止日期
     */
    public Date getKrfwjzrq() {
        return krfwjzrq;
    }

    /**
     * 客人服务截止日期
     * @param krfwjzrq 客人服务截止日期
     */
    public void setKrfwjzrq(Date krfwjzrq) {
        this.krfwjzrq = krfwjzrq;
    }

    /**
     * 客人服务信息备注
     * @return krfwxxbz 客人服务信息备注
     */
    public String getKrfwxxbz() {
        return krfwxxbz;
    }

    /**
     * 客人服务信息备注
     * @param krfwxxbz 客人服务信息备注
     */
    public void setKrfwxxbz(String krfwxxbz) {
        this.krfwxxbz = krfwxxbz == null ? null : krfwxxbz.trim();
    }

    /**
     * 客人创建人ID
     * @return krcjrid 客人创建人ID
     */
    public Long getKrcjrid() {
        return krcjrid;
    }

    /**
     * 客人创建人ID
     * @param krcjrid 客人创建人ID
     */
    public void setKrcjrid(Long krcjrid) {
        this.krcjrid = krcjrid;
    }

    /**
     * 客人创建时间
     * @return krcjsj 客人创建时间
     */
    public Date getKrcjsj() {
        return krcjsj;
    }

    /**
     * 客人创建时间
     * @param krcjsj 客人创建时间
     */
    public void setKrcjsj(Date krcjsj) {
        this.krcjsj = krcjsj;
    }

    /**
     * 客人修改人ID
     * @return krxgrid 客人修改人ID
     */
    public Long getKrxgrid() {
        return krxgrid;
    }

    /**
     * 客人修改人ID
     * @param krxgrid 客人修改人ID
     */
    public void setKrxgrid(Long krxgrid) {
        this.krxgrid = krxgrid;
    }

    /**
     * 客人修改时间
     * @return krxgsj 客人修改时间
     */
    public Date getKrxgsj() {
        return krxgsj;
    }

    /**
     * 客人修改时间
     * @param krxgsj 客人修改时间
     */
    public void setKrxgsj(Date krxgsj) {
        this.krxgsj = krxgsj;
    }

    /**
     * 车辆车架号
     * @return clcjh 车辆车架号
     */
    public String getClcjh() {
        return clcjh;
    }

    /**
     * 车辆车架号
     * @param clcjh 车辆车架号
     */
    public void setClcjh(String clcjh) {
        this.clcjh = clcjh == null ? null : clcjh.trim();
    }

    /**
     * 车辆车牌号
     * @return clcph 车辆车牌号
     */
    public String getClcph() {
        return clcph;
    }

    /**
     * 车辆车牌号
     * @param clcph 车辆车牌号
     */
    public void setClcph(String clcph) {
        this.clcph = clcph == null ? null : clcph.trim();
    }

    /**
     * 车辆颜色
     * @return clclys 车辆颜色
     */
    public String getClclys() {
        return clclys;
    }

    /**
     * 车辆颜色
     * @param clclys 车辆颜色
     */
    public void setClclys(String clclys) {
        this.clclys = clclys == null ? null : clclys.trim();
    }

    /**
     * 车辆品牌
     * @return clpp 车辆品牌
     */
    public String getClpp() {
        return clpp;
    }

    /**
     * 车辆品牌
     * @param clpp 车辆品牌
     */
    public void setClpp(String clpp) {
        this.clpp = clpp == null ? null : clpp.trim();
    }

    /**
     * 车辆车型
     * @return clcx 车辆车型
     */
    public String getClcx() {
        return clcx;
    }

    /**
     * 车辆车型
     * @param clcx 车辆车型
     */
    public void setClcx(String clcx) {
        this.clcx = clcx == null ? null : clcx.trim();
    }

    /**
     * 车辆系列
     * @return clcxl 车辆系列
     */
    public String getClcxl() {
        return clcxl;
    }

    /**
     * 车辆系列
     * @param clcxl 车辆系列
     */
    public void setClcxl(String clcxl) {
        this.clcxl = clcxl == null ? null : clcxl.trim();
    }

    /**
     * 车辆动力类型
     * @return cldllx 车辆动力类型
     */
    public Byte getCldllx() {
        return cldllx;
    }

    /**
     * 车辆动力类型
     * @param cldllx 车辆动力类型
     */
    public void setCldllx(Byte cldllx) {
        this.cldllx = cldllx;
    }

    /**
     * 车辆驱动方式
     * @return clqdfs 车辆驱动方式
     */
    public Byte getClqdfs() {
        return clqdfs;
    }

    /**
     * 车辆驱动方式
     * @param clqdfs 车辆驱动方式
     */
    public void setClqdfs(Byte clqdfs) {
        this.clqdfs = clqdfs;
    }

    /**
     * 车辆行驶公里数
     * @return clxsgls 车辆行驶公里数
     */
    public String getClxsgls() {
        return clxsgls;
    }

    /**
     * 车辆行驶公里数
     * @param clxsgls 车辆行驶公里数
     */
    public void setClxsgls(String clxsgls) {
        this.clxsgls = clxsgls == null ? null : clxsgls.trim();
    }

    /**
     * 车辆购买日期
     * @return clgmrq 车辆购买日期
     */
    public Date getClgmrq() {
        return clgmrq;
    }

    /**
     * 车辆购买日期
     * @param clgmrq 车辆购买日期
     */
    public void setClgmrq(Date clgmrq) {
        this.clgmrq = clgmrq;
    }

    /**
     * 车辆购买经销商
     * @return clgmjxs 车辆购买经销商
     */
    public String getClgmjxs() {
        return clgmjxs;
    }

    /**
     * 车辆购买经销商
     * @param clgmjxs 车辆购买经销商
     */
    public void setClgmjxs(String clgmjxs) {
        this.clgmjxs = clgmjxs == null ? null : clgmjxs.trim();
    }

    /**
     * 车辆信息备注
     * @return clxxbz 车辆信息备注
     */
    public String getClxxbz() {
        return clxxbz;
    }

    /**
     * 车辆信息备注
     * @param clxxbz 车辆信息备注
     */
    public void setClxxbz(String clxxbz) {
        this.clxxbz = clxxbz == null ? null : clxxbz.trim();
    }

    /**
     * 车辆修改人ID
     * @return clxgrid 车辆修改人ID
     */
    public Long getClxgrid() {
        return clxgrid;
    }

    /**
     * 车辆修改人ID
     * @param clxgrid 车辆修改人ID
     */
    public void setClxgrid(Long clxgrid) {
        this.clxgrid = clxgrid;
    }

    /**
     * 车辆修改时间
     * @return clxgsj 车辆修改时间
     */
    public Date getClxgsj() {
        return clxgsj;
    }

    /**
     * 车辆修改时间
     * @param clxgsj 车辆修改时间
     */
    public void setClxgsj(Date clxgsj) {
        this.clxgsj = clxgsj;
    }

    /**
     * 车辆所在城市
     * @return clszcs 车辆所在城市
     */
    public String getClszcs() {
        return clszcs;
    }

    /**
     * 车辆所在城市
     * @param clszcs 车辆所在城市
     */
    public void setClszcs(String clszcs) {
        this.clszcs = clszcs == null ? null : clszcs.trim();
    }

    /**
     * 身份证信息
     * @return sfzxx 身份证信息
     */
    public String getSfzxx() {
        return sfzxx;
    }

    /**
     * 身份证信息
     * @param sfzxx 身份证信息
     */
    public void setSfzxx(String sfzxx) {
        this.sfzxx = sfzxx == null ? null : sfzxx.trim();
    }

    /**
     * 头像
     * @return txxx 头像
     */
    public String getTxxx() {
        return txxx;
    }

    /**
     * 头像
     * @param txxx 头像
     */
    public void setTxxx(String txxx) {
        this.txxx = txxx == null ? null : txxx.trim();
    }

    /**
     * 驾驶证照片
     * @return drivePhoto 驾驶证照片
     */
    public String getDrivephoto() {
        return drivephoto;
    }

    /**
     * 驾驶证照片
     * @param drivephoto 驾驶证照片
     */
    public void setDrivephoto(String drivephoto) {
        this.drivephoto = drivephoto == null ? null : drivephoto.trim();
    }

    /**
     * 行驶证照片
     * @return runPhoto 行驶证照片
     */
    public String getRunphoto() {
        return runphoto;
    }

    /**
     * 行驶证照片
     * @param runphoto 行驶证照片
     */
    public void setRunphoto(String runphoto) {
        this.runphoto = runphoto == null ? null : runphoto.trim();
    }

    /**
     * 车辆照片
     * @return carPhoto 车辆照片
     */
    public String getCarphoto() {
        return carphoto;
    }

    /**
     * 车辆照片
     * @param carphoto 车辆照片
     */
    public void setCarphoto(String carphoto) {
        this.carphoto = carphoto == null ? null : carphoto.trim();
    }

    /**
     * 是否来自APP
     * @return isapp 是否来自APP
     */
    public Byte getIsapp() {
        return isapp;
    }

    /**
     * 是否来自APP
     * @param isapp 是否来自APP
     */
    public void setIsapp(Byte isapp) {
        this.isapp = isapp;
    }

    /**
     * 注册来源
     * @return zcly 注册来源
     */
    public Byte getZcly() {
        return zcly;
    }

    /**
     * 注册来源
     * @param zcly 注册来源
     */
    public void setZcly(Byte zcly) {
        this.zcly = zcly;
    }

    /**
     * 随车0随人1
     * @return scsrFlag 随车0随人1
     */
    public String getScsrflag() {
        return scsrflag;
    }

    /**
     * 随车0随人1
     * @param scsrflag 随车0随人1
     */
    public void setScsrflag(String scsrflag) {
        this.scsrflag = scsrflag == null ? null : scsrflag.trim();
    }

    /**
     * 客人备注
     * @return kebz 客人备注
     */
    public String getKebz() {
        return kebz;
    }

    /**
     * 客人备注
     * @param kebz 客人备注
     */
    public void setKebz(String kebz) {
        this.kebz = kebz == null ? null : kebz.trim();
    }
}