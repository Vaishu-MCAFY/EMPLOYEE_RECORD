<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = (String) session.getAttribute("username");

    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<html>
<head>
<title>Dashboard</title>
<link rel="stylesheet" href="css/dashboard.css">
</head>
<body>

<header>
    <h2>Employee Record System</h2>

    <div>
        Welcome, <b><%= username %></b> |
        <a href="LogoutServlet">Logout</a>
    </div>
</header>

<nav>
    <ul>
        <li><a href="dashboard.jsp">Dashboard</a></li>
        <li><a href="addEmployee.jsp">Add Employee</a></li>
        <li><a href="EmployeeListServlet">View Employees</a></li>
        <li><a href="serialization.jsp">Serialization</a></li>
    </ul>
</nav>

<div class="container">

    <h1>Dashboard</h1>

    <div class="cards">

        <div class="card">
            <h3>Total Employees</h3>
            <h2>${totalEmployees}</h2>
        </div>

        <div class="card">
            <h3>Highest Salary</h3>
            <h2>₹${highestSalary}</h2>
        </div>

        <div class="card">
            <h3>Lowest Salary</h3>
            <h2>₹${lowestSalary}</h2>
        </div>

        <div class="card">
            <h3>Average Salary</h3>
            <h2>₹${averageSalary}</h2>
        </div>

    </div>

</div>

</body>
</html>