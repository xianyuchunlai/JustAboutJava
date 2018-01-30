package com.lanou3g.jdkproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 14:37 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class JdkProxyTest {
    @Test
    public void jdkTest() throws Exception {
        JdkUserDao jdkUserDao =
                new JdkUserDaoImpl ();

        JdkTransaction jdkTransaction =
                new JdkTransaction ();

        JdkProxy jdkProxy =
                new JdkProxy ( jdkUserDao, jdkTransaction );

        //强制类型转换,有图解
        JdkUserDao o = (JdkUserDao) Proxy.newProxyInstance (
                jdkUserDao.getClass ().getClassLoader ()
                , jdkUserDao.getClass ().getInterfaces ()
                , jdkProxy
        );
        System.out.println ( o.getClass ().getName () );



        Class<?>[] interfaces
                = o.getClass ().getInterfaces ();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println (interfaces[i].getName ());
        }

    }

}