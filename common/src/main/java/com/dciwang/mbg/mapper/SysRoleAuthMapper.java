package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.SysRoleAuth;
import com.dciwang.mbg.model.SysRoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleAuthMapper {
    int countByExample(SysRoleAuthExample example);

    int deleteByExample(SysRoleAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleAuth record);

    int insertSelective(SysRoleAuth record);

    List<SysRoleAuth> selectByExample(SysRoleAuthExample example);

    SysRoleAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleAuth record, @Param("example") SysRoleAuthExample example);

    int updateByExample(@Param("record") SysRoleAuth record, @Param("example") SysRoleAuthExample example);

    int updateByPrimaryKeySelective(SysRoleAuth record);

    int updateByPrimaryKey(SysRoleAuth record);
}