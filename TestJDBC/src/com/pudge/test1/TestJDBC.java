package com.pudge.test1;

import com.pudge.entity.Emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        // Driver will register by itself
        Class.forName("com.mysql.cj.jdbc.Driver");
//        List<Emp> empList = testQuery();
//        System.out.println(empList.size());
//        for (Emp emp : empList) {
//            System.out.println(emp);
//        }
        testBatch();
    }

    public static void testSQL(Consumer<PreparedStatement> consumer, String sql) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "123456"); PreparedStatement statement = connection.prepareStatement(sql)) {
            consumer.accept(statement);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void testDelete() {
        testSQL(statement -> {
            try {
                statement.setInt(1, 555);
                int rows = statement.executeUpdate();
                System.out.println(rows);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }, "DELETE FROM dept WHERE deptno = ?");
    }

    public static List<Emp> testQuery() {
        List<Emp> empList = new ArrayList<>();
        testSQL(statement -> {
            try {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    empList.add(new Emp(resultSet.getInt("EMPNO"), resultSet.getString("ENAME")));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }, "SELECT * FROM emp");
        return empList;
    }

    public static void testBatch() {
        testSQL(preparedStatement -> {
            try {
                preparedStatement.setInt(1, 98);
                preparedStatement.setString(2, "a");
                preparedStatement.setString(3, "b");
                preparedStatement.addBatch();
                preparedStatement.setInt(1, 99);
                preparedStatement.setString(2, "c");
                preparedStatement.setString(3, "d");
                preparedStatement.addBatch();
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }, "INSERT INTO dept VALUES(?, ?, ?)");
    }
}