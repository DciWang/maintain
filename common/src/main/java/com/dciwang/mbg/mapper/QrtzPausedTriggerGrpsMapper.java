package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.QrtzPausedTriggerGrps;
import com.dciwang.mbg.model.QrtzPausedTriggerGrpsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzPausedTriggerGrpsMapper {
    int countByExample(QrtzPausedTriggerGrpsExample example);

    int deleteByExample(QrtzPausedTriggerGrpsExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzPausedTriggerGrps record);

    int insertSelective(QrtzPausedTriggerGrps record);

    List<QrtzPausedTriggerGrps> selectByExample(QrtzPausedTriggerGrpsExample example);

    int updateByExampleSelective(@Param("record") QrtzPausedTriggerGrps record, @Param("example") QrtzPausedTriggerGrpsExample example);

    int updateByExample(@Param("record") QrtzPausedTriggerGrps record, @Param("example") QrtzPausedTriggerGrpsExample example);
}