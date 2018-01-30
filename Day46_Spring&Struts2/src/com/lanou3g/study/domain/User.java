package com.lanou3g.study.domain;

/**
 * @Author:chunLai
 * @Date: Created in 11:50 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class User {
    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {

        this.name = name;
    }
}
