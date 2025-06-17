package aggregationexamples;

public class BookMain {
	
	BookMain(Book obj,Book obj1)
	{
		Book arr[]= {obj,obj1};
		/*for(Book b:arr)        //foreach loop
		{
			System.out.print(b.title+"-->");
			System.out.print(b.author);
			System.out.println("\n");
		}*/
		for(int i=0;i<arr.length;i++)    // for loop
		{
			System.out.print(arr[i].title+"-->");
			System.out.print(arr[i].author);
			System.out.println("\n");
		}
	}
		public static void main(String[] args) {
			
			Book obj=new Book("Paulo Coelho","Alcamist");
			Book obj1=new Book("Paulo","Brida");
			obj.display();
			BookMain obj2=new BookMain(obj,obj1);
			

		


	}

}
