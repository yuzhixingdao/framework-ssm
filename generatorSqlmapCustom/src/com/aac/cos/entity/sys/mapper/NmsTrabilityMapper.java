package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsTrability;
import com.aac.cos.entity.sys.NmsTrabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsTrabilityMapper {
    int countByExample(NmsTrabilityExample example);

    int deleteByExample(NmsTrabilityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsTrability record);

    int insertSelective(NmsTrability record);

    List<NmsTrability> selectByExample(NmsTrabilityExample example);

    NmsTrability selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsTrability record, @Param("example") NmsTrabilityExample example);

    int updateByExample(@Param("record") NmsTrability record, @Param("example") NmsTrabilityExample example);

    int updateByPrimaryKeySelective(NmsTrability record);

    int updateByPrimaryKey(NmsTrability record);
}