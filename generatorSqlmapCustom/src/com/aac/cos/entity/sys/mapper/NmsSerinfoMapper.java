package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsSerinfo;
import com.aac.cos.entity.sys.NmsSerinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsSerinfoMapper {
    int countByExample(NmsSerinfoExample example);

    int deleteByExample(NmsSerinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsSerinfo record);

    int insertSelective(NmsSerinfo record);

    List<NmsSerinfo> selectByExample(NmsSerinfoExample example);

    NmsSerinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsSerinfo record, @Param("example") NmsSerinfoExample example);

    int updateByExample(@Param("record") NmsSerinfo record, @Param("example") NmsSerinfoExample example);

    int updateByPrimaryKeySelective(NmsSerinfo record);

    int updateByPrimaryKey(NmsSerinfo record);
}