package Session4_4;

public class Company {

	// Initializing class variables

	String company_name = "abc";
	String company_location = "Bangalore";

	private int employee_id;

	private String Employee_designation;

	// Getter and setter to access private data members

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	// public method to calculate the salary of the employee according to its
	// designation

	public void calculate_totalSalary(double basicSalary, String Employee_designation) {
		if (Employee_designation.equals("Manager") || Employee_designation.equals("manager")) {
			double total_salary = (basicSalary + (0.15 * basicSalary));
			System.out.println(total_salary);
		} else if (Employee_designation.equals("Trainee") || Employee_designation.equals("trainee")) {
			double total_salary = (basicSalary + (0.10 * basicSalary));
			System.out.println(total_salary);
		} else {
			System.out.println("designation does not match");
		}

	}

	public String getEmployee_designation() {
		return Employee_designation;
	}

	public void setEmployee_designation(String Employee_designation) {
		this.Employee_designation = Employee_designation;
	}

}
