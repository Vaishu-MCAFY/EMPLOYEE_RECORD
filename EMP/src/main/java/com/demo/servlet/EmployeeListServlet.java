package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

@WebServlet("/EmployeeListServlet")
public class EmployeeListServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private EmployeeDAO employeeDAO;

    @Override
    public void init() throws ServletException {
        employeeDAO = new EmployeeDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        List<Employee> employeeList = employeeDAO.getAllEmployees();

        request.setAttribute("employeeList", employeeList);

        request.getRequestDispatcher("/employeeList.jsp")
               .forward(request, response);
    }
}