package com.ssm.pojo;

/**
 * @version: V1.0
 * @author: xinlei
 * @className: Role
 * @packageName: com.ssm.pojo
 * @description: 构造器注入
 * @data: 2019-07-30 9:56
 **/
public class Role {
    private Long id;
    private String roleName;
    private String note;
    // setter注入需要有无参的构造函数
    public Role(){

    }
    // 构造函数注入
    public Role(Long id,String roleName,String note){
        this.id = id;
        this.roleName = roleName;
        this.note = note;
    }

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
