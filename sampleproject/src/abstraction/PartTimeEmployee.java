package abstraction;

public class PartTimeEmployee extends Employee {
	
	double partTimeSalary;
	
	public void partTimeSalary(double hrs,int pay)
	{
		partTimeSalary=hrs*pay;
	}
	public double calculateSalary()
	{
		return partTimeSalary;
	}

}
