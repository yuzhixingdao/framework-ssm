package com.aac.cos.entity.sys.mapper;

import com.aac.cos.entity.gga.AccessToken;
import com.aac.cos.entity.gga.AccessTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessTokenMapper {
    int countByExample(AccessTokenExample example);

    int deleteByExample(AccessTokenExample example);

    int deleteByPrimaryKey(String tokenId);

    int insert(AccessToken record);

    int insertSelective(AccessToken record);

    List<AccessToken> selectByExample(AccessTokenExample example);

    AccessToken selectByPrimaryKey(String tokenId);

    int updateByExampleSelective(@Param("record") AccessToken record, @Param("example") AccessTokenExample example);

    int updateByExample(@Param("record") AccessToken record, @Param("example") AccessTokenExample example);

    int updateByPrimaryKeySelective(AccessToken record);

    int updateByPrimaryKey(AccessToken record);
}