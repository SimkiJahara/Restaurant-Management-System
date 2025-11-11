package main;

/**
 *
 * @author ummej
 */
/*
*/
import menu.*;
import employee.*;
import invalidpriceexception.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Scanner;

public class Main extends JFrame{

	private ImageIcon icon, img;
	private JLabel imgL;
	private Container C;
	private JLabel user, pass;
	private Font font,font1;
	private JTextField TF1, TF2;
	private JButton B,B1,B2;

	Employee[] employees = {
			new Employee("emp1", "password1"),
			new Employee("emp2", "password2"),
			new Employee("emp3", "password3"),
			new Employee("emp4", "password4"),
			new Employee("emp5", "password5"),
			new Employee("manager", "managerpassword")
	};


	public Main() {

		initComponents();

	}

	public void initComponents() {
		C=this.getContentPane();
		C.setLayout(null);
		C.setBackground(Color.PINK);



		font=new Font("Times New Roman", Font.BOLD, 40);
		font1=new Font("Times New Roman", Font.BOLD, 20);

		user=new JLabel("Welcome to KASHUNDI");
		user.setBounds(170, 95, 427, 80);
		user.setForeground(Color.BLACK);
		user.setBackground(Color.yellow);
		user.setOpaque(true);
		user.setFont(font);
		C.add(user);

		B=new JButton("Customer");
		B.setFont(font1);
		B.setForeground(Color.pink);
		B.setBounds(252,250,250,70);
		C.add(B);

		B1=new JButton("Employee");
		B1.setFont(font1);
		B1.setForeground(Color.pink);
		B1.setBounds(252,330,250,70);
		C.add(B1);

		B2=new JButton("Manager");
		B2.setFont(font1);
		B2.setForeground(Color.pink);
		B2.setBounds(252,410,250,70);
		C.add(B2);

		img=new ImageIcon("cover.png");

		imgL=new JLabel(img);
		imgL.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		C.add(imgL);

		//scanner.close();

		B.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				CustomerGUI F1=new CustomerGUI();
				F1.setVisible(true);
				F1.setBounds(200, 100, 800, 600);
			}
		});
		B1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
						String empID = JOptionPane.showInputDialog("Enter ID:");
						String pass = JOptionPane.showInputDialog("Enter password:");
						if (authenticateEmployee(empID, pass)) {
							JOptionPane.showMessageDialog(null, "Employee login successful.");
						}
						else {

							JOptionPane.showMessageDialog(null, "Invalid employee credentials", "Error", JOptionPane.ERROR_MESSAGE);
						}
					
			}
		});
		B2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
						String empID = JOptionPane.showInputDialog("Enter ID:");
						String pass = JOptionPane.showInputDialog("Enter password:");
						if (authenticateManager(empID, pass)) {
							JOptionPane.showMessageDialog(null, "Manager login successful.");
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid manager credentials", "Error", JOptionPane.ERROR_MESSAGE);
						}
			}
		});
	}


	public boolean authenticateEmployee(String userId, String password) {
        String[] employeeIds = {"emp1", "emp2", "emp3", "emp4", "emp5"};
    String[] employeePasswords = {"password1", "password2", "password3", "password4", "password5"};

    
    for (int i = 0; i < employeeIds.length; i++) {
        if ((userId.equals(employeeIds[i]) || password.equals(employeePasswords[i]))) {
        	dispose();
            EmployeeGUI employeeGUI=new EmployeeGUI(userId);
            employeeGUI.setVisible(true);
            return true;
        }
    }


		return false;
	}




	private boolean authenticateManager(String userId, String password){
		String managerId = "manager";
		String managerPassword = "managerpassword";
		if (userId.equals(managerId) && password.equals(managerPassword)) {
			dispose();
			ManagerGUI managerGUI = new ManagerGUI();
			managerGUI.setVisible(true);
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) throws InvalidPriceException {
		Main F= new Main();

		F.setVisible(true);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setBounds(200, 100, 800, 600);
		F.setTitle("Frame");
		F.setResizable(false);

	}

}
