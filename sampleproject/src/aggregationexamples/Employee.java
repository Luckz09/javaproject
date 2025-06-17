package aggregationexamples;

public class Employee {
	
	int employeeId;
	String employeeName;
	Company details;
	
	public Employee(int id,String name,Company details)
	{
		employeeId=id;
		employeeName=name;
		this.details=details;
	}
	public void display()
	{
		System.out.println("Id :"+employeeId);
		System.out.println("Name :"+employeeName);
		System.out.println(details.companyName+" "+details.companyLocation);
	}

	public static void main(String[] args) {
		 Company obj=new Company("TCS","Ekm");
		 Employee obj1=new Employee(25,"Ammu",obj);
		 obj.display();
		 obj1.display();
		
	}

}
