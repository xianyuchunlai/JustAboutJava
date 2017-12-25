package com.lanou3g.study;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) throws SQLException {
        //dbUtil是apache公司提供的工具类

        //询问执行者，大概是？
        QueryRunner qr =
                new QueryRunner();

        String sql = "select * from hw_user";



        Object query = qr.query(
                JdbcUtil.getConnection(),
                sql,
                new ResultSetHandler<List<User>>() {
                    @Override
                    public List<User> handle(ResultSet resultSet) throws SQLException {
                        //TODO 把resultset 中的数据
                        // 封装到一个对象中

                        List<User> users = new ArrayList<>();
                        while (resultSet.next()) {
                            User user = new User();


                            user.setId(resultSet.getInt(1));
                            user.setUname(resultSet.getString(2));
                            user.setAge(resultSet.getInt(3));
                            user.setLoc(resultSet.getString(4));

                            users.add(user);
                        }


                        return users;
                    }
                });
        System.out.println(query.toString());

    }
}
