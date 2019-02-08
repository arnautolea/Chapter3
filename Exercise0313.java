/*(Employee Class) Create a class called Employee that includes 
three instance variables—
a first name (type String), 
a last name (type String) and a 
monthly salary (double). 
Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. 
If the monthly salary is not positive, do not set its value. 
Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again. */
package Chapter03;

public class Exercise0313 { //EmployeeTest
//	String first, last; // instance variable Employee0313
//	double salary; // instance variable Employee0313
		
	public static void main(String[] args) {
	
	Employee0313 employee1 = new Employee0313("Vasea","Pupkin", 50.00); //create new object
	Employee0313 employee2 = new Employee0313("Olea","Nupkin", 60.00); //create new object
	
    // display Full name of each object and monthly salary
//    System.out.printf("Emplayee %s %s monthly salary: %.2f%n",
//    		employee1.getFirst(), employee1.getLast(), employee1.getMsalary()); 
//    System.out.printf("Emplayee %s %s monthly salary: %.2f%n%n",
//    		employee2.getFirst(), employee2.getLast(), employee2.getMsalary());	
    
    double ysalary1 = (employee1.getMsalary() * 12);
    double ysalary2 = (employee2.getMsalary() * 12);
    
    // display Full name of each object and yearly salary
    System.out.printf("Emplayee %s %s yearly salary: %.2f%n",
    		employee1.getFirst(), employee1.getLast(), ysalary1); 
    System.out.printf("Emplayee %s %s yearly salary: %.2f%n%n",
    		employee2.getFirst(), employee2.getLast(), ysalary2);
    
    double ysalary10 = (ysalary1 + (ysalary1 * 0.1));
    double ysalary20 = (ysalary2 + (ysalary2 * 0.1));
    
    // display Full name of each object and yearly salary with 10% raise
    System.out.printf("Emplayee %s %s yearly salary + 10%%: %.2f%n",
    		employee1.getFirst(), employee1.getLast(), ysalary10); 
    System.out.printf("Emplayee %s %s yearly salary + 10%%: %.2f",
    		employee2.getFirst(), employee2.getLast(), ysalary20);
 
	} //close main
} //cloae class Exercise0313
