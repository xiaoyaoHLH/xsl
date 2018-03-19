package com.xsl.mapper;

import com.xsl.pojo.TaskTag;
import com.xsl.pojo.TaskTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskTagMapper {
    int countByExample(TaskTagExample example);

    int deleteByExample(TaskTagExample example);

    int insert(TaskTag record);

    int insertSelective(TaskTag record);

    List<TaskTag> selectByExample(TaskTagExample example);

    int updateByExampleSelective(@Param("record") TaskTag record, @Param("example") TaskTagExample example);

    int updateByExample(@Param("record") TaskTag record, @Param("example") TaskTagExample example);
}