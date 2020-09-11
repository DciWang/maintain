package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.SysEnv;
import com.dciwang.mbg.model.SysEnvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEnvMapper {
    int countByExample(SysEnvExample example);

    int deleteByExample(SysEnvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysEnv record);

    int insertSelective(SysEnv record);

    List<SysEnv> selectByExample(SysEnvExample example);

    SysEnv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysEnv record, @Param("example") SysEnvExample example);

    int updateByExample(@Param("record") SysEnv record, @Param("example") SysEnvExample example);

    int updateByPrimaryKeySelective(SysEnv record);

    int updateByPrimaryKey(SysEnv record);
}