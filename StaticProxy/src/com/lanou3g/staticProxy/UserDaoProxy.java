package com.lanou3g.staticProxy;

/**
 * @Author:chunLai
 * @Date: Created in 19:24 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class UserDaoProxy implements UserDao {
    private Transacation transacation;
    private UserDao userDao;

    public UserDaoProxy(Transacation transacation, UserDao userDao) {
        this.transacation = transacation;
        this.userDao = userDao;
    }

    public UserDaoProxy(Transacation transacation) {
        this.transacation = transacation;
    }

    @Override
    public void sayHello() {
        transacation.sayGoodBye ();
        transacation.sayhi ();
        userDao.sayHello ();
    }
}
