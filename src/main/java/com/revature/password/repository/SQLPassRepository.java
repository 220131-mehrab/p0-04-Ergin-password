package com.revature.password.repository;

import com.revature.password.domain.Password;

import java.sql.*;
import java.util.List;

public class SQLPassRepository implements PassRepository {
    @Override
    public Password getUserName(String userName) {
        Password result = null;
        {
            try {
                Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
                String query = "SELECT * FROM PASSWORD WHERE NAME = 'RACHEL'";
                Statement statement = conn.createStatement();
                statement.execute(query);
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    result = Password.of()
                            .id(resultSet.getString("ID"))
                            .password(resultSet.getString("PASSWORD"))
                            .name(resultSet.getString("NAME"))
                            .lastname(resultSet.getString("LASTNAME"))
                            .email(resultSet.getString("EMAIL"))
                            .phone(resultSet.getString("PHONE"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return result;
        }


        }
         @Override
         public List<Password> getUserPass() {
            return null;
        }
    }
