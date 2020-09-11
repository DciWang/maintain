package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.ResDataSourceProp;
import com.dciwang.mbg.model.ResDataSourcePropExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResDataSourcePropMapper {
    int countByExample(ResDataSourcePropExample example);

    int deleteByExample(ResDataSourcePropExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResDataSourceProp record);

    int insertSelective(ResDataSourceProp record);

    List<ResDataSourceProp> selectByExample(ResDataSourcePropExample example);

    ResDataSourceProp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResDataSourceProp record, @Param("example") ResDataSourcePropExample example);

    int updateByExample(@Param("record") ResDataSourceProp record, @Param("example") ResDataSourcePropExample example);

    int updateByPrimaryKeySelective(ResDataSourceProp record);

    int updateByPrimaryKey(ResDataSourceProp record);
}