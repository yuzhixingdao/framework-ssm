package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.BdContractLine;
import com.aac.cos.entity.sys.BdContractLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdContractLineMapper {
    int countByExample(BdContractLineExample example);

    int deleteByExample(BdContractLineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BdContractLine record);

    int insertSelective(BdContractLine record);

    List<BdContractLine> selectByExample(BdContractLineExample example);

    BdContractLine selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BdContractLine record, @Param("example") BdContractLineExample example);

    int updateByExample(@Param("record") BdContractLine record, @Param("example") BdContractLineExample example);

    int updateByPrimaryKeySelective(BdContractLine record);

    int updateByPrimaryKey(BdContractLine record);
}