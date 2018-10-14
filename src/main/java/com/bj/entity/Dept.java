package com.bj.entity;

import java.util.Date;

/**
 * Created by zhongzhaolong on 2018/10/14.
 */
public class Dept {
    private String user_id;
    private String user_name;
    private String pass_word;

    public String getId() {
        return user_id;
    }
    public void setId(String id) {
        this.user_id = id;
    }
    public String getName() {
        return user_name;
    }
    public void setName(String name) {
        this.user_name = name;
    }
    public String getPassword() {
        return pass_word;
    }
    public void setPassword(String password) {
        this.pass_word = password;
    }

}
