package com.easygo.dao;

import com.easygo.model.AacEasygokrxx;

public interface AacEasygokrxxMapper {
    int deleteByPrimaryKey(Long krxxid);

    int insert(AacEasygokrxx record);

    int insertSelective(AacEasygokrxx record);

    AacEasygokrxx selectByPrimaryKey(Long krxxid);

    int updateByPrimaryKeySelective(AacEasygokrxx record);

    int updateByPrimaryKeyWithBLOBs(AacEasygokrxx record);

    int updateByPrimaryKey(AacEasygokrxx record);
}