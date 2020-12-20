//Jai Breisch 1410 Week 7 Main Method

//ShayneDarak contributed to this code by helping me use more efficient ways to declutter and reduce the amount of code


import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//We now call in the Employee class to read each employee from file and make it into a 
		//usable set of information by separating it into sets of data per each employee
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(2);
		Employee e3 = new Employee(3);
		Employee e4 = new Employee(4);
		Employee e5 = new Employee(5);
		Employee e6 = new Employee(6);
		Employee e7 = new Employee(7);
		Employee e8 = new Employee(8);
		Employee e9 = new Employee(9);
		Employee e10 = new Employee(10);
		Employee e11 = new Employee(11);
		Employee e12 = new Employee(12);
		
	//Now the main class calls in all of the work done by the employee class as well as the formatting
	//done by the printEmployee method, to finally compile all data from the CSV file, then print it nicely.
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();
		e4.printEmployee();
		e5.printEmployee();
		e6.printEmployee();
		e7.printEmployee();
		e8.printEmployee();
		e9.printEmployee();
		e10.printEmployee();
		e11.printEmployee();
		e12.printEmployee();


		

	}

}
