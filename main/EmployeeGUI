package main;

/**
 *
 * @author ummej
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import employee.*;
public class EmployeeGUI extends JFrame {
    private JButton viewProfileButton;
    private JButton updateProfileButton;
    private JButton viewSalaryButton;
    private JButton logoutButton;

    private String employeeId;
        public EmployeeGUI(String employeeId) {
        this.employeeId = employeeId;
        
        setTitle("Employee Functions");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.setBackground(new Color(255, 255, 237));

        viewProfileButton = new JButton("View Profile");
        updateProfileButton = new JButton("Update Profile");
        viewSalaryButton = new JButton("View Salary");
        logoutButton = new JButton("Logout");

        panel.add(viewProfileButton);
        panel.add(updateProfileButton);
        panel.add(viewSalaryButton);
        panel.add(logoutButton);

        add(panel);
     viewProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Employee employee = getEmployee(employeeId);
                if (employee != null) {
                    JOptionPane.showMessageDialog(null, employee.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Employee not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        updateProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newName = JOptionPane.showInputDialog("Enter new name:");
        if (newName != null && !newName.isEmpty()) {
            Employee employee = getEmployee(employeeId);
            if (employee != null) {
                employee.setName(newName);
                
                SalaryManagementSystem salaryManagementSystem = new SalaryManagementSystem();
                salaryManagementSystem.updateEmployee(employeeId, newName, employee.getSalary());
                JOptionPane.showMessageDialog(null, "Name updated successfully to: " + newName);
            } else {
                JOptionPane.showMessageDialog(null, "Employee not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
              
            }
        });

        viewSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to view employee salary
                Employee employee = getEmployee(employeeId);
                if (employee != null) {
                    JOptionPane.showMessageDialog(null, "Salary: " + employee.getSalary());
                } else {
                    JOptionPane.showMessageDialog(null, "Employee not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private Employee getEmployee(String employeeId) {
        SalaryManagementSystem salaryManagementSystem = new SalaryManagementSystem();
        return salaryManagementSystem.getEmployee(employeeId);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                String employeeId = "emp1"; // Provide the employee ID for the logged-in employee
                EmployeeGUI employeeGUI = new EmployeeGUI(employeeId);
                employeeGUI.setVisible(true);
            }
        });
    }
}
