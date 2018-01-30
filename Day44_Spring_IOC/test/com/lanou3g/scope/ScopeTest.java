package com.lanou3g.scope;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 16:19 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class ScopeTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {

        context = new ClassPathXmlApplicationContext ( "spring-config.xml" );
    }

    @Test
    public void lazy(){
       context.getBean ( "car" );
    }

    @Test
    public void prototype(){
        context.getBean ( "stu,yyy" );
        context.getBean ( "student" );
        context.getBean ( "student2" );
        context.getBean ( "xxx" );
        //下面这个是错误的 ,原因配置文件中有
        context.getBean ( "yyy" );

    }

}