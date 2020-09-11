package com.dciwang.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysEnv implements Serializable {
    @ApiModelProperty(value = "主键自增")
    private Integer id;

    @ApiModelProperty(value = "环境变量名")
    private String varId;

    @ApiModelProperty(value = "环境变量名")
    private String varName;

    @ApiModelProperty(value = "环境变量值")
    private String varValue;

    @ApiModelProperty(value = "画面表示用说明（环境变量的含义，设定值的类型和范围，是否必须，设定例等）")
    private String remark;

    @ApiModelProperty(value = "程序用环境变量值的类型,格式和值范围定义：TYPE=NUM#REQUIRED=FALSE#FORMAT=YYYYMMDD#OPTIONS=2019:2019年, 2020:2020年, 2021, 2021年#FROMTO=1-100#MAXLENGTH=5")
    private String varType;

    @ApiModelProperty(value = "环境变量设定画面上的表示顺序")
    private Integer showSequence;

    @ApiModelProperty(value = "更新时间")
    private Date updatedAt;

    @ApiModelProperty(value = "更新者")
    private String updatedBy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVarId() {
        return varId;
    }

    public void setVarId(String varId) {
        this.varId = varId;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getVarValue() {
        return varValue;
    }

    public void setVarValue(String varValue) {
        this.varValue = varValue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public Integer getShowSequence() {
        return showSequence;
    }

    public void setShowSequence(Integer showSequence) {
        this.showSequence = showSequence;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", varId=").append(varId);
        sb.append(", varName=").append(varName);
        sb.append(", varValue=").append(varValue);
        sb.append(", remark=").append(remark);
        sb.append(", varType=").append(varType);
        sb.append(", showSequence=").append(showSequence);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}