package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import model.Employee;
import serialization.EmployeeDeserialization;

@WebServlet("/LoadEmployeeServlet")
public class LoadEmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        Employee emp = EmployeeDeserialization.loadEmployee();

        request.setAttribute("employee", emp);

        request.getRequestDispatcher("serialization.jsp")
               .forward(request, response);
    }
}