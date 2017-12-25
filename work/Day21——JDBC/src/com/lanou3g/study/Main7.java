package com.lanou3g.study;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main7 {
    public static void main(String[] args) {
        /*
        事物的四个特性：原子性，一致性，隔离性，持久性（ACID）
         */
        JdbcUtil.execute(conn -> {
            //设置为false，表示要手动提交。也就是开启了事物，默认是自动提交
            PreparedStatement pstatee = null;
            try {
                conn.setAutoCommit(false);
                pstatee = conn.prepareStatement("DELETE FROM hw_user WHERE uname=?");
                pstatee.setString(1, "zhangSan");
                pstatee.execute();
//                Class.forName("");
                pstatee.setString(1, "liSi");
                pstatee.execute();

                //提交事物
                conn.commit();
//                return pstatee;
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                //回滚，取消操作
                try {
                    conn.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            return pstatee;
        });
    }
}
