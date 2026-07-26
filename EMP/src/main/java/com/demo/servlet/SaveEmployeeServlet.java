package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import model.Employee;
import serialization.EmployeeSerialization;

@WebServlet("/SaveEmployeeServlet")
public class SaveEmployeeServlet extends HttpServlet {

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

        if (EmployeeSerialization.saveEmployee(emp)) {
            response.getWriter().println("Employee object saved successfully.");
        } else {
            response.getWriter().println("Failed to save employee object.");
        }
    }
}