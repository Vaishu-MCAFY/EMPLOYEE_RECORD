package servlet;

import dao.EmployeeDAO;
import model.Employee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String department = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee employee = new Employee(id, name, department, salary);

        EmployeeDAO dao = new EmployeeDAO();

        if (dao.updateEmployee(employee)) {
            response.sendRedirect("success.jsp");
        } else {
            response.getWriter().println("<h3>Employee Not Found!</h3>");
        }
    }
}