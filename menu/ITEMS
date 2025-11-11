package menu;

/**
 *
 * @author ummej
 */
import invalidpriceexception.InvalidPriceException;

public abstract class ITEMS {
	 private String itemName;
	 private double price;

	 public ITEMS(String itemName, double price) throws InvalidPriceException{
	     if(price<=0) {
	    	 throw new InvalidPriceException("Price must be greater tjan zero.");
	     }
		 this.itemName = itemName;
	     this.price = price;
	 }

	 public String getItemName() {
	     return itemName;
	 }

	 public double getPrice() {
	     return price;
	 }
	 public abstract void display();
	 
	}
