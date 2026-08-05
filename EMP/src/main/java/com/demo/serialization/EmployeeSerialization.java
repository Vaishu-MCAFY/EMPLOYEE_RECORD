package com.demo.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.model.Employee;

public class EmployeeSerialization {

    private static final String FILE_NAME = "employee.ser";

    public static boolean saveEmployee(Employee emp) {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(emp);
            oos.close();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Employee loadEmployee() {

        Employee emp = null;

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            emp = (Employee) ois.readObject();

            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return emp;
    }
}