package com.pudge.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Consumer;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        // Driver will register by itself
        Class.forName("com.mysql.cj.jdbc.Driver");
        testDelete();
    }

    public static void testSQL(Consumer<Statement> consumer) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mytestdb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                "root", "123456"); Statement statement = connection.createStatement()) {
            consumer.accept(statement);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void testDelete() {
        testSQL(statement -> {
            String sql = "DELETE FROM dept WHERE deptno = 555;";
            try {
                int rows = statement.executeUpdate(sql);
                System.out.println(rows);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
    }
}