package com.lanou3g.cgproxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 15:51 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class CgProxyTest {

    @Test
    public void cgProxy() throws Exception {
        CgUserDao cgUserDao = new CgUserDaoImpl ();
        CgTransaction cgTransaction = new CgTransaction ();

        //到这一步,基本和jdk动态代理的流程相同
        CgProxy cgProxy =
                new CgProxy ( cgUserDao, cgTransaction );

        //代码增强类
        Enhancer enhancer = new Enhancer ();

        //指定哪个拦截器来执行intercept方法
        enhancer.setCallback ( cgProxy );

        //指定生成的代理类的父类
        enhancer.setSuperclass (
                cgUserDao.getClass ()
        );

        Object o = enhancer.create ();

        CgUserDao cgDao = (CgUserDao) o;

        cgDao.add ();
        cgDao.delete ();
        System.out.println ( o.getClass ().getName () );
        System.out.println ( o.getClass ().getSuperclass ().getName () );
    }

}