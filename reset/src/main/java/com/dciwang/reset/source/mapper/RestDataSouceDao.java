package com.dciwang.reset.source.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/8/28 下午4:09
 * @Version 1.0
 */

public interface RestDataSouceDao {
    int countDataSouceByName(@Param("name") String name);

    int countDataSouceByIdAndName(@Param("id") String id, @Param("name") String name);
}
