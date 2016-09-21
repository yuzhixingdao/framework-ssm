package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsTroresinfo;
import com.aac.cos.entity.sys.NmsTroresinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsTroresinfoMapper {
    int countByExample(NmsTroresinfoExample example);

    int deleteByExample(NmsTroresinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsTroresinfo record);

    int insertSelective(NmsTroresinfo record);

    List<NmsTroresinfo> selectByExample(NmsTroresinfoExample example);

    NmsTroresinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsTroresinfo record, @Param("example") NmsTroresinfoExample example);

    int updateByExample(@Param("record") NmsTroresinfo record, @Param("example") NmsTroresinfoExample example);

    int updateByPrimaryKeySelective(NmsTroresinfo record);

    int updateByPrimaryKey(NmsTroresinfo record);
}