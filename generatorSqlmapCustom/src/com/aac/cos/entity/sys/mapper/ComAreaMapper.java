package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.ComArea;
import com.aac.cos.entity.sys.ComAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComAreaMapper {
    int countByExample(ComAreaExample example);

    int deleteByExample(ComAreaExample example);

    int deleteByPrimaryKey(String id);

    int insert(ComArea record);

    int insertSelective(ComArea record);

    List<ComArea> selectByExample(ComAreaExample example);

    ComArea selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ComArea record, @Param("example") ComAreaExample example);

    int updateByExample(@Param("record") ComArea record, @Param("example") ComAreaExample example);

    int updateByPrimaryKeySelective(ComArea record);

    int updateByPrimaryKey(ComArea record);
}