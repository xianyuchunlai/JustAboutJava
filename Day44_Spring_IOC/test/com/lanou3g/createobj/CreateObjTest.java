package com.lanou3g.createobj;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:chunLai
 * @Date: Created in 14:47 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class CreateObjTest {
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        //@Before 注解标注的方法
        //会在每一个@Test方法前执行

        //下面语句语句是获取ApplicationContext
        //几乎Spring所有操作都要获得这个对象
        //这个对象会加载配置信息
        //这个对象可以创建信息
        context = new ClassPathXmlApplicationContext (
                "applicationContext.xml" );
    }

    @Test
    public void helloSpring() {
        context.getBean ( "user" );

    }

    @Test
    public void constructor() {

    }

    @Test
    public void property() throws Exception {
        User user = (User) context.getBean ( "user" );
        User user2 = (User) context.getBean ( "user2" );
        System.out.println ( user.getName () );
        System.out.println ( user2.getName () );

    }
}