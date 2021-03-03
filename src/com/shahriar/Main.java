package com.shahriar;

import com.google.gson.Gson;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
	    UserClass user = new UserClass();
        Gson userJson = new Gson();
        ///JDBC
        try {
            String url = "jdbc:mysql://localhost:3306/industrialproject";
            String name = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,name,password);
            Statement statement1 = connection.createStatement();
            ResultSet queryData = statement1.executeQuery("select * from user");
            while (queryData.next()) {
                user.createProfile(queryData.getString(2),queryData.getString(3),
                        queryData.getString(4),queryData.getString(5),
                        queryData.getString(6),queryData.getString(7),
                        queryData.getString(8),queryData.getString(9),
                        queryData.getString(10),queryData.getString(11));
                System.out.println(userJson.toJson(user));
            }
            connection.close();
            statement1.close();

        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
