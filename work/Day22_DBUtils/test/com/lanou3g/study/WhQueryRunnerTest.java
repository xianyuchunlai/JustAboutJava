package com.lanou3g.study;

import com.lanou3g.utils.JdbcUtil;
import org.apache.commons.dbutils.BaseResultSetHandler;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class WhQueryRunnerTest {

    /*
    根据需求结果的类型
    选择ResultSetHandler的实现类
    如果结果集为单行单列；ScalarHandler
    如果想要一个对象的集合： BeanListHandler
    如果想要一个对象：BeanHandler
    如果想要一个Map：MapHandler
    如果想要一个Map集合：MapListHandler
    如果想要一个数组：ArrayHandler
    如果想要一个数组的集合：ArrayListHandler

     */

    @Test
    public void queryByParams() throws SQLException {
//        List<Object[]> query =
        Long query = new WhQueryRunner().query(
                JdbcUtil.getConnection(),
                "select count(*)from hw_user",
                new ScalarHandler<Long>()
//                new ArrayListHandler()


//                "李小龙"

        );
        //Number类
        //
        Number number = query;
        int i = number.intValue();

        System.out.println(i);
        System.out.println(query);

//        for (Object[] objects : query) {
//            System.out.println(Arrays.toString(objects));
//        }

    }


    @Test
    public void queryBean() throws SQLException {
        List<User> users = new WhQueryRunner().query(
                JdbcUtil.getConnection(),
                "select* from hw_user",
                new BeanListHandler<User>(User.class) {
                });
        System.out.println(users);
    }

    @Test
    public void queryMap() throws SQLException {
        Map<String, Object> objectMap = new WhQueryRunner().query(
                JdbcUtil.getConnection(),
                "select* from hw_user",
                new MapHandler()
        );
        System.out.println(objectMap.toString());
    }

}