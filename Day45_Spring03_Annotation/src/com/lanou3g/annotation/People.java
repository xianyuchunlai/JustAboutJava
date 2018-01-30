package com.lanou3g.annotation;

/**
 * @Author:chunLai
 * @Date: Created in 10:17 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class People {
    private String name;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
