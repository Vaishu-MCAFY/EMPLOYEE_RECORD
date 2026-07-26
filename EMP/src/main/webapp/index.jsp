<html>
<head>
    <title>Employee Record System</title>

    <link rel="stylesheet" href="css/index.css">
</head>
<body>

<header>
    <h1>Employee Record System</h1>

    <div class="auth-buttons">
        <a href="login.jsp" class="btn">Login</a>
        <a href="logout.jsp" class="btn">Logout</a>
    </div>
</header>

<nav>
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="dashboard.jsp">Dashboard</a></li>
        <li><a href="addEmployee.jsp">Add Employee</a></li>
        <li><a href="employeeList.jsp">View Employees</a></li>
        <li><a href="searchEmployee.jsp">Search Employee</a></li>
    </ul>
</nav>

<section class="home">

    <h2>Welcome to Employee Record System</h2>

    <p>
        This application helps you manage employee records efficiently.
        You can add, update, delete, search, serialize employee objects,
        and manage employee records stored in the database.
    </p>

    <a href="dashboard.jsp" class="dashboard-btn">
        Go to Dashboard
    </a>

</section>

<footer>
    <p>© 2026 Employee Record System | Developed using JSP, Servlet, Java & MySQL</p>
</footer>

</body>
</html>