package com.ssm.pojo;

/**
 * @version: V1.0
 * @author: xinlei
 * @className: User
 * @packageName: com.ssm.pojo
 * @description:
 * @data: 2019-07-30 11:49
 **/
public class User {
    private Long id;
    private String userName;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
