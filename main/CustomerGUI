package main;
import invalidpriceexception.*;
import menu.*;
import menu.ITEMS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import menu.*;

public class CustomerGUI extends JFrame {
	
	private ImageIcon icon, img;
	private JLabel imgL;
	private Container C;
	private JLabel List, M;
	private Font font2,font1,font;
	private JTextField TF1, TF2;
	private JButton B,B1;
	private JTextArea A;
	
 private String customerName;
   private Customer customer;

   public CustomerGUI() {
	   
	   
		initComponents();

	}

	public void initComponents() {
		C=this.getContentPane();
		C.setLayout(null);
		C.setBackground(Color.PINK);
		
		font=new Font("Times New Roman", Font.BOLD, 17);
		font1=new Font("Times New Roman", Font.BOLD, 20);
		font2=new Font("Times New Roman", Font.BOLD, 30);
		
		B=new JButton("Place Order");
		B.setFont(font1);
		B.setForeground(Color.pink);
		B.setBounds(190,490,200,50);
		C.add(B);
		
		B1=new JButton("Exit");
		B1.setFont(font1);
		B1.setForeground(Color.pink);
		B1.setBounds(400,490,200,50);
		C.add(B1);
		
		M=new JLabel("Menu");
		M.setBounds(360, 150, 200, 80);
		M.setFont(font2);
		C.add(M);
		
		A=new JTextArea("Item     --------------------------------------     Price"
				+ "\n--------------------------------------------------------"
				+ "\n1. Fish finger     ----------------------------        300"
				+ "\n2. Chicken Lolipop     ---------------------        250"
				+ "\n3. Dosa     -----------------------------------        150"
				+ "\n4. Biriyani     -------------------------------        290"
				+ "\n5. Steak and mashed potato     -----------       999"
				+ "\n6. Bhuna khichuri     -----------------------       250"
				+ "\n7. Jilapi     -----------------------------------       180"
				+ "\n8. Ice cream     -----------------------------       200"
				+ "\n9. Golap Jamun     -------------------------       300");
		A.setBounds(223,210,350,265);
		A.setBackground(Color.white);
		A.setFont(font);
		A.setEditable(false);
		C.add(A);

		img=new ImageIcon("cover.png");

		imgL=new JLabel(img);
		imgL.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		C.add(imgL);
	   
	     this.customerName = customerName;
               this.customer = new Customer(customerName);
         JPanel panel = new JPanel();
B.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Menuu menu = null;
               try {
                   menu = new Menuu(); 
               } catch (InvalidPriceException ex) {
                   Logger.getLogger(CustomerGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
               menu.displayMenu();

               while (true) {
                   String choiceString = JOptionPane.showInputDialog("Enter item number to order (0 to finish):");
                   try {
                       int choice = Integer.parseInt(choiceString);
                       if (choice >= 1 && choice <= menu.getItemCount()) {
                           ITEMS selectedItem = menu.getItem(choice - 1);
                           customer.addToOrder(selectedItem);
                           JOptionPane.showMessageDialog(null, selectedItem.getItemName() + " added to your order.");
                       } else if (choice == 0) {
                           break;
                       } else {
                           JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                       }
                   } catch (NumberFormatException ex) {
                       JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                   }
               }
               String customerName = JOptionPane.showInputDialog("Enter your name:");
               customer.setName(customerName);
               customer.printBill();
               JOptionPane.showMessageDialog(null, "Order placed successfully. Thank You.");
               dispose();
           }
       });

       B1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Thank you for visiting our restaurant. Goodbye!");
               System.exit(0);
           }
       });
   }

   public static void main(String[] args) {
	   CustomerGUI frame=new CustomerGUI();
	   
	   frame.setVisible(true);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setBounds(200, 100, 800, 600);
	   frame.setTitle("Frame");
	   frame.setResizable(false);
   }
}
