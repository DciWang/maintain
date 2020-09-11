package com.dciwang.mbg.mapper;

import com.dciwang.mbg.model.ResDataSource;
import com.dciwang.mbg.model.ResDataSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResDataSourceMapper {
    int countByExample(ResDataSourceExample example);

    int deleteByExample(ResDataSourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResDataSource record);

    int insertSelective(ResDataSource record);

    List<ResDataSource> selectByExample(ResDataSourceExample example);

    ResDataSource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResDataSource record, @Param("example") ResDataSourceExample example);

    int updateByExample(@Param("record") ResDataSource record, @Param("example") ResDataSourceExample example);

    int updateByPrimaryKeySelective(ResDataSource record);

    int updateByPrimaryKey(ResDataSource record);
}