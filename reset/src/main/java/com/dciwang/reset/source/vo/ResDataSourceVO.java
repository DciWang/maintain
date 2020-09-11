package com.dciwang.reset.source.vo;

import lombok.Data;

/**
 * @Author DciWang
 * @Description TODO  数据源VO类
 * @Date 2020/8/27 下午2:18
 * @Version 1.0
 */
@Data
public class ResDataSourceVO {
    //    操作方式
    private String optType;
    private String id;
    private String name;
    //数据源类型
    private String type;
    private String remark;
    private String host;
    private Integer port;
    private String schemaName;
    //oracle连接方式
    private String dbType;
    private String username;
    private String password;

    //hdfs filds
    private String rootPath;
}
