package com.lanou3g.aop;

/**
 * @Author:chunLai
 * @Date: Created in 16:52 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println ("----add----");
    }

    @Override
    public void delete() {
        System.out.println ("----delete----");

    }
}
