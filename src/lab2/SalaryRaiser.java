package lab2;

public class SalaryRaiser {
	public static void main(String[] args) {
		// 3.
		int salary = (int) (Math.random() * (6000 - 5000) + 5000);

		System.out.println("Current salary is: " + salary);

		int raisedSalary = (int) (salary * 0.1) + salary;
		
		if (raisedSalary >= 6000)
			raisedSalary = (int) (salary * 0.05) + salary;
			
		System.out.println("Updated salary is: " + raisedSalary);
	}
}
