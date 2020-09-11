package com.dciwang.common.code;

/**
 * @Author DciWang
 * @Description TODO  枚举数据源类型
 * @Date 2020/8/28 下午3:38
 * @Version 1.0
 */

public enum DataSourceType {
    ORACLE("oracle"),
    MYSQL("mysql"),
    SNAPPY("snappy"),
    HDFS("hdfs");


    private String type;
    DataSourceType(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean is(String type){
        return this.type.equals(type);
    }
}
