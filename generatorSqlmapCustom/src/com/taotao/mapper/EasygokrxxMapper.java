package com.taotao.mapper;

import com.taotao.pojo.Easygokrxx;
import com.taotao.pojo.EasygokrxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EasygokrxxMapper {
    int countByExample(EasygokrxxExample example);

    int deleteByExample(EasygokrxxExample example);

    int deleteByPrimaryKey(Long krxxid);

    int insert(Easygokrxx record);

    int insertSelective(Easygokrxx record);

    List<Easygokrxx> selectByExampleWithBLOBs(EasygokrxxExample example);

    List<Easygokrxx> selectByExample(EasygokrxxExample example);

    Easygokrxx selectByPrimaryKey(Long krxxid);

    int updateByExampleSelective(@Param("record") Easygokrxx record, @Param("example") EasygokrxxExample example);

    int updateByExampleWithBLOBs(@Param("record") Easygokrxx record, @Param("example") EasygokrxxExample example);

    int updateByExample(@Param("record") Easygokrxx record, @Param("example") EasygokrxxExample example);

    int updateByPrimaryKeySelective(Easygokrxx record);

    int updateByPrimaryKeyWithBLOBs(Easygokrxx record);

    int updateByPrimaryKey(Easygokrxx record);
}