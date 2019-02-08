/*(Employee Class) Create a class called Employee that includes 
three instance variables—
a first name (type String), 
a last name (type String) and a 
monthly salary (double). 
Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. 
If the monthly salary is not positive, do not set its value. */
package Chapter03;

public class Employee0313 {
		
	private String first, last; // instance variable 
	private double msalary;// instance variable 
	
	//constructor that initializes the three instance variables
	public Employee0313(String first, String last, double msalary) {
		this.first = first;
		this.last = last;
		
		if (msalary < 0.0)
			this.msalary = 0.0;
		else
			this.msalary = msalary;
	} //close constructor
		  // method that set first name
		  public void setFirst(String first) {
	   	        this.first = first; 
	   	  } 
	   	  // method that return first name 
	   	  public String getFirst() {
	   	        return first; 
	   	  }
	   	  //method that set last name
	   	  public void setLast(String last) {
		   	    this.last = last; 
		  } 
	   	  //method that return last name
		  public String getLast() {
		   	     return last; 
		  }
		  //method that set monthly salary
	   	  public void setMsalary(double msalary) {
		   	    this.msalary = msalary; 
		  } 
	   	  //method that return monthly salary
		  public double getMsalary() {
		   	     return msalary; 
		  }
				  
} // close class Employee0313
