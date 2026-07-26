package servlet;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import dao.EmployeeDAO;
import model.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {

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

        EmployeeDAO dao = new EmployeeDAO();

        if (dao.insertEmployee(emp)) {
            response.sendRedirect("EmployeeListServlet");
        } else {
            response.getWriter().println("Employee could not be added.");
        }
    }
}