package ru.itsjava.jdbc.dao;

import java.sql.*;

public class UserDaoImpl implements UserDao{
    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online_course?serverTimezone=UTC";
    public static final String DB_LOGIN = "";
    public static final String DB_PASSWORD = "";

    @Override
    public int getAgeByUserName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT age FROM schema_online_course.users where name = ?")
        ) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }
}
