package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.BdCustomer;
import com.aac.cos.entity.sys.BdCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdCustomerMapper {
    int countByExample(BdCustomerExample example);

    int deleteByExample(BdCustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BdCustomer record);

    int insertSelective(BdCustomer record);

    List<BdCustomer> selectByExample(BdCustomerExample example);

    BdCustomer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BdCustomer record, @Param("example") BdCustomerExample example);

    int updateByExample(@Param("record") BdCustomer record, @Param("example") BdCustomerExample example);

    int updateByPrimaryKeySelective(BdCustomer record);

    int updateByPrimaryKey(BdCustomer record);
}