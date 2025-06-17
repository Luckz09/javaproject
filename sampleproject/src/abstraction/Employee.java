package abstraction;

public abstract class Employee {

	  public void personDetails(String name,int id)
	  {
	  System.out.println(name);
	  System.out.println(id);
	  }
	 
	public void display()
	{
		System.out.println("Displaying");
	}
	public abstract double calculateSalary();

}
