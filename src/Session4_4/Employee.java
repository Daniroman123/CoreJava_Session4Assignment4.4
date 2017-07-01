package Session4_4;

import java.util.Scanner;

public class Employee extends Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner to take input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the designation of the Employee");
		String designation = scanner.nextLine();
		System.out.println("Please enter the basic salary of the " + designation);
		double salary = scanner.nextDouble();
		System.out.println("Enter the Employee Id ");
		int id = scanner.nextInt();

		// Initializing the object of the Company

		Company obj1 = new Company();
		obj1.setEmployee_designation(designation);
		obj1.setEmployee_id(id);
		System.out.println("The total salary of the employee with id " + obj1.getEmployee_id() + " is ");

		// calling the calclate_salary method of Company through object
		// reference

		obj1.calculate_totalSalary(salary, designation);
		scanner.close(); // good practice
	}

}
