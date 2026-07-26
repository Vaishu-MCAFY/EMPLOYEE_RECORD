package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple login (replace with database validation)
        if(username.equals("admin") && password.equals("admin123")){

            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.sendRedirect("dashboard.jsp");

        }else{

            request.setAttribute("error", "Invalid Username or Password");
            request.getRequestDispatcher("login.jsp").forward(request, response);

        }
    }
}