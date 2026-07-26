package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import model.Employee;

public class EmployeeSerialization {

    public static boolean saveEmployee(Employee employee) {

        try {

            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(employee);

            oos.close();
            fos.close();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}