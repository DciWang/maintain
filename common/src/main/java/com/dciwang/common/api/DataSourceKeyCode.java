package com.dciwang.common.api;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/9/10 上午11:31
 * @Version 1.0
 */

public enum DataSourceKeyCode {

    DataSourceKeyCode("rootPath",
            "dbType",
            "sid",
            "serviceName");

    DataSourceKeyCode(String HDFS_ROOT_PATH,
                      String ORACLE_DB_TYPE,
                      String ORACLE_DB_TYPE_SID,
                      String ORACLE_DB_TYPE_SERVICE_NAME) {
        this.HDFS_ROOT_PATH = HDFS_ROOT_PATH;
        this.ORACLE_DB_TYPE = ORACLE_DB_TYPE;
        this.ORACLE_DB_TYPE_SID = ORACLE_DB_TYPE_SID;
        this.ORACLE_DB_TYPE_SERVICE_NAME = ORACLE_DB_TYPE_SERVICE_NAME;
    }

    public String HDFS_ROOT_PATH;

    public String ORACLE_DB_TYPE;

    public String ORACLE_DB_TYPE_SID;
    public String ORACLE_DB_TYPE_SERVICE_NAME;
}
