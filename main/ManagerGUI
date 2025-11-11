package main;

/**
 *
 * @author ummej
 */
import employee.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerGUI extends JFrame {
    private JButton addEmployeeButton;
    private JButton removeEmployeeButton;
    private JButton viewEmployeesButton;
    private JButton updateEmployeeButton;
    private JButton viewTotalSalaryButton;
    private JButton logoutButton;

    public ManagerGUI() {
        // Set up the frame
        setTitle("Manager Functions");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));
        panel.setBackground(new Color(255, 255, 237));

        addEmployeeButton = new JButton("Add Employee");
        removeEmployeeButton = new JButton("Remove Employee");
        viewEmployeesButton = new JButton("View Employees");
        updateEmployeeButton = new JButton("Update Employee");
        viewTotalSalaryButton = new JButton("View Total Salary Expense");
        logoutButton = new JButton("Logout");

        panel.add(addEmployeeButton);
        panel.add(removeEmployeeButton);
        panel.add(viewEmployeesButton);
        panel.add(updateEmployeeButton);
        panel.add(viewTotalSalaryButton);
        panel.add(logoutButton);

        add(panel);

        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String employeeId = JOptionPane.showInputDialog("Enter Employee ID:");
              String name = JOptionPane.showInputDialog("Enter Employee Name:");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Employee Salary:"));
        SalaryManagementSystem salaryManagementSystem = new SalaryManagementSystem();
        salaryManagementSystem.addEmployee(employeeId, name, salary);
        JOptionPane.showMessageDialog(null, "Employee added successfully.");
    
            }
        });

        removeEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String employeeIdToRemove = JOptionPane.showInputDialog("Enter Employee ID to remove:");
                SalaryManagementSystem salaryManagementSystem = new SalaryManagementSystem();
                salaryManagementSystem.removeEmployee(employeeIdToRemove);
                JOptionPane.showMessageDialog(null, "Employee removed successfully.");
    }
            
        });

        viewEmployeesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SalaryManagementSystem salaryManagementSystem = new SalaryManagementSystem();
                salaryManagementSystem.displayEmployees();
            }
        });

        updateEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String employeeIdToUpdate = JOptionPane.showInputDialog("Enter Employee ID to update:");
               String newName = JOptionPane.showInputDialog("Enter new name:");
               double newSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter new salary:"));
                SalaryManagementSystem salaryManagementSystem = new SalaryManagementSystem();
                salaryManagementSystem.updateEmployee(employeeIdToUpdate, newName, newSalary);
                JOptionPane.showMessageDialog(null, "Employee information updated successfully.");
    
            }
        });

        viewTotalSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SalaryManagementSystem salaryManagementSystem = new SalaryManagementSystem();
        salaryManagementSystem.viewTotalSalaryExpense();
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ManagerGUI managerGUI = new ManagerGUI();
                managerGUI.setVisible(true);
            }
        });
    }
}
