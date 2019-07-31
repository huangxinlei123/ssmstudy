package com.ssm.pojo.annotation.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version: V1.0
 * @author: xinlei
 * @className: Role
 * @packageName: com.ssm.pojo.annotation.pojo
 * @description:
 * @data: 2019-07-30 14:39
 **/
// @Component代表Spring Ioc会把这个类扫描成Bean实例
@Component(value = "role")
public class Role {
    // @Value 代表的是值得注入
    @Value("1")
    private Long id;
    @Value("role_name_1")
    private String roleName;
    @Value("role_note_1")
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
