package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.LoggingEventProperty;
import com.dciwang.mbg.model.LoggingEventPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoggingEventPropertyMapper {
    int countByExample(LoggingEventPropertyExample example);

    int deleteByExample(LoggingEventPropertyExample example);

    int deleteByPrimaryKey(@Param("eventId") Long eventId, @Param("mappedKey") String mappedKey);

    int insert(LoggingEventProperty record);

    int insertSelective(LoggingEventProperty record);

    List<LoggingEventProperty> selectByExampleWithBLOBs(LoggingEventPropertyExample example);

    List<LoggingEventProperty> selectByExample(LoggingEventPropertyExample example);

    LoggingEventProperty selectByPrimaryKey(@Param("eventId") Long eventId, @Param("mappedKey") String mappedKey);

    int updateByExampleSelective(@Param("record") LoggingEventProperty record, @Param("example") LoggingEventPropertyExample example);

    int updateByExampleWithBLOBs(@Param("record") LoggingEventProperty record, @Param("example") LoggingEventPropertyExample example);

    int updateByExample(@Param("record") LoggingEventProperty record, @Param("example") LoggingEventPropertyExample example);

    int updateByPrimaryKeySelective(LoggingEventProperty record);

    int updateByPrimaryKeyWithBLOBs(LoggingEventProperty record);
}