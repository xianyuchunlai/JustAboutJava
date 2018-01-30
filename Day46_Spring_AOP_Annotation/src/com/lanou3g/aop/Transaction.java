package com.lanou3g.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Author:chunLai
 * @Date: Created in 9:25 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
@Component //注册成bean(对于spring来说的bean)  2018-1-24 09:28:32
@Aspect // 将Transaction作为一个切面来使用
@EnableAspectJAutoProxy(
        proxyTargetClass = true) //不管目标类是否实现接口,都想要CGLIB的方式实现动态代理 2018-1-24 11:05:56
public class Transaction {

    //在切面类中 各种通知方法,都是通过下面这个方法的名字 找到这里定义的切入点表达式 再由切入点表达式,找到我们指定的那些切入点
    @Pointcut("execution(String com.lanou3g.aop.UserDaoImpl.*(..))")
    //切入点表达式 2018-1-24 09:40:29  //*---String   2018-1-24 10:40:03
    public void pointCut() {
        System.out.println ( "-----pointCut----" );
    }

    //在切入点之前执行
    @Before("pointCut()")  //begin 是transaction中的一个切面 2018-1-24 09:42:49
    public void begin(JoinPoint joinPoint) { //2018-1-24 10:30:49  添加一个参数
        System.out.println (   //2018-1-24 10:34:34
                "----begin---     连接点:"
                        + joinPoint.getSignature ().getName ()
                        + "        目标类:  "
                        + joinPoint.getTarget ().getClass ().getName () );
    }

//    @After ( "pointCut()" ) 2018-1-24 09:55:51

    //当方法成功返回后会执行
    //若方法抛出异常,则不会执行
    //returning = "getS" :指定
    //方法的返回值要传入到commit的哪个参数中
    @AfterReturning(value = "pointCut()", returning = "getS") //2018-1-24 09:56:12
    public void commit(String getS) { //2018-1-24 11:00:55   添加个返回值

        System.out.println ( "----commit---" + getS );
    }


    //最终通知, 不管切入点是否执行成功(是执行完了,还是抛出异常了) 最终通知都会执行 相当于 try-catch中的finally块
    @After("pointCut()") //2018-1-24 09:59:36
    public void finallyMethod() {
        System.out.println ( "----最终会执行的(最终还是放开了手)----类似finally" );
    }

    @AfterThrowing(value = "pointCut()", throwing = "throwable") //2018-1-24 10:04:06
    public void pointCutThrow(Throwable throwable) {
        System.out.println ( "异常通知:" + throwable.getMessage () );
    }

    @Around("pointCut()") //要给一个参数ProceedingJoinPoint   //返回值void---String
    public String around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println ( "------兄弟买挂嘛-----环绕通知" );

        //继续执行 2018-1-24 10:25:22

        Object proceed = pjp.proceed ();//2018-1-24 10:43:17 获取返回值 这个返回值就是连接点的返回值

        System.out.println ( "-------around------- 环绕通知" );
        return proceed.toString ();//2018-1-24 10:43:17
    }


}
