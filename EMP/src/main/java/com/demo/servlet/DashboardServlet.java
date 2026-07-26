@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        EmployeeDAO dao = new EmployeeDAO();

        request.setAttribute("totalEmployees", dao.getEmployeeCount());
        request.setAttribute("highestSalary", dao.getHighestSalary());
        request.setAttribute("lowestSalary", dao.getLowestSalary());
        request.setAttribute("averageSalary", dao.getAverageSalary());

        request.getRequestDispatcher("dashboard.jsp")
               .forward(request, response);
    }
}