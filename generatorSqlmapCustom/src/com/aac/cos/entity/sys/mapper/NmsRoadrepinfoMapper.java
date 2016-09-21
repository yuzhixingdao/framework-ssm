package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsRoadrepinfo;
import com.aac.cos.entity.sys.NmsRoadrepinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsRoadrepinfoMapper {
    int countByExample(NmsRoadrepinfoExample example);

    int deleteByExample(NmsRoadrepinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsRoadrepinfo record);

    int insertSelective(NmsRoadrepinfo record);

    List<NmsRoadrepinfo> selectByExample(NmsRoadrepinfoExample example);

    NmsRoadrepinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsRoadrepinfo record, @Param("example") NmsRoadrepinfoExample example);

    int updateByExample(@Param("record") NmsRoadrepinfo record, @Param("example") NmsRoadrepinfoExample example);

    int updateByPrimaryKeySelective(NmsRoadrepinfo record);

    int updateByPrimaryKey(NmsRoadrepinfo record);
}