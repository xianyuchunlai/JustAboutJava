package com.lanou3g.study.dao;

import com.lanou3g.study.domain.User;

/**
 * @Author:chunLai
 * @Date: Created in 11:51 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class UserDao {

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void addUser(){
        System.out.println ("-----添加了一个User-----"+user.getName ());
    }
}
