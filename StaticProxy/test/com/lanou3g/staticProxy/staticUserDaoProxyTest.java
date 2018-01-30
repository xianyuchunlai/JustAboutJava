package com.lanou3g.staticProxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 19:28 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class staticUserDaoProxyTest {
    @Test
    public void staticProxy(){
        UserDaoImpl userDao =new UserDaoImpl ();
        Transacation t=new Transacation ();
        UserDaoProxy u=new UserDaoProxy ( t,userDao );
        u.sayHello ();
    }


}