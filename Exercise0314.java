/* (Date Class) Create a class called Date that includes 
three instance variables—
a month (type int), 
a day (type int) and 
a year (type int). 
Provide a constructor that initializes the three instance variables 
and assumes that the values provided are correct. 
Provide a set and a get method for each instance variable. 
Provide a method displayDate that displays the month, day and year separated
by forward slashes (/). 
Write a test app named DateTest that demonstrates class Date’s capabilities.*/

package Chapter03;

public class Exercise0314 { //DateTest

	public static void main(String[] args) {
		
 		Date0314 data = new Date0314(5, 6, 1989);
		
 		System.out.println("initial date"); 
 		data.displayDate(); //display initial date
 		
 		data.setMonth(2);	
		data.setDay(8);
		data.setYear(2019);
		
		System.out.println();
		System.out.println("new date");
		data.displayDate(); // display date change
	} //close main
}// close class

//// try set day, month, year from keyboard
//
//package Chapter03;
//
//import java.util.Scanner;
//
//    public class Exercise0314 { //DateTest
//
//      public static void main(String[] args) {
//		
//	   Date0314 data = new Date0314(0, 0, 0);
//       //create a Scanner to obtain input from the command window
//	   Scanner input = new Scanner(System.in);
//
//	    System.out.print("Enter month: ");
//		int m = input.nextInt();
//		if(m > 0 && m <=12)
//		data.setMonth(m);	
//		else System.out.println("incorrect month");
//		
//		
//		System.out.print("Enter day: ");
//		int d = input.nextInt();
//		if(d > 0 && d <=31)
//        data.setDay(d);
//    	else System.out.println("incorrect day");
//		
//		System.out.print("Enter year: ");
//		int y = input.nextInt();
//		if (y > 0)
//		data.setYear(y);
//		else System.out.println("incorrect year");
//		
//		input.close(); //close Scanner
//		
//		System.out.println();
//		data.displayDate();
//      } //close main
//  } //close class