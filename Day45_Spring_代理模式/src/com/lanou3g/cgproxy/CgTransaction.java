package com.lanou3g.cgproxy;

public class CgTransaction {

    //切面
    public void begin(){
        System.out.println("begin----");
    }

     public void hello(){
        System.out.println("hello----");
    }




    public void commit(){
        System.out.println("commit----");
    }
}
