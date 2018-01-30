package com.lanou3g.aop;

/**
 * @Author:chunLai
 * @Date: Created in 16:53 2018/1/23
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
public class Transaction {
    public void begin() {
        System.out.println ( "begin----" );
    }

    public void commit() {
        System.out.println ( "commit----" );
    }

}
