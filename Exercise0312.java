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
If the price per item is not positive, it should be set to 0.0. 
Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.*/
package Chapter03;
import java.util.Scanner;
public class Exercise0312 {  //InvoiceTest

	public static void main(String[] args) {
	
	Invoice0312 invoice = new Invoice0312(" ", " ", 0, 0.0); //create new object
	
	Scanner input = new Scanner (System.in);
	
//	String part, description; 
//	int quantity;
//	double price, amount; 
   
	System.out.print("Part name: "); //set part name
    String part = input.nextLine();
    invoice.setPart(part);
    
    System.out.print ("Enter Description: "); //set description
    String description = input.nextLine();
    invoice.setDescription(description);
    
    System.out.print ("Enter The Quantity: "); //set quantity
    int quantity = input.nextInt();
//    if (quantity > 0)
    invoice.setQuantity(quantity);
//    else quantity = 0;
//    
    System.out.print ("Enter The Price per item: "); //set price
    double price = input.nextDouble();
//    if (price > 0.0) 
    invoice.setPrice(price);
//    else price = 0.0;
    
	input.close(); //close Scanner
	System.out.println("------------------");
	System.out.printf("Part name is: %s%n", invoice.getPart());
	System.out.printf("Description is: %s%n", invoice.getDescription());
	System.out.printf("Quantity is: %s%n", invoice.getQuantity());
	System.out.printf("Price per item: %s%n", invoice.getPrice());
	System.out.printf("Invoice price for all items is: %.2f", invoice.getInvoiceAmount());
		
	} //close main
} //close class Exercise0312
