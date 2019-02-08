/*(Invoice Class) Create a class called Invoice that a hardware store 
might use to represent an invoice for an item sold at the store. 
An Invoice should include four pieces of information as 
instance variables—a part number (type String), 
a part description (type String), 
a quantity of the item being purchased (type int) and 
a price per item (double). 
Your class should have a constructor that initializes the four instance variables. 
Provide a set and a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that 
calculates the invoice amount (i.e.,multiplies the quantity by the price per item), 
then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. 
If the price per item is not positive, it should be set to 0.0. */
package Chapter03;

public class Invoice0312 {
	
	private String part, description; // instance variable 
	private int quantity; // instance variable
	private double price, amount; // instance variable 

	   // Account constructor that receives four parameters  
	   public Invoice0312(String part, String description, int quantity, double price) {
		     this.part = part; // assign part number to instance variable name
		     this.description = description; // assign description to instance variable name
		     
		   	 if (quantity < 0) //If the quantity is not positive
		 	 this.quantity = 0; // quantity value = 0
			 else 
		     this.quantity = quantity; // assign part number to instance variable name
		   	 
		   	 if (price < 0.0) //If the price per item is not positive
             this.price = 0.0; //price value = 0.0
		   	 else 
		   	 this.price = price; // assign part number to instance variable name
	   } //close constructor
	   	   // method that sets the part number
	   	   public void setPart(String part) {
	   	      this.part = part; 
	   	   } 

	   	   // method that returns the part number
	   	   public String getPart() {
	   	      return part; 
	   	   }
	   	   // method that sets the description
	   	   public void setDescription(String description) {
	   	      this.description = description; 
	   	   } 

	   	   // method that returns description
	   	   public String getDescription() {
	   	      return description; 
	   	   }
	   	   //method that sets the quantity
	   	   public void setQuantity(int quantity) {
	   	   this.quantity = quantity;
	   	   }
	   	   // method returns quantity
	   	   public int getQuantity() {
	   	      return quantity;
	   	   }
	   	   //method that sets price
	   	   public void setPrice(double price) {
           this.price = price;
	   	   }
	   	   // method returns price
	   	   public double getPrice() {
	   	      return price;
	   	   }
	   	   
	   	    public double getInvoiceAmount() {
	   		amount = (quantity * price);
	   		return amount;
	   	} //close object Invoice0312
} //close class Invoice0312


