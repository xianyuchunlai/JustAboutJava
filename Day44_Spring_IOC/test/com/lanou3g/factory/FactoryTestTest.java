package com.lanou3g.factory;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 15:37 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class FactoryTestTest {
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context =
                new ClassPathXmlApplicationContext (
                        "applicationContext.xml" );

    }

    @Test
    public void staticFactory() {
        Object staticFactory =
                context.getBean ( "staticFactory" );
        System.out.println ( staticFactory );
    }

    @Test
    public void fact() {
        //因为我们在配置文件中,已经为user指定了
        // 工厂,所以这里不需要先获得工厂再获得User对象
        // Spring已经帮我们创建好了
        Object user3 =
                context.getBean ( "user3" );
        System.out.println ( user3 );
    }


}