package  com.demo.servlet;

import com.demo.dao.EmployeeDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public DeleteEmployeeServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int empId = Integer.parseInt(request.getParameter("id"));

        EmployeeDAO dao = new EmployeeDAO();

        boolean status = dao.deleteEmployee(empId);

        if (status) {
            response.sendRedirect("EmployeeListServlet");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Employee could not be deleted.</h3>");
        }
    }
}