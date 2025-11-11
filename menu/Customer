package menu;

/**
 *
 * @author ummej
 */
/*
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;

  public	class Customer {
    private String name;
    private ArrayList<ITEMS> order;
      
    public Customer(String name) {
        this.name = name;
        order = new ArrayList<>();
    }

       public String getName() {
           return name;
        }

        public void setName(String name) {
          this.name = name;
         }
         public void addToOrder(ITEMS item) {
        order.add(item);
    }

    double total = 0;
        public void printBill(){
try (PrintWriter writer = new PrintWriter(new FileWriter("bill.txt", true))) {
    writer.println("Customer Name: " + getName());

    for (ITEMS item : order) {
        writer.println(item.getItemName() + " - " + item.getPrice() + "TK");
        total += item.getPrice();
    }
    writer.println("Total: " + total + "TK");
    writer.println("-------------------------");
} catch (IOException e) {
    e.printStackTrace();
}
        }
        public String getOrderDetails() {
    StringBuilder orderDetails = new StringBuilder();
    double total = 0;
    for (ITEMS item : order) {
        orderDetails.append(item.getItemName()).append(" - ").append(item.getPrice()).append("TK\n");
        total += item.getPrice();
    }
    orderDetails.append("Total: ").append(total).append("TK\n");
    return orderDetails.toString();
}
}
