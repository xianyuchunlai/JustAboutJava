package com.lanou3g.action;

import org.springframework.stereotype.Controller;

/**
 * @Author:chunLai
 * @Date: Created in 9:18 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */

@Controller//2018-1-23 09:19:04  struts2中的action  使用这个注解
public class LoginAction {

    public String login(){
        return "success";
    }
}
