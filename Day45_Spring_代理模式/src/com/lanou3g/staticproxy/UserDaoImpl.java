package com.lanou3g.staticproxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("---------add---------");
    }

    @Override
    public void delete() {
        System.out.println("--------delete---------");
    }
}
