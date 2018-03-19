package com.xsl.mapper;

import com.xsl.pojo.HunterLevel;
import com.xsl.pojo.HunterLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HunterLevelMapper {
    int countByExample(HunterLevelExample example);

    int deleteByExample(HunterLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HunterLevel record);

    int insertSelective(HunterLevel record);

    List<HunterLevel> selectByExample(HunterLevelExample example);

    HunterLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HunterLevel record, @Param("example") HunterLevelExample example);

    int updateByExample(@Param("record") HunterLevel record, @Param("example") HunterLevelExample example);

    int updateByPrimaryKeySelective(HunterLevel record);

    int updateByPrimaryKey(HunterLevel record);
}