package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.gga.LpFlow;
import com.aac.cos.entity.gga.LpFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LpFlowMapper {
    int countByExample(LpFlowExample example);

    int deleteByExample(LpFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(LpFlow record);

    int insertSelective(LpFlow record);

    List<LpFlow> selectByExampleWithBLOBs(LpFlowExample example);

    List<LpFlow> selectByExample(LpFlowExample example);

    LpFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LpFlow record, @Param("example") LpFlowExample example);

    int updateByExampleWithBLOBs(@Param("record") LpFlow record, @Param("example") LpFlowExample example);

    int updateByExample(@Param("record") LpFlow record, @Param("example") LpFlowExample example);

    int updateByPrimaryKeySelective(LpFlow record);

    int updateByPrimaryKeyWithBLOBs(LpFlow record);

    int updateByPrimaryKey(LpFlow record);
}