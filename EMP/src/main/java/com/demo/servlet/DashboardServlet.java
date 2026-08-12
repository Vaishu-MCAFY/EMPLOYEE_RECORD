package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.DashboardDAO;
@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        DashboardDAO dao = new DashboardDAO();

        int totalEmployees = dao.getEmployeeCount();
        double highestSalary = dao.getHighestSalary();
        double lowestSalary = dao.getLowestSalary();
        double averageSalary = dao.getAverageSalary();

        System.out.println("Total Employees = " + totalEmployees);
        System.out.println("Highest Salary = " + highestSalary);
        System.out.println("Lowest Salary = " + lowestSalary);
        System.out.println("Average Salary = " + averageSalary);

        request.setAttribute("totalEmployees", totalEmployees);
        request.setAttribute("highestSalary", highestSalary);
        request.setAttribute("lowestSalary", lowestSalary);
        request.setAttribute("averageSalary", averageSalary);

        RequestDispatcher rd =
                request.getRequestDispatcher("dashboard.jsp");

        rd.forward(request, response);
    }
}