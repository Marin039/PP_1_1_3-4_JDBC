package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Kotik118";
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";


    public static Connection getConnection() {
        Connection connection;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение установлено");
        } catch (ClassNotFoundException e){
            throw new RuntimeException("Не найден класс");
        }catch (SQLException e){
            throw new RuntimeException("Не удалось установить соединение");
        }
        return connection;
    }
}
