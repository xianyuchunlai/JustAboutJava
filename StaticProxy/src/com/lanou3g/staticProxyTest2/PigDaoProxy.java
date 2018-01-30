package com.lanou3g.staticProxyTest2;

import com.lanou3g.staticProxy.Transacation;

/**
 * @Author:chunLai
 * @Date: Created in 19:34 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class PigDaoProxy implements PigDao {
    private PigDao p;

    private Transaction2 t;

    public PigDaoProxy(PigDao p, Transaction2 t) {
        this.p = p;
        this.t = t;
    }

    @Override
    public void sleep() {
        p.sleep ();
        t.eatLot ();
        t.meat ();
    }


}
