package com.dciwang.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysCode implements Serializable {
    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "编码名称")
    private String codeName;

    @ApiModelProperty(value = "父级编码类型")
    private String pType;

    @ApiModelProperty(value = "父级编码")
    private String pCode;

    @ApiModelProperty(value = "显示顺序")
    private Short showSequence;

    @ApiModelProperty(value = "编码说明")
    private String notes;

    @ApiModelProperty(value = "已删除")
    private Boolean deleted;

    @ApiModelProperty(value = "插入时间")
    private Date createdAt;

    @ApiModelProperty(value = "更新时间")
    private Date updatedAt;

    @ApiModelProperty(value = "更新者")
    private String updatedBy;

    private static final long serialVersionUID = 1L;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public Short getShowSequence() {
        return showSequence;
    }

    public void setShowSequence(Short showSequence) {
        this.showSequence = showSequence;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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
        sb.append(", type=").append(type);
        sb.append(", code=").append(code);
        sb.append(", codeName=").append(codeName);
        sb.append(", pType=").append(pType);
        sb.append(", pCode=").append(pCode);
        sb.append(", showSequence=").append(showSequence);
        sb.append(", notes=").append(notes);
        sb.append(", deleted=").append(deleted);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}