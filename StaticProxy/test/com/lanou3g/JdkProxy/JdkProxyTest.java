package com.lanou3g.JdkProxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 19:56 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class JdkProxyTest {
    @Test
    public void t(){
        JdkDao j   = new JdkDaoImpl () ;
        JdkTransaction t=new JdkTransaction ();
        JdkProxy p=new JdkProxy ( j,t );

        Object o =
                Proxy.newProxyInstance (
                        j.getClass ().getClassLoader (),
                        j.getClass ().getInterfaces (),
                        p );


        System.out.println (o.getClass ().getName ());
    }

}