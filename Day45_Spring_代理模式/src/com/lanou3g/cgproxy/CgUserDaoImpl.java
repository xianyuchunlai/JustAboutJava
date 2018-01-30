package com.lanou3g.cgproxy;

public class CgUserDaoImpl implements CgUserDao {
    //目标对象
    @Override
    public void add() {
        System.out.println("---------add---------");
    }

    @Override
    public void delete() {
        System.out.println("--------delete---------");
    }
}
