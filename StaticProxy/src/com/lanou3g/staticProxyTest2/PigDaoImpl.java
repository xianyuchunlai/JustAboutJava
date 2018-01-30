package com.lanou3g.staticProxyTest2;

/**
 * @Author:chunLai
 * @Date: Created in 19:32 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class PigDaoImpl implements PigDao {
    @Override
    public void sleep() {
        System.out.println ("sleep all day");
    }
}
