package com.lanou3g.staticproxy;

import org.junit.Test;

public class StaticProxyTest {
    @Test
    public void staticProxy() throws Exception {
        UserDaoImpl userDao = new UserDaoImpl();
        Transaction transaction = new Transaction();
        UserDaoProxy userDaoProxy = new UserDaoProxy(transaction, userDao);
        userDaoProxy.add();
        userDaoProxy.delete();

    }
}