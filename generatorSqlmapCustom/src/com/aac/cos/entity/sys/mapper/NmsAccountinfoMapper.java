package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsAccountinfo;
import com.aac.cos.entity.sys.NmsAccountinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsAccountinfoMapper {
    int countByExample(NmsAccountinfoExample example);

    int deleteByExample(NmsAccountinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsAccountinfo record);

    int insertSelective(NmsAccountinfo record);

    List<NmsAccountinfo> selectByExample(NmsAccountinfoExample example);

    NmsAccountinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsAccountinfo record, @Param("example") NmsAccountinfoExample example);

    int updateByExample(@Param("record") NmsAccountinfo record, @Param("example") NmsAccountinfoExample example);

    int updateByPrimaryKeySelective(NmsAccountinfo record);

    int updateByPrimaryKey(NmsAccountinfo record);
}