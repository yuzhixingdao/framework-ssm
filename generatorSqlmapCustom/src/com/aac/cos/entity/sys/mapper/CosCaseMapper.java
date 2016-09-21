package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.CosCase;
import com.aac.cos.entity.sys.CosCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CosCaseMapper {
    int countByExample(CosCaseExample example);

    int deleteByExample(CosCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CosCase record);

    int insertSelective(CosCase record);

    List<CosCase> selectByExampleWithBLOBs(CosCaseExample example);

    List<CosCase> selectByExample(CosCaseExample example);

    CosCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CosCase record, @Param("example") CosCaseExample example);

    int updateByExampleWithBLOBs(@Param("record") CosCase record, @Param("example") CosCaseExample example);

    int updateByExample(@Param("record") CosCase record, @Param("example") CosCaseExample example);

    int updateByPrimaryKeySelective(CosCase record);

    int updateByPrimaryKeyWithBLOBs(CosCase record);

    int updateByPrimaryKey(CosCase record);
}