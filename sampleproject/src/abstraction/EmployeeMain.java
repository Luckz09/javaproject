package abstraction;

public class EmployeeMain {

	public static void main(String[] args) {
		
		PartTimeEmployee obj=new PartTimeEmployee();
		obj.partTimeSalary(3600,23);
		Employee em=new PartTimeEmployee();
		em.personDetails("Ammu",5);
	
		
		FullTimeEmployee obj2=new FullTimeEmployee();
		obj2.fullTimeSalary(3000);
		
		System.out.println(obj2.monthlySalary);
		System.out.println(obj.calculateSalary());
		
	}

}
