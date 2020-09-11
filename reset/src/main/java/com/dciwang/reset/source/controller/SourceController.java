package com.dciwang.reset.source.controller;

import com.dciwang.common.api.CommonResult;
import com.dciwang.mbg.model.ResDataSource;
import com.dciwang.reset.source.service.ResDataSourceService;
import com.dciwang.reset.source.vo.ResDataSourceVO;
import com.dciwang.respons.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author DciWang
 * @Description TODO 数据源管理controller
 * @Date 2020/8/27 下午2:34
 * @Version 1.0
 */
@Api(tags = "SourceController", description = "数据源管理")
@Controller
@RequestMapping("/dataSource")
public class SourceController {
    @Autowired
    private ResDataSourceService resDataSourceService;


    @ApiOperation("获取所有数据源列表")
    @GetMapping(value = {"/list"})
    public CommonResult<List<ResDataSourceVO>> dataSourceList() {
        List<ResDataSourceVO> result = resDataSourceService.resDataSourceList();
        return CommonResult.success(result);
    }

    @ApiOperation("添加/更改数据源")
    @PostMapping(("/insertOrUpdate"))
    @ResponseBody
    public CommonResult insertDataSource(@RequestBody ResDataSourceVO resDataSourceVO,
                                         @RequestParam(value = "optType", defaultValue = "add") @ApiParam("add/edit") String optType) {
        resDataSourceVO.setOptType(optType);
        CommonResult result = resDataSourceService.insertOrEditDataSource(resDataSourceVO);
        if (result.getData() == null) {
            return CommonResult.failed(result.getMessage());
        } else {
            return CommonResult.success(result.getData());
        }
    }

    @ApiOperation("删除数据源")
    @PostMapping(("/delete/{id}"))
    @ResponseBody
    public CommonResult delete(@ApiParam("id") @PathVariable("id") String id) {
        CommonResult result = resDataSourceService.delete(id);
        if (result.getData() == null) {
            return CommonResult.failed(result.getMessage());
        } else {
            return CommonResult.success(result.getData());
        }

    }



}
