package com.xsl.mapper;

import com.xsl.pojo.MasterLevel;
import com.xsl.pojo.MasterLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MasterLevelMapper {
    int countByExample(MasterLevelExample example);

    int deleteByExample(MasterLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MasterLevel record);

    int insertSelective(MasterLevel record);

    List<MasterLevel> selectByExample(MasterLevelExample example);

    MasterLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MasterLevel record, @Param("example") MasterLevelExample example);

    int updateByExample(@Param("record") MasterLevel record, @Param("example") MasterLevelExample example);

    int updateByPrimaryKeySelective(MasterLevel record);

    int updateByPrimaryKey(MasterLevel record);
}