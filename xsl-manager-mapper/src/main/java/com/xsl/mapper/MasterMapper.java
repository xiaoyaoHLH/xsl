package com.xsl.mapper;

import com.xsl.pojo.Master;
import com.xsl.pojo.MasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MasterMapper {
    int countByExample(MasterExample example);

    int deleteByExample(MasterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Master record);

    int insertSelective(Master record);

    List<Master> selectByExample(MasterExample example);

    Master selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Master record, @Param("example") MasterExample example);

    int updateByExample(@Param("record") Master record, @Param("example") MasterExample example);

    int updateByPrimaryKeySelective(Master record);

    int updateByPrimaryKey(Master record);
}