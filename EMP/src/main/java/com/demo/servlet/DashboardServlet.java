package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.demo.dao.EmployeeDAO;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {


        EmployeeDAO dao = new EmployeeDAO();


        int totalEmployees = dao.getEmployeeCount();

        double highestSalary = dao.getHighestSalary();

        double lowestSalary = dao.getLowestSalary();

        double averageSalary = dao.getAverageSalary();



        request.setAttribute("totalEmployees", totalEmployees);

        request.setAttribute("highestSalary", highestSalary);

        request.setAttribute("lowestSalary", lowestSalary);

        request.setAttribute("averageSalary", averageSalary);



        request.getRequestDispatcher("dashboard.jsp")
               .forward(request, response);

    }
}