/* (Date Class) Create a class called Date that includes 
three instance variables—
a month (type int), 
a day (type int) and 
a year (type int). 
Provide a constructor that initializes the three instance variables 
and assumes that the values provided are correct. 
Provide a set and a get method for each instance variable. 
Provide a method displayDate that displays the month, day and year separated
by forward slashes (/).*/
package Chapter03;

public class Date0314 {
	
	private int month, day, year; // instance variables
	
	public Date0314(int m, int d, int y) { //object constructor Date0314
		
		month = m;
		day = d;
		year = y;	
		
	} // close object constructor Date0314
        
	//method that set month
 	  public void setMonth(int m) {
 		 month = m; 
	  } 
 	  //method that return month
	  public double getMonth() {
	   	     return month; 
	  }
	
	    public void setDay(int d) {
		day = d;
		}
		public int getDay() {
		return day;
		}
		
		public void setYear(int y) {
			year = y;
		}	
		public int getYear() {
			return year;
		}
		
		public void displayDate() {
			System.out.println(month + "/" + day + "/" + year);
			
		//System.out.printf("%d/%d/%d", getMonth(), getDay(), getYear()); //whyyy is not working?
			
		} //close displayDate()
} //close class Date0314
