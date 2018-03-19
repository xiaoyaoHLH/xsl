package com.xsl.mapper;

import com.xsl.pojo.HunterTag;
import com.xsl.pojo.HunterTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HunterTagMapper {
    int countByExample(HunterTagExample example);

    int deleteByExample(HunterTagExample example);

    int insert(HunterTag record);

    int insertSelective(HunterTag record);

    List<HunterTag> selectByExample(HunterTagExample example);

    int updateByExampleSelective(@Param("record") HunterTag record, @Param("example") HunterTagExample example);

    int updateByExample(@Param("record") HunterTag record, @Param("example") HunterTagExample example);
}