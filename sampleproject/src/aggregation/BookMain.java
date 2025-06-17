package aggregation;

public class BookMain {
	
	Book details;
	
	BookMain(Book details)
	{
		System.out.print(details.author+"-->");

		System.out.println(details.bookName);
	}

	public static void main(String[] args) {
		Book obj=new Book("Alchemist","Paulo Coelho");
		
		BookMain obj1=new BookMain(obj);
	}

}
