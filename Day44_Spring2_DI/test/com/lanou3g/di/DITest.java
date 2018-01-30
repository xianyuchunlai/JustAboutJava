package com.lanou3g.di;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:chunLai
 * @Date: Created in 17:23 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class DITest {
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext ( "applicationContext.xml" );
    }

    @Test
    public void person() {
        Object per = context.getBean ( "per" );
        System.out.println ( per );
    }

    
    /**
    *@Author: chunLai
    *@Date:  19:29 
    *@Params  * @param 
    *@Description: 
    */
    @Test
    public void person01(){
        Object per01 = context.getBean ( "per01" );
        System.out.println ( per01 );
    }

    @Test
    public void person02(){
        Object per01 = context.getBean ( "per02" );
        System.out.println ( per01 );
    }

    @Test
    public void person03(){
        Object per01 = context.getBean ( "per03" );
        System.out.println ( per01 );
    }

    @Test
    public void person04(){
        Object per01 = context.getBean ( "per04" );
        System.out.println ( per01 );
    }

    @Test
    public void person05(){
        Object per01 = context.getBean ( "per05" );
        System.out.println ( per01 );
    }

    @Test
    public void person06(){
        Object per01 = context.getBean ( "per06" );
        System.out.println ( per01 );
    }




}