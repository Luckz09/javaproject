package assignment;

public class Onseason extends OffSeasonP {

	public static void main(String[] args) {
		Onseason obj=new Onseason();
		obj.discount(2500,"on");
		
	}
	
	
	public void discount(int amount,String season)
	{
		if(season.equalsIgnoreCase("off"))
		{
		super.discount(amount);
		
		}
		else
		{
		double discount=amount * 0.40;
		System.out.println("Your purchased amount : "+amount);
		System.out.println("Off season discount : "+discount);
		System.out.println("Amount to be paid : "+(amount-discount));
		}
	}


}
