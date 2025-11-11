package menu;

/**
 *
 * @author ummej
 */
import invalidpriceexception.InvalidPriceException;
public class Appetizer extends ITEMS {
	 public Appetizer(String itemName, double price) throws InvalidPriceException{
	     super(itemName, price);
	 }
         @Override
	 public void display() {
		 System.out.println("Appetizer: " + getItemName() + " - " + getPrice() + "TK");
	 }
	}
