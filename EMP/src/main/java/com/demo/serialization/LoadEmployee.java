package com.demo.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.model.Employee;

public class LoadEmployee {

    public static Employee loadEmployee() {

        Employee employee = null;

        try {

            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            employee = (Employee) ois.readObject();

            ois.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employee;
    }
}