<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.util.*,model.Employee"%>

<html>
<head>
<title>View Employees</title>

<link rel="stylesheet" href="css/employee.css">

</head>
<body>

<div class="container">

<h2>Employee List</h2>

<table border="1">

<tr>

<th>ID</th>
<th>Name</th>
<th>Department</th>
<th>Designation</th>
<th>Salary</th>
<th>Email</th>
<th>Mobile</th>
<th>Address</th>
<th>Joining Date</th>
<th>Action</th>

</tr>

<%

List<Employee> list=(List<Employee>)request.getAttribute("employeeList");

if(list!=null){

for(Employee e:list){

%>

<tr>

<td><%=e.getEmpId()%></td>

<td><%=e.getEmpName()%></td>

<td><%=e.getDepartment()%></td>

<td><%=e.getDesignation()%></td>

<td><%=e.getSalary()%></td>

<td><%=e.getEmail()%></td>

<td><%=e.getMobile()%></td>

<td><%=e.getAddress()%></td>

<td><%=e.getJoiningDate()%></td>

<td>

<a href="EditEmployeeServlet?id=<%=e.getEmpId()%>">Edit</a>

|

<a href="DeleteEmployeeServlet?id=<%=e.getEmpId()%>"
onclick="return confirm('Delete this employee?')">
Delete
</a>

</td>

</tr>

<%

}

}

%>

</table>

</div>

</body>
</html>