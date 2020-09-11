package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.SysAuthGroup;
import com.dciwang.mbg.model.SysAuthGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAuthGroupMapper {
    int countByExample(SysAuthGroupExample example);

    int deleteByExample(SysAuthGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAuthGroup record);

    int insertSelective(SysAuthGroup record);

    List<SysAuthGroup> selectByExample(SysAuthGroupExample example);

    SysAuthGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAuthGroup record, @Param("example") SysAuthGroupExample example);

    int updateByExample(@Param("record") SysAuthGroup record, @Param("example") SysAuthGroupExample example);

    int updateByPrimaryKeySelective(SysAuthGroup record);

    int updateByPrimaryKey(SysAuthGroup record);
}