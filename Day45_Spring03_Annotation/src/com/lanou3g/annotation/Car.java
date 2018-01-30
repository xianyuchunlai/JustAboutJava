package com.lanou3g.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author:chunLai
 * @Date: Created in 9:06 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
@Component("car1") //2018-1-23 09:36:46 //2018-1-23 09:46:28
public class Car {

    @Value ( "奥迪双钻" ) //2018-1-23 09:37:31 引用和基本数据类型  引用用装配
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
