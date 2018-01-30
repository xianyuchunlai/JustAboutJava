package com.lanou3g.study.web.controller;

import com.lanou3g.study.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author:chunLai
 * @Date: Created in 11:49 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class UserAction extends ActionSupport {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String register() {
        userService.register ();
        return SUCCESS;
    }
}
