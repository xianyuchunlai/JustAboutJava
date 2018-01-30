package com.lanou3g.di;

import java.util.*;

/**
 * @Author:chunLai
 * @Date: Created in 17:16 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private Car car;
    private List list;
    private Set set;
    private Map map;
    private Properties properties;
    private Object[] objects;

    public Person(String name, int age, String gender, Car car, List list, Set set, Map map, Properties properties, Object[] objects) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.car = car;
        this.list = list;
        this.set = set;
        this.map = map;
        this.properties = properties;
        this.objects = objects;
    }

    public Person(Car car) {
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", car=" + car +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                ", objects=" + Arrays.toString ( objects ) +
                '}';
    }





    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person(String name, Car car) {

        this.name = name;
        this.car = car;
    }
}
