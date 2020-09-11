package com.dciwang.common.api;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/9/10 上午11:46
 * @Version 1.0
 */

public enum ModularNames {
    EMPLOYEE("员工管理"),
    SYSTEMUSER("系统用户管理"),
    SYSTEMENV("环境变量管理"),
    SYSTEMROLE("角色管理"),
    SYSTEMCODE("基础数据管理");

    ModularNames(String management) {
        this.management = management;
    }

    private String management;


}
