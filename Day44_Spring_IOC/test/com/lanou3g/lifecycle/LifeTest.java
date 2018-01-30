package com.lanou3g.lifecycle;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 16:07 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class LifeTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new
                ClassPathXmlApplicationContext (
                "spring-config.xml" );
    }

    @Test
    public void life() {
        Object per = context.getBean ( "per" );
        ((ClassPathXmlApplicationContext) context)
                .close ();
    }

}