package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsSerinfouser;
import com.aac.cos.entity.sys.NmsSerinfouserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsSerinfouserMapper {
    int countByExample(NmsSerinfouserExample example);

    int deleteByExample(NmsSerinfouserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsSerinfouser record);

    int insertSelective(NmsSerinfouser record);

    List<NmsSerinfouser> selectByExample(NmsSerinfouserExample example);

    NmsSerinfouser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsSerinfouser record, @Param("example") NmsSerinfouserExample example);

    int updateByExample(@Param("record") NmsSerinfouser record, @Param("example") NmsSerinfouserExample example);

    int updateByPrimaryKeySelective(NmsSerinfouser record);

    int updateByPrimaryKey(NmsSerinfouser record);
}