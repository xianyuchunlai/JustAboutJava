package homeWork;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBC {
    /*
    JDBC全称：
    java Database connection
    java 对对数据库的连接规范



    导入的包叫驱动
    使用不同的数据库
    就导入不同的jar包

     */
    public static void main(String[] args) throws SQLException {

        //1注册驱动
        DriverManager.registerDriver(new Driver());


        //2获得连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day19", "root", "123"
        );

        //3找个对象干活

        String sql = "select * from userdata";
        Statement statement = connection.createStatement();

        //4让这个对象去执行mysql语句
        //返回值类型为ResultSet
        ResultSet resultSet = statement.executeQuery(sql);

        //5从ResultSet中取数据
        while (resultSet.next()) {
            System.out.print(resultSet.getString(1) + "\t");
            System.out.print(resultSet.getString(2) + "\t");
            System.out.print(resultSet.getString(3) + "\t");
            System.out.print(resultSet.getString(4) + "\t");
            System.out.println();
        }


        //6关闭资源
        connection.close();
        statement.close();
        resultSet.close();
    }


}
