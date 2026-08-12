package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.dao.LoginDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        LoginDAO dao = new LoginDAO();

        boolean status = dao.validate(username, password);

        if (status) {

            System.out.println("Redirecting to dashboard...");

            HttpSession session = request.getSession();

            session.setAttribute("username", username);

        response.sendRedirect("DashboardServlet");
        } else {

            System.out.println("Invalid username/password");

            request.setAttribute(
                "error",
                "Invalid Username or Password"
            );

            request.getRequestDispatcher("login.jsp")
                   .forward(request, response);
        }
    }
}