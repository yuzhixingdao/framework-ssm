package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.sys.NmsRoadprice;
import com.aac.cos.entity.sys.NmsRoadpriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NmsRoadpriceMapper {
    int countByExample(NmsRoadpriceExample example);

    int deleteByExample(NmsRoadpriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NmsRoadprice record);

    int insertSelective(NmsRoadprice record);

    List<NmsRoadprice> selectByExample(NmsRoadpriceExample example);

    NmsRoadprice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NmsRoadprice record, @Param("example") NmsRoadpriceExample example);

    int updateByExample(@Param("record") NmsRoadprice record, @Param("example") NmsRoadpriceExample example);

    int updateByPrimaryKeySelective(NmsRoadprice record);

    int updateByPrimaryKey(NmsRoadprice record);
}