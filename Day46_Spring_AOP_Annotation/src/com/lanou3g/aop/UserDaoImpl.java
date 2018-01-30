package com.lanou3g.aop;

import org.springframework.stereotype.Repository;

/**
 * @Author:chunLai
 * @Date: Created in 9:24 2018/1/24
 * @Ver.No: 1.0
 * @Description:
 * @param:
 * @ModifiedBy: NONE
 */
@Repository("userDao") //2018-1-24 09:45:43  不给名称的话是 userDaoImpl
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {

//        int a=10/0;//2018-1-24 09:54:11  commit 还是执行了,不管这个方法是否已经正常执行  ,就像finally 在太容易cath

        System.out.println ( "-----add----" );
    }

    @Override
    public String get(){
        return "大叶火焰草,庐山楼梯草,阴生沿阶草,七叶一枝花";
    }
}
