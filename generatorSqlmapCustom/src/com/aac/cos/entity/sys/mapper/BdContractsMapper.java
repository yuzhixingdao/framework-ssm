package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.BdContracts;
import com.aac.cos.entity.sys.BdContractsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdContractsMapper {
    int countByExample(BdContractsExample example);

    int deleteByExample(BdContractsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BdContracts record);

    int insertSelective(BdContracts record);

    List<BdContracts> selectByExample(BdContractsExample example);

    BdContracts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BdContracts record, @Param("example") BdContractsExample example);

    int updateByExample(@Param("record") BdContracts record, @Param("example") BdContractsExample example);

    int updateByPrimaryKeySelective(BdContracts record);

    int updateByPrimaryKey(BdContracts record);
}