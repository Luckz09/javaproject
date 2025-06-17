package abstraction;

public class FullTimeEmployee extends Employee{
	
	double monthlySalary;
	
	public void fullTimeSalary(double monthlySalary)
	{
		this.monthlySalary=monthlySalary;
	}
	public double calculateSalary()
	{
		return monthlySalary;
	}

}
