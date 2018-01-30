package com.lanou3g.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:chunLai
 * @Date: Created in 19:48 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class JdkProxy  implements InvocationHandler {

    private Object target;
    private JdkTransaction j;

    public JdkProxy(Object target, JdkTransaction j) {
        this.target = target;
        this.j = j;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        j.go1 ();
        method.invoke ( target,args );
        j.go2 ();
        return null;
    }
}
