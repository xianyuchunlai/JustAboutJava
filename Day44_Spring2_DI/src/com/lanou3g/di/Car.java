package com.lanou3g.di;

/**
 * @Author:chunLai
 * @Date: Created in 17:15 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class Car {
    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String name) {
        this.name = name;
    }
}
