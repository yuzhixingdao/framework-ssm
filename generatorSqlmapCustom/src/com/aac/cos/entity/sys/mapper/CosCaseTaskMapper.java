package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.CosCaseTask;
import com.aac.cos.entity.sys.CosCaseTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CosCaseTaskMapper {
    int countByExample(CosCaseTaskExample example);

    int deleteByExample(CosCaseTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CosCaseTask record);

    int insertSelective(CosCaseTask record);

    List<CosCaseTask> selectByExample(CosCaseTaskExample example);

    CosCaseTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CosCaseTask record, @Param("example") CosCaseTaskExample example);

    int updateByExample(@Param("record") CosCaseTask record, @Param("example") CosCaseTaskExample example);

    int updateByPrimaryKeySelective(CosCaseTask record);

    int updateByPrimaryKey(CosCaseTask record);
}