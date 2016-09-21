package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.ComProvince;
import com.aac.cos.entity.sys.ComProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComProvinceMapper {
    int countByExample(ComProvinceExample example);

    int deleteByExample(ComProvinceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ComProvince record);

    int insertSelective(ComProvince record);

    List<ComProvince> selectByExample(ComProvinceExample example);

    ComProvince selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ComProvince record, @Param("example") ComProvinceExample example);

    int updateByExample(@Param("record") ComProvince record, @Param("example") ComProvinceExample example);

    int updateByPrimaryKeySelective(ComProvince record);

    int updateByPrimaryKey(ComProvince record);
}