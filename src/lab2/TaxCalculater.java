package lab2;

public class TaxCalculater {

	public static void main(String[] args) {
		// 6.
		int randomSalary = (int) (Math.random() * 150001);

		System.out.println("Salary before tax: " + randomSalary);
		double taxRate;

		if (randomSalary >= 0 && randomSalary < 23000)
			taxRate = 0.1;
		else if (randomSalary >= 23000 && randomSalary < 50000)
			taxRate = 0.2;
		else if (randomSalary >= 50000 && randomSalary < 100000)
			taxRate = 0.3;
		else
			taxRate = 0.4;

		System.out.println("The tax rate is: " + (taxRate * 100) + "%");

		System.out.println("Salary after taxes: " + (randomSalary - (randomSalary * taxRate)));
	}

}
