<%@ page import="model.Employee" %>

<%
Employee emp = (Employee) request.getAttribute("employee");
%>

<html>
<head>
<title>Serialization</title>
</head>
<body>

<h2>Employee Serialization</h2>

<form action="SaveEmployeeServlet" method="post">
    Employee ID:
    <input type="number" name="empId"><br><br>

    Name:
    <input type="text" name="empName"><br><br>

    Department:
    <input type="text" name="department"><br><br>

    Designation:
    <input type="text" name="designation"><br><br>

    Salary:
    <input type="number" name="salary"><br><br>

    Email:
    <input type="email" name="email"><br><br>

    Mobile:
    <input type="text" name="mobile"><br><br>

    Address:
    <input type="text" name="address"><br><br>

    Joining Date:
    <input type="date" name="joiningDate"><br><br>

    <input type="submit" value="Save Employee">
</form>

<br>

<a href="LoadEmployeeServlet">Load Employee</a>

<%
if(emp != null){
%>

<h3>Loaded Employee Details</h3>

Employee ID: <%= emp.getEmpId() %><br>
Name: <%= emp.getEmpName() %><br>
Department: <%= emp.getDepartment() %><br>
Designation: <%= emp.getDesignation() %><br>
Salary: <%= emp.getSalary() %><br>
Email: <%= emp.getEmail() %><br>
Mobile: <%= emp.getMobile() %><br>
Address: <%= emp.getAddress() %><br>
Joining Date: <%= emp.getJoiningDate() %><br>

<%
}
%>

</body>
</html>