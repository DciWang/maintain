package com.dciwang.reset.source.mapper;

import com.dciwang.mbg.model.ResDataSourceProp;
import com.dciwang.mbg.model.ResDataSourcePropExample;
import org.apache.ibatis.annotations.Param;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/8/28 下午4:09
 * @Version 1.0
 */

public interface RestDataSoucePropDao {
    ResDataSourcePropExample getDataSouceByResDataSourceId(@Param("resDataSourceId") String resDataSourceId);
}
