package com.lanou3g.study;

import jdk.nashorn.internal.ir.WhileNode;

import java.sql.*;

public class Main5 {
    /**
     * 1,PrepareStatement 可以使用动态参数
     * Statement只能执行静态的sql语句
     * <p>
     * 2，防止sql注入
     * 什么是sql注入
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        JdbcUtil.execute(conn -> {

            try {
                PreparedStatement pstate = conn.prepareStatement(
                        "SELECT * FROM hw_user WHERE loc=? AND age > ?;");

                pstate.setString(1, "北京");
                pstate.setInt(2, 20);

                ResultSet rs = pstate.executeQuery();

                JdbcUtil.showRS(rs);

                return pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        });


        JdbcUtil.execute(conn -> {
            return null;
        });
    }

//    String s =
//            "select * from username = 'zhangSan' and password ='123' ";
//
//
//    String user = "zhangSan";
//    String password = "123";
//    String sql =
//            "select * from user where username = " + user
//                    + "and password =" + password;


}
