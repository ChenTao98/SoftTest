package com.softtest.softtest.entity;

import java.util.Date;

public class User {
    private Integer id;

    private Date createdOn;

    private Date updatedOn;

    private String email;

    private Boolean enabled;

    private String fullName;

    private Boolean isAdmin;

    private Date lastLogin;

    private Integer loginCount;

    private String password;

    private String phone;

    private String username;

    public User(Integer id, Date createdOn, Date updatedOn, String email, Boolean enabled, String fullName, Boolean isAdmin, Date lastLogin, Integer loginCount, String password, String phone, String username) {
        this.id = id;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.email = email;
        this.enabled = enabled;
        this.fullName = fullName;
        this.isAdmin = isAdmin;
        this.lastLogin = lastLogin;
        this.loginCount = loginCount;
        this.password = password;
        this.phone = phone;
        this.username = username;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}