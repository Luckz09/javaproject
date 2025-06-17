package assignment;

public class OffSeasonP {
	
	public void discount(int amount)
	{
		double discount=amount * 0.15;
		System.out.println("Your purchased amount : "+amount);
		System.out.println("Off season discount : "+discount);
		System.out.println("Amount to be paid : "+(amount-discount));
	}

}
