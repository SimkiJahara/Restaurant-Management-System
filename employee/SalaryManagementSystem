package employee;

/**
 *
 * @author ummej
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SalaryManagementSystem {
    private static final String EMPLOYEE_FILE_PATH = "employees.txt";
    private ArrayList<Employee> employees;

    public SalaryManagementSystem() {
        loadEmployees();
    }

    public void loadEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(EMPLOYEE_FILE_PATH))) {
            employees = (ArrayList<Employee>) ois.readObject();
        } catch (FileNotFoundException e) {
            employees = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveEmployees() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(EMPLOYEE_FILE_PATH))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(String employeeId, String name, double salary) {
        Employee employee = new Employee(employeeId, name, salary);
        employees.add(employee);
        saveEmployees();
    }

    public void removeEmployee(String employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId().equals(employeeId));
        saveEmployees();
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public void updateEmployee(String employeeId, String newName, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                employee.setName(newName);
                employee.setSalary(newSalary);
                saveEmployees();
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }
    
    public void displayEmployee(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }
    
    public void incrementSalary(String employeeId, double incrementAmount) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary + incrementAmount);
                saveEmployees();
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }
    
    public void viewTotalSalaryExpense() {
        double totalSalaryExpense = 0;
        for (Employee employee : employees) {
            totalSalaryExpense += employee.getSalary();
        }
        System.out.println("Total Salary Expense: " + totalSalaryExpense);
    }
    public Employee getEmployee(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null; 
    }

    

}
