package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.gga.Easygotd;
import com.aac.cos.entity.gga.EasygotdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EasygotdMapper {
    int countByExample(EasygotdExample example);

    int deleteByExample(EasygotdExample example);

    int deleteByPrimaryKey(String id);

    int insert(Easygotd record);

    int insertSelective(Easygotd record);

    List<Easygotd> selectByExample(EasygotdExample example);

    Easygotd selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Easygotd record, @Param("example") EasygotdExample example);

    int updateByExample(@Param("record") Easygotd record, @Param("example") EasygotdExample example);

    int updateByPrimaryKeySelective(Easygotd record);

    int updateByPrimaryKey(Easygotd record);
}