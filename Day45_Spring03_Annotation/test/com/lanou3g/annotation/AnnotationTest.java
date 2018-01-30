package com.lanou3g.annotation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:chunLai
 * @Date: Created in 9:14 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class AnnotationTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context =
                new ClassPathXmlApplicationContext (
                        "spring-config.xml" );
    }


    @Test//2018-1-23 09:25:11
    public void person() throws Exception {
        //2018-1-23 09:38:09 改变类型
        Person person = (Person) context.getBean ( "p" );
        System.out.println ( person );

//        ((ClassPathXmlApplicationContext) context)
//                .close ();
    }


    @Test
    public void extendsTest() throws Exception {
        Object student = context.getBean ( "student" );
        Object people = context.getBean ( "people" );
        System.out.println ( student );
        System.out.println (people);
    }

}