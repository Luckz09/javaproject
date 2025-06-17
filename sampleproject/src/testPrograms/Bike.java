package testPrograms;

public class Bike extends Vehicle {

	public static void main(String[] args) {
	
		Bike obj=new Bike();
		Car obj2=new Car();
		Vehicle obj1=new Vehicle();
		obj.display(obj1);
		obj.display(obj);
		obj.display(obj2);
		

	}
	
	public void start()
	{
		System.out.println("Bike Class");
	}
	
	public void display(Vehicle v)
	{
		v.start();
	}

}
