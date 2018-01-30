package com.lanou3g.factory;

import com.lanou3g.createobj.User;

/**
 * @Author:chunLai
 * @Date: Created in 15:47 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class UserFactory extends AbstractFactory {
    @Override
    public User getInstance() {
        return new User ( "实例工厂创建的User", 11, true );
    }
}
