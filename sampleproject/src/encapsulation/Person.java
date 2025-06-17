package encapsulation;

public class Person {
	
	private String name;
	private int age;
	
	public void setter(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
	public void getter()
	{
		System.out.println("Name : "+name);
		if(age>0)
		{
			System.out.println(age+" years old");
		}
		else
		{
			System.out.println("pls enter a valid age");
		}
			
	}
	

}
