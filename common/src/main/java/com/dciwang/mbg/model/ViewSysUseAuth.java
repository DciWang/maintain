package com.dciwang.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class ViewSysUseAuth implements Serializable {
    private String userId;

    private String userName;

    private String password;

    private String passwordStatus;

    private Date passwordUpdatedAt;

    private Integer loginWrongCount;

    private String userEmail;

    private String roleName;

    private String authId;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordStatus() {
        return passwordStatus;
    }

    public void setPasswordStatus(String passwordStatus) {
        this.passwordStatus = passwordStatus;
    }

    public Date getPasswordUpdatedAt() {
        return passwordUpdatedAt;
    }

    public void setPasswordUpdatedAt(Date passwordUpdatedAt) {
        this.passwordUpdatedAt = passwordUpdatedAt;
    }

    public Integer getLoginWrongCount() {
        return loginWrongCount;
    }

    public void setLoginWrongCount(Integer loginWrongCount) {
        this.loginWrongCount = loginWrongCount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", passwordStatus=").append(passwordStatus);
        sb.append(", passwordUpdatedAt=").append(passwordUpdatedAt);
        sb.append(", loginWrongCount=").append(loginWrongCount);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", roleName=").append(roleName);
        sb.append(", authId=").append(authId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}