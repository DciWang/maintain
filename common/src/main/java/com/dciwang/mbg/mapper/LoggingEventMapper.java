package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.LoggingEvent;
import com.dciwang.mbg.model.LoggingEventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoggingEventMapper {
    int countByExample(LoggingEventExample example);

    int deleteByExample(LoggingEventExample example);

    int deleteByPrimaryKey(Long eventId);

    int insert(LoggingEvent record);

    int insertSelective(LoggingEvent record);

    List<LoggingEvent> selectByExampleWithBLOBs(LoggingEventExample example);

    List<LoggingEvent> selectByExample(LoggingEventExample example);

    LoggingEvent selectByPrimaryKey(Long eventId);

    int updateByExampleSelective(@Param("record") LoggingEvent record, @Param("example") LoggingEventExample example);

    int updateByExampleWithBLOBs(@Param("record") LoggingEvent record, @Param("example") LoggingEventExample example);

    int updateByExample(@Param("record") LoggingEvent record, @Param("example") LoggingEventExample example);

    int updateByPrimaryKeySelective(LoggingEvent record);

    int updateByPrimaryKeyWithBLOBs(LoggingEvent record);

    int updateByPrimaryKey(LoggingEvent record);
}