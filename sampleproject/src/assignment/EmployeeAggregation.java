package assignment;

public class EmployeeAggregation {
	
	String employeeName;
	String salary;
	CompanyAggregation companyDetails;

	public static void main(String[] args) {
		
		CompanyAggregation obj=new CompanyAggregation("TCS","Ekm"); 
		EmployeeAggregation obj1=new EmployeeAggregation("Lakshmi","20,000",obj);
		obj1.display();
	}
	
	EmployeeAggregation(String Name,String sal,CompanyAggregation Detail)
	{
		employeeName=Name;
		salary=sal;
		companyDetails=Detail;
	}
	
	public void display()
	{
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Salary : "+salary);
		System.out.println("Company : "+companyDetails.companyName);
		System.out.println("Location : "+companyDetails.companyLocation);
	}
	

}
