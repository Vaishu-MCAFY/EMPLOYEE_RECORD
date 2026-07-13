package dao;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private static final String FILE_NAME = "employees.dat";

    public void saveEmployee(Employee employee) {

        List<Employee> employees = getAllEmployees();

        employees.add(employee);

        saveAllEmployees(employees);
    }

    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return employees;
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            employees = (List<Employee>) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employees;
    }

    public Employee searchEmployee(int id) {

        List<Employee> employees = getAllEmployees();

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                return emp;
            }

        }

        return null;
    }

    public boolean updateEmployee(Employee employee) {

        List<Employee> employees = getAllEmployees();

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getId() == employee.getId()) {

                employees.set(i, employee);

                saveAllEmployees(employees);

                return true;
            }
        }

        return false;
    }

    public boolean deleteEmployee(int id) {

        List<Employee> employees = getAllEmployees();

        boolean removed = employees.removeIf(emp -> emp.getId() == id);

        if (removed) {

            saveAllEmployees(employees);

        }

        return removed;
    }

    private void saveAllEmployees(List<Employee> employees) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}