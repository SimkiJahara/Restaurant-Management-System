package menu;

/**
 *
 * @author ummej
 */
import java.util.ArrayList;
import invalidpriceexception.InvalidPriceException;
public class Menuu {
    private ArrayList<ITEMS> ITEMSs;

    public Menuu() throws InvalidPriceException {
        ITEMSs = new ArrayList<>();
        // Add menu items
        ITEMSs.add(new Appetizer("Fish finger", 300));
        ITEMSs.add(new Appetizer("Chicken Lolipop", 250));
        ITEMSs.add(new Appetizer("Dosa", 150));
        ITEMSs.add(new MainCourse("Biriyani", 290));
        ITEMSs.add(new MainCourse("Steak and mashed potato", 999));
        ITEMSs.add(new MainCourse("Bhuna khichuri", 250));
        ITEMSs.add(new Dessert("Jilapi", 180));
        ITEMSs.add(new Dessert("Ice cream", 200));
        ITEMSs.add(new Dessert("Golap Jamun", 300)); // New item added
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < ITEMSs.size(); i++) {
            System.out.println((i + 1) + ". " + ITEMSs.get(i).getItemName());
        }
    }

   public ITEMS getItem(int index) {
        return ITEMSs.get(index);
    }
   

	public int getItemCount() {
		
		return ITEMSs.size();
	}

    public String[] getMenuItems() {
        String[] menuItems = new String[ITEMSs.size()];
        for (int i = 0; i < ITEMSs.size(); i++) {
            menuItems[i] = ITEMSs.get(i).getItemName();
        }
        return menuItems;
    }

}
