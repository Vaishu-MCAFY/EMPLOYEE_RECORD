package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    public boolean validate(String username, String password) {

        boolean status = false;

        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

        try {

            Connection con = DBConnection.getConnection();

            System.out.println("Checking username: " + username);
            System.out.println("Checking password: " + password);

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("LOGIN SUCCESS");
                status = true;

            } else {

                System.out.println("LOGIN FAILED - User not found");

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println("DATABASE ERROR:");
            e.printStackTrace();

        }

        return status;
    }
}