package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsOtherser;
import com.aac.cos.entity.sys.NmsOtherserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsOtherserMapper {
    int countByExample(NmsOtherserExample example);

    int deleteByExample(NmsOtherserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsOtherser record);

    int insertSelective(NmsOtherser record);

    List<NmsOtherser> selectByExample(NmsOtherserExample example);

    NmsOtherser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsOtherser record, @Param("example") NmsOtherserExample example);

    int updateByExample(@Param("record") NmsOtherser record, @Param("example") NmsOtherserExample example);

    int updateByPrimaryKeySelective(NmsOtherser record);

    int updateByPrimaryKey(NmsOtherser record);
}