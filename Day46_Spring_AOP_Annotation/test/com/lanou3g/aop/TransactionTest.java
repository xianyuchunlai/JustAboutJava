package com.lanou3g.aop;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 9:46 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class TransactionTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new
                ClassPathXmlApplicationContext ( "spring-config.xml" );
    }


    @Test
    public void aop() {
        UserDao userDao = (UserDao)
                context.getBean (
                        "userDao" );  //这里是前面给了uerDao名字了 2018-1-24 09:52:04
        userDao.add ();

        String s = userDao.get ();
        System.out.println ( s );
    }

}