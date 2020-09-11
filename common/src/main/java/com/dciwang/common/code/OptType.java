package com.dciwang.common.code;

/**
 * @Author DciWang
 * @Description TODO  枚举操作类型(添加/修改)
 * @Date 2020/8/28 下午2:49
 * @Version 1.0
 */

public enum OptType {
    ADD("add"),EDIT("edit");

    private String type;

    OptType(String type){
        this.type=type;
    }

    public  boolean is(String type){
      return this.type.equals(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
