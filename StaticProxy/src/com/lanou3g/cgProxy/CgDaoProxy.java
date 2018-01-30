package com.lanou3g.cgProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:chunLai
 * @Date: Created in 20:02 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class CgDaoProxy implements MethodInterceptor {
    private Object object;

    public CgDaoProxy(Object object, CgTransaction cgT) {
        this.object = object;
        this.cgT = cgT;
    }

    private CgTransaction cgT;



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        cgT.nonono ();
        method.invoke ( object,objects );
        cgT.whynot ();
        return null;
    }
}
