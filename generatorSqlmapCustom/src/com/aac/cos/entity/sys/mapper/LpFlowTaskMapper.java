package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.gga.LpFlowTask;
import com.aac.cos.entity.gga.LpFlowTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LpFlowTaskMapper {
    int countByExample(LpFlowTaskExample example);

    int deleteByExample(LpFlowTaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(LpFlowTask record);

    int insertSelective(LpFlowTask record);

    List<LpFlowTask> selectByExample(LpFlowTaskExample example);

    LpFlowTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LpFlowTask record, @Param("example") LpFlowTaskExample example);

    int updateByExample(@Param("record") LpFlowTask record, @Param("example") LpFlowTaskExample example);

    int updateByPrimaryKeySelective(LpFlowTask record);

    int updateByPrimaryKey(LpFlowTask record);
}