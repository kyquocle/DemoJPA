package com.cybersoft.DemoJPA.dto;

import com.cybersoft.DemoJPA.entity.Roles;

public class UserDTO {
    // vì id của user entity là tự động tăng nên user sẽ không được yêu cầu id vì sẽ bị lỗi nếu trùng
    private String email;
    private String password;
    private String fullName;
    private String avatar;

    private int roleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public UserDTO(){}


}
