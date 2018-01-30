package com.lanou3g.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @Author:chunLai
 * @Date: Created in 16:24 2018/1/18
 * @Ver.No: 1.0
 * @Description: 封装HibernateUtil工具类 简化代码
 * @param: 单例设计  SessionFactory 的构造方法无法私有化
 * @ModifiedBy: NONE
 */
public class HibernateUtil {

    //SF属性赋值过程只有一次所以写在静态块
    static SessionFactory SF;

    static {
        SF =
                new Configuration ()
                        .configure ()
                        .buildSessionFactory ();
    }

    //获得session
    public static Session getSession() {
        return SF.openSession ();
    }


              7
    //每次都要开启与提交事务
    //session关闭也是每次都要做的


    public static <T> T handle(ResultHandler<T> rh) {

        //开启session 开启事务
        Session session = SF.openSession ();
        Transaction t = session.getTransaction ();

        //TODO 执行要做的业务逻辑
        T tt = rh.resultHandle ( session );
        t.commit ();
        session.close ();
        return tt;

    }
    //写出接下里会被调用的内部的接口
    interface ResultHandler <T> {
        T resultHandle(Session session);
    }

}
