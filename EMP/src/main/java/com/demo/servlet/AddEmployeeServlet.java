package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        try {

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

            EmployeeDAO dao = new EmployeeDAO();

            boolean status = dao.insertEmployee(emp);

            if (status) {
                response.sendRedirect("EmployeeListServlet");
            } else {
                response.getWriter().println("<h2>Employee Not Added!</h2>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h2>Error : " + e.getMessage() + "</h2>");
        }
    }
}