package model;

public class Employee {

    private int empId;
    private String empName;
    private String department;
    private String designation;
    private double salary;
    private String email;
    private String mobile;
    private String address;
    private String joiningDate;

    public Employee() {}

    public Employee(int empId, String empName, String department,
                    String designation, double salary,
                    String email, String mobile,
                    String address, String joiningDate) {

        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.joiningDate = joiningDate;
    }


}