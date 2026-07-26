<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login - Employee Record System</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>

<div class="login-container">

    <h2>Employee Record System</h2>
    <h3>Login</h3>

    <form action="LoginServlet" method="post">

        <label>Username</label>
        <input type="text" name="username" placeholder="Enter Username" required>

        <label>Password</label>
        <input type="password" name="password" placeholder="Enter Password" required>

        <input type="submit" value="Login" class="login-btn">

    </form>

    <%
        String msg = (String) request.getAttribute("error");
        if(msg != null){
    %>
        <p class="error"><%= msg %></p>
    <%
        }
    %>

</div>

</body>
</html>