package com.xsl.mapper;

import com.xsl.pojo.Hunter;
import com.xsl.pojo.HunterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HunterMapper {
    int countByExample(HunterExample example);

    int deleteByExample(HunterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hunter record);

    int insertSelective(Hunter record);

    List<Hunter> selectByExample(HunterExample example);

    Hunter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hunter record, @Param("example") HunterExample example);

    int updateByExample(@Param("record") Hunter record, @Param("example") HunterExample example);

    int updateByPrimaryKeySelective(Hunter record);

    int updateByPrimaryKey(Hunter record);
}