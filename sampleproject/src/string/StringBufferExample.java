 package string;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer buff=new StringBuffer("Hello");// string declare and initialize, creating a string buffer object
		
		//append to join 2 words
	buff.append(" World");
	System.out.println("Append : "+buff);
	//insert one word
	buff.insert(6, "hai ");
	System.out.println(buff);
	
	//replace one word
	buff.replace(6, 9, "super");
	System.out.println(buff);
	
	//delete one word
	buff.delete(0, 6);
	System.out.println(buff);
	//reverse
	
	buff.reverse();
	System.out.println("Reverse word :"+buff);
	
	System.out.println(buff.capacity());
	
	System.out.println(buff.length());
	}

}
