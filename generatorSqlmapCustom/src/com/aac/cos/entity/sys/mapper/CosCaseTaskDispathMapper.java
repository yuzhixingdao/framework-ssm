package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.CosCaseTaskDispath;
import com.aac.cos.entity.sys.CosCaseTaskDispathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CosCaseTaskDispathMapper {
    int countByExample(CosCaseTaskDispathExample example);

    int deleteByExample(CosCaseTaskDispathExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CosCaseTaskDispath record);

    int insertSelective(CosCaseTaskDispath record);

    List<CosCaseTaskDispath> selectByExample(CosCaseTaskDispathExample example);

    CosCaseTaskDispath selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CosCaseTaskDispath record, @Param("example") CosCaseTaskDispathExample example);

    int updateByExample(@Param("record") CosCaseTaskDispath record, @Param("example") CosCaseTaskDispathExample example);

    int updateByPrimaryKeySelective(CosCaseTaskDispath record);

    int updateByPrimaryKey(CosCaseTaskDispath record);
}