package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmployeeDAO {

    public boolean insertEmployee(Employee emp) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emp.getEmpId());
            ps.setString(2, emp.getEmpName());
            ps.setString(3, emp.getDepartment());
            ps.setString(4, emp.getDesignation());
            ps.setDouble(5, emp.getSalary());
            ps.setString(6, emp.getEmail());
            ps.setString(7, emp.getMobile());
            ps.setString(8, emp.getAddress());
            ps.setString(9, emp.getJoiningDate());

            status = ps.executeUpdate() > 0;

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public List<Employee> getAllEmployees() {

        List<Employee> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Employee emp = new Employee();

                emp.setEmpId(rs.getInt("emp_id"));
                emp.setEmpName(rs.getString("emp_name"));
                emp.setDepartment(rs.getString("department"));
                emp.setDesignation(rs.getString("designation"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setEmail(rs.getString("email"));
                emp.setMobile(rs.getString("mobile"));
                emp.setAddress(rs.getString("address"));
                emp.setJoiningDate(rs.getString("joining_date"));

                list.add(emp);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean deleteEmployee(int empId) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM employee WHERE emp_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, empId);

            status = ps.executeUpdate() > 0;

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public int getEmployeeCount() {

        int count = 0;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT COUNT(*) FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public double getHighestSalary() {

        double salary = 0;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT MAX(salary) FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                salary = rs.getDouble(1);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return salary;
    }

    public double getLowestSalary() {

        double salary = 0;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT MIN(salary) FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                salary = rs.getDouble(1);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return salary;
    }

    public double getAverageSalary() {

        double salary = 0;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT AVG(salary) FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                salary = rs.getDouble(1);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return salary;
    }
}