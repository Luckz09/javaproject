package interfaceExample;

public class CustomerAtm implements Atm{
	
	double balance=5000;

	public static void main(String[] args) {
		
		CustomerAtm obj=new CustomerAtm();
		obj.withdraw(1000);
		obj.checkBalance();
	
	}
	
	public void withdraw(double amt)
	{
		if(amt<=balance)
		{
			balance=balance-amt;
			System.out.println("Withdraw Amount : "+amt);
		}
		else
		{
			System.out.println("insufficient amount");
		}
	}
	public void checkBalance()
	{
		
		System.out.println("Balance amount is : "+balance);
		
	}

}
