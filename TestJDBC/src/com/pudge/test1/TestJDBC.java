package com.pudge.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Driver will register by itself
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "123456");
        Statement statement = connection.createStatement();
        String createNewDepartmentSQL = "INSERT INTO dept VALUES(50, '教学部', '北京');";
        int rows = statement.executeUpdate(createNewDepartmentSQL);
        System.out.println("effect rows:" + rows);
        statement.close();
        connection.close();
    }
}
