package testPrograms;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat obj=new Cat();
		Dog obj1=new Dog();
		Animal obj2=new Animal();
		obj1.dogSound();
		
	Animal animal[]= {obj,obj1,obj2};
 for(Animal a:animal)
 {
	a.makeSound(); 
	 
 }
	}
	public void makeSound()
	{
		System.out.println("cat Class");
	}

}
