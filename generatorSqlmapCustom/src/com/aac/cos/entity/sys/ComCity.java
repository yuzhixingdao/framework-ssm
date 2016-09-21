package com.aac.cos.entity.sys;

public class ComCity {
    /**
     * id
     */
    private String id;

    /**
     * 省id
     */
    private String provinceId;

    /**
     * 名称
     */
    private String name;

    /**
     * id
     * @return id id
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 省id
     * @return province_id 省id
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 省id
     * @param provinceId 省id
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}