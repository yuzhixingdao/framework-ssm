package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsRepairinfo;
import com.aac.cos.entity.sys.NmsRepairinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsRepairinfoMapper {
    int countByExample(NmsRepairinfoExample example);

    int deleteByExample(NmsRepairinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsRepairinfo record);

    int insertSelective(NmsRepairinfo record);

    List<NmsRepairinfo> selectByExample(NmsRepairinfoExample example);

    NmsRepairinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsRepairinfo record, @Param("example") NmsRepairinfoExample example);

    int updateByExample(@Param("record") NmsRepairinfo record, @Param("example") NmsRepairinfoExample example);

    int updateByPrimaryKeySelective(NmsRepairinfo record);

    int updateByPrimaryKey(NmsRepairinfo record);
}