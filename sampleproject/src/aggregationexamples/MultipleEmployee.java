package aggregationexamples;

public class MultipleEmployee {
	
	int employeeId;
	String employeeName;
	Company details;
	
	MultipleEmployee(int Id,String name,Company details)
	{
		employeeId=Id;
		employeeName=name;
		this.details=details;
	}
	public void display()
	{
		System.out.println("Name :"+employeeName);
		System.out.println("ID : "+employeeId);
		System.out.println(details.companyName);
		System.out.println(details.companyLocation);
	}

	public static void main(String[] args) {
		
		Company obj=new Company("TCS","Ekm");
		MultipleEmployee em1=new MultipleEmployee(21,"Ammu",obj);
		MultipleEmployee em2=new MultipleEmployee(22,"Achu",obj);
		MultipleEmployee em3=new MultipleEmployee(23,"Malu",obj);
		
		em1.display();
		em2.display();
		em3.display();
	
	}

}
