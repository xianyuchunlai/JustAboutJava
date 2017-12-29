package com.lanou3g.study;

public class User {
    private  String username;
    private  String gemder;
    private String age;
    public User() {
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", gemder='" + gemder + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGemder() {
        return gemder;
    }

    public void setGemder(String gemder) {
        this.gemder = gemder;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
