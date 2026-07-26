package servlet;

import dao.EmployeeDAO;
import model.Employee;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/EmployeeListServlet")
public class EmployeeListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        EmployeeDAO dao = new EmployeeDAO();

        List<Employee> list = dao.getAllEmployees();

        request.setAttribute("employeeList", list);

        request.getRequestDispatcher("employeeList.jsp")
               .forward(request, response);
    }
}