package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.SysCode;
import com.dciwang.mbg.model.SysCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodeMapper {
    int countByExample(SysCodeExample example);

    int deleteByExample(SysCodeExample example);

    int deleteByPrimaryKey(@Param("type") String type, @Param("code") String code);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    List<SysCode> selectByExample(SysCodeExample example);

    SysCode selectByPrimaryKey(@Param("type") String type, @Param("code") String code);

    int updateByExampleSelective(@Param("record") SysCode record, @Param("example") SysCodeExample example);

    int updateByExample(@Param("record") SysCode record, @Param("example") SysCodeExample example);

    int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
}