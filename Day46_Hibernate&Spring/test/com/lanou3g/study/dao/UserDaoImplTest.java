package com.lanou3g.study.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:chunLai
 * @Date: Created in 15:40 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class UserDaoImplTest {
    @Test
    public void hibernate() throws Exception {
        ApplicationContext context =
                new ClassPathXmlApplicationContext (
                        "spring-config.xml" );

        UserDao userDao = (UserDao) context.getBean ( "userDao" );
        userDao.add ();
    }


}