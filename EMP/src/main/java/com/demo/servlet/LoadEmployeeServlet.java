package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.serialization.EmployeeSerialization;

@WebServlet("/LoadEmployeeServlet")
public class LoadEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        Employee emp = EmployeeSerialization.loadEmployee();

        request.setAttribute("employee", emp);

        request.getRequestDispatcher("serialization.jsp")
               .forward(request, response);
    }
}