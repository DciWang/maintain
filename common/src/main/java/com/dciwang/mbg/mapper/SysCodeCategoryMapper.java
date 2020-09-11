package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.SysCodeCategory;
import com.dciwang.mbg.model.SysCodeCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodeCategoryMapper {
    int countByExample(SysCodeCategoryExample example);

    int deleteByExample(SysCodeCategoryExample example);

    int deleteByPrimaryKey(String type);

    int insert(SysCodeCategory record);

    int insertSelective(SysCodeCategory record);

    List<SysCodeCategory> selectByExample(SysCodeCategoryExample example);

    SysCodeCategory selectByPrimaryKey(String type);

    int updateByExampleSelective(@Param("record") SysCodeCategory record, @Param("example") SysCodeCategoryExample example);

    int updateByExample(@Param("record") SysCodeCategory record, @Param("example") SysCodeCategoryExample example);

    int updateByPrimaryKeySelective(SysCodeCategory record);

    int updateByPrimaryKey(SysCodeCategory record);
}