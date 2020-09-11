package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.SysSolidUser;
import com.dciwang.mbg.model.SysSolidUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSolidUserMapper {
    int countByExample(SysSolidUserExample example);

    int deleteByExample(SysSolidUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(SysSolidUser record);

    int insertSelective(SysSolidUser record);

    List<SysSolidUser> selectByExample(SysSolidUserExample example);

    SysSolidUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") SysSolidUser record, @Param("example") SysSolidUserExample example);

    int updateByExample(@Param("record") SysSolidUser record, @Param("example") SysSolidUserExample example);

    int updateByPrimaryKeySelective(SysSolidUser record);

    int updateByPrimaryKey(SysSolidUser record);
}