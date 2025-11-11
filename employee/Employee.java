package employee;

/**
 *
 * @author ummej
 */
import java.io.Serializable;

public class Employee implements Serializable{
	
    private static final long serialVersionUID=1L;
    private String userId;
    private String password;
    private String name;
    private double salary;

    public Employee(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
    
    public Employee(String employeeId, String name, double salary) {
        this.userId = employeeId;
        this.name = name;
        this.salary = salary;
    }
 public String getEmployeeId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void updateInfo(String newName, double newSalary) {
        this.name = newName;
        this.salary = newSalary;
    }
    @Override
    public String toString() {
        return "Employee ID: " + userId + ", Name: " + name + ", Salary: " + salary;
    }
     public boolean authenticate(String inputUserId, String inputPassword) {
        return userId.equals(inputUserId) && password.equals(inputPassword);    }
}
