package com.lanou3g.lifecycle;

/**
 * @Author:chunLai
 * @Date: Created in 16:00 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class Person {

    public Person() {
        System.out.println ( "Person#Constuctor" );
    }

    public void init() {
        System.out.println ( "可以在这个方法中,初始化一些必要数据" );
    }

    public void destroy() {
        System.out.println (
                "当对象即将被销毁时执行," + "可以释放一些资源"
        );
    }

}
