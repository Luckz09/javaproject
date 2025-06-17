 package assignment;

public class SuperAdditionC extends SuperAddtionP{

	public static void main(String[] args) {
		
		SuperAdditionC obj=new SuperAdditionC();
		obj.result();
		}
	
	public void result()
	{
		int s=super.addition();
		if(s%10==0)
		{
			System.out.println(s+" is divisible by 10");
		}
		else
		{
			System.out.println(s+" is not divisible by 10");
		}
	}

}
