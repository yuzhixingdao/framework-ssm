package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.gga.BdTokenTd;
import com.aac.cos.entity.gga.BdTokenTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdTokenTdMapper {
    int countByExample(BdTokenTdExample example);

    int deleteByExample(BdTokenTdExample example);

    int deleteByPrimaryKey(String id);

    int insert(BdTokenTd record);

    int insertSelective(BdTokenTd record);

    List<BdTokenTd> selectByExample(BdTokenTdExample example);

    BdTokenTd selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BdTokenTd record, @Param("example") BdTokenTdExample example);

    int updateByExample(@Param("record") BdTokenTd record, @Param("example") BdTokenTdExample example);

    int updateByPrimaryKeySelective(BdTokenTd record);

    int updateByPrimaryKey(BdTokenTd record);
}