package com.lanou3g.factory;

import com.lanou3g.createobj.User;

/**
 * @Author:chunLai
 * @Date: Created in 15:29 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class FactoryTest {

    //静态工厂
    public static User getInstance() {
        return new User ();
    }



}
