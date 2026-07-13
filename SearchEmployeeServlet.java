package servlet;

import dao.EmployeeDAO;
import model.Employee;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        EmployeeDAO dao = new EmployeeDAO();

        Employee employee = dao.searchEmployee(id);

        request.setAttribute("employee", employee);

        RequestDispatcher rd =
                request.getRequestDispatcher("search.jsp");

        rd.forward(request, response);
    }
}