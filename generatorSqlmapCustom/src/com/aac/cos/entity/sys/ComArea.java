package com.aac.cos.entity.sys;

public class ComArea {
    /**
     * id
     */
    private String id;

    /**
     * 市id
     */
    private String cityId;

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
     * 市id
     * @return city_id 市id
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 市id
     * @param cityId 市id
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
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