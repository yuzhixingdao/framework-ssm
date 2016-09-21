package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsArprice;
import com.aac.cos.entity.sys.NmsArpriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsArpriceMapper {
    int countByExample(NmsArpriceExample example);

    int deleteByExample(NmsArpriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsArprice record);

    int insertSelective(NmsArprice record);

    List<NmsArprice> selectByExample(NmsArpriceExample example);

    NmsArprice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsArprice record, @Param("example") NmsArpriceExample example);

    int updateByExample(@Param("record") NmsArprice record, @Param("example") NmsArpriceExample example);

    int updateByPrimaryKeySelective(NmsArprice record);

    int updateByPrimaryKey(NmsArprice record);
}