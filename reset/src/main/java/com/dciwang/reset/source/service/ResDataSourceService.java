package com.dciwang.reset.source.service;

import com.dciwang.common.api.CommonResult;
import com.dciwang.mbg.model.ResDataSource;
import com.dciwang.reset.source.vo.ResDataSourceVO;
import com.dciwang.respons.MessageResponse;

import java.util.List;

/**
 * @Author DciWang
 * @Description TODO  数据源service接口
 * @Date 2020/8/27 下午3:58
 * @Version 1.0
 */

public interface ResDataSourceService {

    List<ResDataSourceVO> resDataSourceList();

    CommonResult<ResDataSource> insertOrEditDataSource(ResDataSourceVO resDataSourceVO);

    CommonResult<ResDataSource> delete(String id);

}
