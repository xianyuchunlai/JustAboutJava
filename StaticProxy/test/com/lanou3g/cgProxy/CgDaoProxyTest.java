package com.lanou3g.cgProxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 20:08 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class CgDaoProxyTest {
    @Test
    public void test() {
       CgDao c=new CgDaoImpl ();
       CgTransaction ct=new CgTransaction ();
       CgDaoProxy cp=new CgDaoProxy ( c,ct );
        Enhancer e=new Enhancer ();

        e.setCallback ( cp );
        e.setSuperclass ( c.getClass () );
        Object o = e.create ();
        CgDao cg= (CgDao) o;
        cg.play ();
        System.out.println (o.getClass ().getName ());
        System.out.println (o.getClass ().getSuperclass ().getName ());


    }
}