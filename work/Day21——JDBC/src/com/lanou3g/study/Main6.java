package com.lanou3g.study;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main6 {
    public static void main(String[] args) {
        //{}就是匿名内部类实现ExecuteInter接口时
        //复写的那个方法execute的方法体
        //conn是execute的参数
        JdbcUtil.execute(conn -> {
            try {
                PreparedStatement pstate = conn.prepareStatement("INSERT INTO  hw_user " +
                        "VALUES (null, 'zhangSan',30,'上海')");
                //将30岁的张三添加到批处理中
                pstate.addBatch();

                //添加批处理任务
                pstate.addBatch("INSERT INTO  hw_user " +
                        "VALUES (null, 'liSi',10,'武汉')");
                pstate.addBatch("INSERT INTO  hw_user " +
                        "VALUES (null, '张三',11,'武汉')");
                //开始执行批处理任务
                pstate.executeBatch();
                return pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
