package abstraction;

public class BankMain {

	public static void main(String[] args) {
		Bank obj=new Sbi();
		BankMain obj1=new BankMain();
		obj1.display();
		System.out.println(obj.getInterestRate());
		
		
	}
	public void display()
	{
		System.out.println("Sbi bank interest details");
	}


}
