package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsSerinfoaddr;
import com.aac.cos.entity.sys.NmsSerinfoaddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsSerinfoaddrMapper {
    int countByExample(NmsSerinfoaddrExample example);

    int deleteByExample(NmsSerinfoaddrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsSerinfoaddr record);

    int insertSelective(NmsSerinfoaddr record);

    List<NmsSerinfoaddr> selectByExample(NmsSerinfoaddrExample example);

    NmsSerinfoaddr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsSerinfoaddr record, @Param("example") NmsSerinfoaddrExample example);

    int updateByExample(@Param("record") NmsSerinfoaddr record, @Param("example") NmsSerinfoaddrExample example);

    int updateByPrimaryKeySelective(NmsSerinfoaddr record);

    int updateByPrimaryKey(NmsSerinfoaddr record);
}