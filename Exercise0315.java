/*(Removing Duplicated Code in Method main) 
In the AccountTest class of Fig. 3.9, method main contains six statements 
(lines 13–14, 15–16, 28–29, 30–31, 40–41 and 42–43) 
that each display an Account object’s name and balance. 
Study these statements and you’ll notice that 
they differ only in the Account object being manipulated—account1 or account2. 
!!! In this exercise, you’ll define a new displayAccount method 
that contains one copy of that output statement. 
The method’s parameter will be an Account object and the method 
will output the object’s name and balance. 
You’ll then replace the six duplicated statements in main 
with calls to displayAccount, 
passing as an argument the specific Account object to output.
Modify class AccountTest class of Fig. 3.9 to declare the following 
displayAccount method after the closing right brace of main and 
before the closing right brace of class AccountTest:
public static void displayAccount(Account accountToDisplay)
{
 // place the statement that displays
 // accountToDisplay's name and balance here
}
Replace the comment in the method’s body with a statement 
that displays accountToDisplay’s name and balance.
Recall that main is a static method, so it can be called 
without first creating an object of the class in which main is declared. 
We also declared method displayAccount as a static method.
When main needs to call another method in the same class without 
first creating an object of that class, 
the other method also must be declared static.
Once you’ve completed displayAccount’s declaration, 
modify main to replace the statements that display each Account’s name 
and balance with calls to displayAccount—each receiving as its
argument the account1 or account2 object, as appropriate. 
Then, test the updated AccountTest class to ensure that 
it produces the same output as shown in Fig. 3.9.*/
package Chapter03;

import java.util.Scanner;
    
    public class Exercise0315 { // public class AccountTest
	
	   public static void main(String[] args) {
		  	   
		  String account1 = "Jane Green";
	      String account2 = "John Blue";
	      double balance1 = 50.00;
	      double balance2 = -7.53;
	     		 
	 //    accountToDisplay();
	      
	      // display initial balance of each object
	      if (balance1 < 0.0) 
		      balance1 = 0.0;
	      System.out.println(account1 + " balance: $" + balance1);
	     
	      // display initial balance of each object
	      if (balance2 < 0.0)
	         balance2 = 0.0;
	       System.out.println(account2 + " balance: $" + balance2);
	      
	      // create a Scanner to obtain input from the command window
	      Scanner input = new Scanner(System.in);

	      System.out.print("\nEnter deposit amount for account1: "); // prompt
	      double balance11 = input.nextDouble(); // obtain user input
	      System.out.printf("%nadding $%.2f to account1 balance%n%n", balance11);
	      balance1 += balance11; // add to account1's balance
	   
	 //  accountToDisplay();  
	      
	   // display new balance of account1
	      if (balance1 < 0.0) 
		      balance1 = 0.0;
	      System.out.println(account1 + " balance: $" + balance1);
	      
	      if (balance2 < 0.0) 
		      balance2 = 0.0;
	      System.out.println(account2 + " balance: $" + balance2);
	    	      
	      System.out.print("\nEnter deposit amount for account2: "); // prompt
	      double balance22 = input.nextDouble(); // obtain user input
	      System.out.printf("%nadding $%.2f to account2 balance%n%n", balance22);
	      balance2 += balance22; // add to account2's balance
  	      
	  //  accountToDisplay(); 
	      
	      // display new balance of account2
	      if (balance1 < 0.0) 
		      balance1 = 0.0;
	      System.out.println(account1 + " balance: $" + balance1);
	      
	      if (balance2 < 0.0) 
		      balance2 = 0.0;
	      System.out.println(account2 + " balance: $" + balance2);
	   
	      input.close();
	   
	   } // end main
	   
//      public static void displayAccount(Account accountToDisplay) {
//		 
//	     Account account1 = new Account("Jane Green", 50.00);
//	     Account account2 = new Account("John Blue", -7.53);    
//	         
//	          if (balance1 < 0.0) 
//			      balance1 = 0.0;
//		      System.out.println(account1 + " balance: $" + balance1);
//		      
//		      if (balance2 < 0.0) 
//			      balance2 = 0.0;
//		      System.out.println(account2 + " balance: $" + balance2);    
//	   }
	   
   } // end class Exercise0315 / AccountTest

