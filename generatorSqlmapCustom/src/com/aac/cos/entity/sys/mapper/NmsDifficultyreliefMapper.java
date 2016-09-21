package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsDifficultyrelief;
import com.aac.cos.entity.sys.NmsDifficultyreliefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsDifficultyreliefMapper {
    int countByExample(NmsDifficultyreliefExample example);

    int deleteByExample(NmsDifficultyreliefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsDifficultyrelief record);

    int insertSelective(NmsDifficultyrelief record);

    List<NmsDifficultyrelief> selectByExample(NmsDifficultyreliefExample example);

    NmsDifficultyrelief selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsDifficultyrelief record, @Param("example") NmsDifficultyreliefExample example);

    int updateByExample(@Param("record") NmsDifficultyrelief record, @Param("example") NmsDifficultyreliefExample example);

    int updateByPrimaryKeySelective(NmsDifficultyrelief record);

    int updateByPrimaryKey(NmsDifficultyrelief record);
}