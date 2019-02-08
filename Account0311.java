/*(Modified Account Class) Modify class Account (Fig. 3.8) to provide 
a method called withdraw that withdraws money from an Account. 
Ensure that the withdrawal amount does not exceed the Account’s balance.*/
package Chapter03;

public class Account0311 {
	
   private String name; // instance variable 
   private double balance; // instance variable 

   // Account constructor that receives two parameters  
   public Account0311(String name, double balance) {
	     this.name = name; // assign name to instance variable name
      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0
      if (balance > 0.0) // if the balance is valid
         this.balance = balance; // assign it to instance variable balance
   }

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount) {
	   
      if (depositAmount > 0.0) // if the depositAmount is valid
         balance = balance + depositAmount; // add it to the balance 
   }
   
   //method withdraws money from an Account
   public void withdraw(double withdrawAmount) {
// if withdrawAmount does not exceed the balance
	   if (withdrawAmount > balance)  
	      System.out.println("Withdrawal amount exceeded account balance.");
	   else balance -= withdrawAmount;
		   
   }
   
   // method returns the account balance
   public double getBalance() {
      return balance; 
   } 

   // method that sets the name
   public void setName(String name) {
      this.name = name; 
   } 

   // method that returns the name
   public String getName() {
      return name; 
   }
   
} // end class Account0311