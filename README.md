# Employee Record System

The Employee Record System is a web-based application developed using JSP, Servlets, MySQL, and Java Serialization. It helps manage employee information by providing CRUD operations (Create, Read, Update, Delete), search functionality, and object serialization.

## Technologies Used
- Java
- JSP
- Servlets
- MySQL
- HTML5
- CSS3
- Apache Tomcat
- Maven
-Visual Studio IDE

## Project Features
1. Home
- Welcome Page
- Navigation Menu
- Login

2. Dashboard
- Total Employees
- Higest salary
- Lowest Salary
- Average Salary
- Add Employee
- View Employees
- Serialization
- Database Operations

3. Employee Management
- Add Employee
- View Employee
- Update Employee
- Delete Employee
- 
4. Serialization
- Save Employee Object
- Load Employee Object

5. Database
- Store Employee Records
- Retrieve Employee Records
- Update Employee Records
- Delete Employee Records

### Project Structure  
  EMP/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── demo/
│                   ├── dao/
│                   │   ├── DashboardDAO.java
│                   │   ├── DBConnection.java
│                   │   ├── EmployeeDAO.java
│                   │   └── LoginDAO.java
│                   ├── model/
│                   │   └── Employee.java
│                   ├── serialization/
│                   │   ├── EmployeeSerialization.java
│                   │   ├── LoadEmployee.java
│                   │   └── SaveEmployee.java
│                   └── servlet/
│                       ├── AddEmployeeServlet.java
│                       ├── DashboardServlet.java
│                       ├── DeleteEmployeeServlet.java
│                       ├── EmployeeListServlet.java
│                       ├── LoadEmployeeServlet.java
│                       ├── LoginServlet.java
│                       ├── LogoutServlet.java
│                       └── SaveEmployeeServlet.java
├── webapp/
│   ├── css/
│   │   ├── add.css
│   │   ├── dashboard.css
│   │   ├── employee.css
│   │   ├── index.css
│   │   ├── login.css
│   │   └── serial.css
│   ├── WEB-INF/
│   │   └── web.xml
│   ├── addEmployee.jsp
│   ├── dashboard.jsp
│   ├── employeeList.jsp
│   ├── index.jsp
│   ├── login.jsp
│   └── serialization.jsp
├── target/
├── employee_db.sql
├── pom.xml
└── README.md


## Installation and Execution

### Prerequisites

- Java Development Kit (JDK)
- Apache Maven
- MySQL Server
- Apache Tomcat
- Visual Studio Code or another Java IDE

### Steps to Run the Project

1. Open the EMP folder in your IDE.
2. Start MySQL and execute employee_db.sql.
3. Configure the MySQL connection in DBConnection.java.
4. Build the project using Maven:

   bash
   mvn clean package
   

6. Deploy the generated WAR file to Apache Tomcat.
7. Start the Tomcat server.
8. Open the application in your browser using the configured application context path, for example:

   text
   http://localhost:8080/EMP/
   
   Adjust the URL if your deployed application uses a different context path.
   

## Java Serialization

Java Serialization converts an object into a byte stream so that it can be saved and loaded later.
The project includes the following serialization classes:

- EmployeeSerialization.java – Handles employee serialization functionality.
- SaveEmployee.java – Supports saving employee objects.
- LoadEmployee.java – Supports loading serialized employee objects.

The corresponding servlets, SaveEmployeeServlet.java and LoadEmployeeServlet.java, connect serialization operations to the web application.

For serialization to work, the Employee model class must implement java.io.Serializable.


## Future Enhancements

- Update employee records
- Search and filter employee information
- Role-based access control
- Export employee data to CSV or PDF
- Employee payroll and payslip generation
- Improved validation and security


## Author

**Project Name:** Employee Record System  
**Project Folder:** EMP  
**Backend:** Java, JSP, Servlets  
**Database:** MySQL  
**Serialization:** Java Object Serialization  
**Build Tool:** Maven  
**Server:** Apache Tomcat


