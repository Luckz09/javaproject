package testPrograms;

public class Developer extends Employee {

	public static void main(String[] args) {

		Employee developer=new Developer();
		developer.getSalary();
		Employee manager=new Manager();
		manager.getSalary();
		

	}
	public void getSalary()
	{
		super.getSalary();
		System.out.println("Developer Class");
	}

}
