package com.lanou3g.cgproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:chunLai
 * @Date: Created in 15:47 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class CgProxy implements MethodInterceptor {

    private Object target;
    private CgTransaction cgTransaction;

    public CgProxy(Object target, CgTransaction cgTransaction) {
        this.target = target;
        this.cgTransaction = cgTransaction;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        cgTransaction.begin ();
        cgTransaction.hello ();

        method.invoke ( target, objects );

        cgTransaction.commit ();
        return null;
    }
}
