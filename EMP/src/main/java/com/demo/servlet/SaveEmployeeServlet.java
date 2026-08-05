package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.serialization.EmployeeSerialization;

@WebServlet("/SaveEmployeeServlet")
public class SaveEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        Employee emp = new Employee();

        emp.setEmpId(Integer.parseInt(request.getParameter("empId")));
        emp.setEmpName(request.getParameter("empName"));
        emp.setDepartment(request.getParameter("department"));
        emp.setDesignation(request.getParameter("designation"));
        emp.setSalary(Double.parseDouble(request.getParameter("salary")));
        emp.setEmail(request.getParameter("email"));
        emp.setMobile(request.getParameter("mobile"));
        emp.setAddress(request.getParameter("address"));
        emp.setJoiningDate(request.getParameter("joiningDate"));

        boolean status = EmployeeSerialization.saveEmployee(emp);

        response.setContentType("text/html");

        if (status) {
            response.getWriter().println("<h2>Employee saved successfully.</h2>");
            response.getWriter().println("<a href='serialization.jsp'>Back</a>");
        } else {
            response.getWriter().println("<h2>Failed to save employee.</h2>");
            response.getWriter().println("<a href='serialization.jsp'>Back</a>");
        }
    }
}