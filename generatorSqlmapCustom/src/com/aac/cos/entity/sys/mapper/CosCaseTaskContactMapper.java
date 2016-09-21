package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.CosCaseTaskContact;
import com.aac.cos.entity.sys.CosCaseTaskContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CosCaseTaskContactMapper {
    int countByExample(CosCaseTaskContactExample example);

    int deleteByExample(CosCaseTaskContactExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CosCaseTaskContact record);

    int insertSelective(CosCaseTaskContact record);

    List<CosCaseTaskContact> selectByExample(CosCaseTaskContactExample example);

    CosCaseTaskContact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CosCaseTaskContact record, @Param("example") CosCaseTaskContactExample example);

    int updateByExample(@Param("record") CosCaseTaskContact record, @Param("example") CosCaseTaskContactExample example);

    int updateByPrimaryKeySelective(CosCaseTaskContact record);

    int updateByPrimaryKey(CosCaseTaskContact record);
}