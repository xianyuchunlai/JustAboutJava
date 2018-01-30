package com.lanou3g.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:chunLai
 * @Date: Created in 17:06 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class TransactionTest {
    @Test
    public void aop() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext ( "spring-config.xml" );
        UserDao userDao = (UserDao) context.getBean ( "userDao" );

        userDao.add ();
        userDao.delete ();
    }


}