package com.lanou3g.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author:chunLai
 * @Date: Created in 9:06 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */

//2018-1-23 09:17:09 一般就是不知道这个类有什么具体作用时,就用这个注解
@Component("p")


public class Person {

    @Qualifier("car1")//2018-1-23 09:45:44  按名称去找
    @Autowired //2018-1-23 09:36:36    装配  按类型去找值  默认每一个scope都是单例模式
    private Car car;

    @Value("王不留行")
    private String name;

    @Value("male? ") //2018-1-23 09:54:21
    private String gender;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("female? ")
    @Required() //2018-1-23 09:53:16
    public void setGender(String gender) {
        this.gender = gender;
    }

    @PostConstruct //2018-1-23 09:58:33
    public void showPost() {
        System.out.println ( "初始化了-----" );
    }

    @PreDestroy //2018-1-23 09:58:28
    public void showPre() {
        System.out.println ( "销毁了-----" );
    }

    public Car getCar() {
        return car;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "car=" + car +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
