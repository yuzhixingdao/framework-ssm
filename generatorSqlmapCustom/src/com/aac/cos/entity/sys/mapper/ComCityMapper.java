package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.ComCity;
import com.aac.cos.entity.sys.ComCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComCityMapper {
    int countByExample(ComCityExample example);

    int deleteByExample(ComCityExample example);

    int deleteByPrimaryKey(String id);

    int insert(ComCity record);

    int insertSelective(ComCity record);

    List<ComCity> selectByExample(ComCityExample example);

    ComCity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ComCity record, @Param("example") ComCityExample example);

    int updateByExample(@Param("record") ComCity record, @Param("example") ComCityExample example);

    int updateByPrimaryKeySelective(ComCity record);

    int updateByPrimaryKey(ComCity record);
}