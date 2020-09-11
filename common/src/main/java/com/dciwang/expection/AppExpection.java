package com.dciwang.expection;

import lombok.Getter;

/**
 * @Author DciWang
 * @Description TODO  自定义运行时异常
 * @Date 2020/9/7 上午9:52
 * @Version 1.0
 */
@Getter
public class AppExpection extends RuntimeException {
//    异常
    private final Throwable expection;
//异常信息ID
    private final String messageId;
//异常信息参数
    private final String[] messageParam;


    public AppExpection(Throwable expection, String messageId, String[] messageParam) {
        this.expection = expection;
        this.messageId = messageId;
        this.messageParam = messageParam;
    }
}
