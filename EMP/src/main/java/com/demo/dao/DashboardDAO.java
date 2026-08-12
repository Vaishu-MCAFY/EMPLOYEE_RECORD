package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DashboardDAO {

    public int getTotalEmployees() {

        int total = 0;

        String sql = "SELECT COUNT(*) FROM employee";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                total = rs.getInt(1);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;
    }


    public double getHighestSalary() {

        double highest = 0;

        String sql = "SELECT MAX(salary) FROM employee";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                highest = rs.getDouble(1);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return highest;
    }


    public double getLowestSalary() {

        double lowest = 0;

        String sql = "SELECT MIN(salary) FROM employee";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lowest = rs.getDouble(1);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lowest;
    }


    public double getAverageSalary() {

        double average = 0;

        String sql = "SELECT AVG(salary) FROM employee";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                average = rs.getDouble(1);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return average;
    }


    // Used by DashboardServlet
    public int getEmployeeCount() {
        return getTotalEmployees();
    }
}