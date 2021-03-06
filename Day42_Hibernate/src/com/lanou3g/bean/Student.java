package com.lanou3g.bean;

/**
 * @Author:chunLai
 * @Date: Created in 10:00 2018/1/18
 * @Ver.No:
 * @Description:
 * @param:
 * @ModifiedBy:
 */
public class Student {
    private long sid;
    private String name;
    private int age;
    private String gender;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Student(long sid, String name, int age, String gender) {

        this.sid = sid;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {

    }
}
