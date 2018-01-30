package com.lanou3g.study.service;

import com.lanou3g.study.dao.UserDao;

/**
 * @Author:chunLai
 * @Date: Created in 11:50 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void register(){
        System.out.println ("-----service----");
        userDao.addUser ();

    }
}
