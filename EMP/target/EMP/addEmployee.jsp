<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Add Employee</title>
<link rel="stylesheet" href="css/add.css">
</head>
<body>

<div class="container">

    <h2>Add Employee</h2>

    <form action="AddEmployeeServlet" method="post">

        <table>

            <tr>
                <td>Employee ID</td>
                <td><input type="number" name="empId" required></td>
            </tr>

            <tr>
                <td>Employee Name</td>
                <td><input type="text" name="empName" required></td>
            </tr>

            <tr>
                <td>Department</td>
                <td>
                    <select name="department" required>
                        <option value="">Select Department</option>
                        <option>HR</option>
                        <option>IT</option>
                        <option>Finance</option>
                        <option>Sales</option>
                        <option>Marketing</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td>Designation</td>
                <td><input type="text" name="designation" required></td>
            </tr>

            <tr>
                <td>Salary</td>
                <td><input type="number" name="salary" required></td>
            </tr>

            <tr>
                <td>Email</td>
                <td><input type="email" name="email" required></td>
            </tr>

            <tr>
                <td>Mobile</td>
                <td><input type="text" name="mobile" required></td>
            </tr>

            <tr>
                <td>Address</td>
                <td><textarea name="address" rows="3" cols="25"></textarea></td>
            </tr>

            <tr>
                <td>Date of Joining</td>
                <td><input type="date" name="joiningDate" required></td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save Employee">
                    <input type="reset" value="Reset">
                </td>
            </tr>

        </table>

    </form>

</div>

</body>
</html>