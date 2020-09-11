package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.LoggingEventException;
import com.dciwang.mbg.model.LoggingEventExceptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoggingEventExceptionMapper {
    int countByExample(LoggingEventExceptionExample example);

    int deleteByExample(LoggingEventExceptionExample example);

    int deleteByPrimaryKey(@Param("eventId") Long eventId, @Param("i") Short i);

    int insert(LoggingEventException record);

    int insertSelective(LoggingEventException record);

    List<LoggingEventException> selectByExample(LoggingEventExceptionExample example);

    LoggingEventException selectByPrimaryKey(@Param("eventId") Long eventId, @Param("i") Short i);

    int updateByExampleSelective(@Param("record") LoggingEventException record, @Param("example") LoggingEventExceptionExample example);

    int updateByExample(@Param("record") LoggingEventException record, @Param("example") LoggingEventExceptionExample example);

    int updateByPrimaryKeySelective(LoggingEventException record);

    int updateByPrimaryKey(LoggingEventException record);
}