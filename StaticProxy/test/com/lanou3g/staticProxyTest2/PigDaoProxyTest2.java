package com.lanou3g.staticProxyTest2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:chunLai
 * @Date: Created in 19:37 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class PigDaoProxyTest2 {

    @Test
    public void test(){
        PigDaoImpl p = new PigDaoImpl ();
        Transaction2 t2=new  Transaction2();
        PigDaoProxy pigDaoProxy =new PigDaoProxy ( p,t2 );
        pigDaoProxy.sleep ();
    }

}