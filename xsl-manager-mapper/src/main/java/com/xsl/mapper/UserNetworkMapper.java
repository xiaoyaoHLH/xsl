package com.xsl.mapper;

import com.xsl.pojo.UserNetwork;
import com.xsl.pojo.UserNetworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserNetworkMapper {
    int countByExample(UserNetworkExample example);

    int deleteByExample(UserNetworkExample example);

    int deleteByPrimaryKey(Short mid);

    int insert(UserNetwork record);

    int insertSelective(UserNetwork record);

    List<UserNetwork> selectByExample(UserNetworkExample example);

    UserNetwork selectByPrimaryKey(Short mid);

    int updateByExampleSelective(@Param("record") UserNetwork record, @Param("example") UserNetworkExample example);

    int updateByExample(@Param("record") UserNetwork record, @Param("example") UserNetworkExample example);

    int updateByPrimaryKeySelective(UserNetwork record);

    int updateByPrimaryKey(UserNetwork record);
}