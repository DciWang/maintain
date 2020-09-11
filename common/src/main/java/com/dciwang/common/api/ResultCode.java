package com.dciwang.common.api;

/**
 * @Author DciWang
 * @Description TODO 枚举了一些常用API操作码
 * @Date 2020/8/26 上午11:48
 * @Version 1.0
 */

public enum ResultCode implements IErrorCode {
    RESPONSE_STATUS_CODE_SUCCESS(20000, "操作成功"),
    RESPONSE_STATUS_CODE_FAILED(20001, "操作失败"),
    RESPONSE_STATUS_CODE_FAILED_TOKEN_INVALID(50008, "无效的Token"),
    RESPONSE_STATUS_CODE_FAILED_TOKEN_NOLOGIN(50010, "未登录"),
    RESPONSE_STATUS_CODE_FAILED_AUTHORITY_CHANGED(50012, "用户权限发生变更"),
    RESPONSE_STATUS_CODE_FAILED_TOKEN_EXPIRED(50014, "Token过期"),
    RESPONSE_STATUS_CODE_FAILED_BIZ(20008, "业务异常"),
    RESPONSE_STATUS_CODE_FAILED_OTHER(20009, "未知异常发生");
    private String message;
    private long code;

    ResultCode(long code, String message) {
        code = this.code;
        message = this.message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
