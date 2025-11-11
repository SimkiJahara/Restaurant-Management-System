
package menu;

/**
 *
 * @author ummej
 */
import invalidpriceexception.InvalidPriceException;

public class Dessert extends ITEMS {
	 public Dessert(String itemName, double price) throws InvalidPriceException {
	     super(itemName, price);
	 }
         @Override
	 public void display() {
	        System.out.println("Dessert: " + getItemName() + " - " + getPrice() + "TK");
	    }
	}
