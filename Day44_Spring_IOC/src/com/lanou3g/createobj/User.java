package com.lanou3g.createobj;

/**
 * @Author:chunLai
 * @Date: Created in 14:40 2018/1/22
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class User {

    private String name;
    private int age;
    private Boolean isLogin;


    public User() {
        System.out.println ( "空参数的构造方法----User" + this );
    }

    public User(String name, int age, Boolean isLogin) {
        this.name = name;
        this.age = age;
        this.isLogin = isLogin;
        System.out.println ( "有参数的构造方法----User" + this + name + "----" + age + "----" + isLogin );
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

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isLogin=" + isLogin +
                '}';
    }
}
