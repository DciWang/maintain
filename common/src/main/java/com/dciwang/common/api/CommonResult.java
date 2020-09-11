package com.dciwang.common.api;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author DciWang
 * @Description TODO 通用返回对象
 * @Date 2020/8/26 下午2:05
 * @Version 1.0
 */
@Getter
@Setter
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    protected CommonResult(String s){

    }
     CommonResult( long code,String message, T data ){
        this.code=code;
        this.message=message;
        this.data=data;
    };

    CommonResult(){

    }

    /**
     * 成功返回结果
     * @param data  获取的数据
     * @param <T>
     * @return
     */

    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.RESPONSE_STATUS_CODE_SUCCESS.getCode(),ResultCode.RESPONSE_STATUS_CODE_SUCCESS.getMessage(),data);
    }



    /**
     * 失败返回结果
     * @param message  错误码
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(String message){
        return new CommonResult<T>(ResultCode.RESPONSE_STATUS_CODE_FAILED.getCode(),message,null);
    }

}
