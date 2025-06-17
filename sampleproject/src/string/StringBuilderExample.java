package string;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder build=new StringBuilder("Hello");
		
		//append
		build.append(" World");
		System.out.println(build);
		
		//insert
		
		build.insert(0, "haii ");
		System.out.println(build);
		
		//replace
		
		build.replace(0, 4, "Hello");
		System.out.println(build);
		
		//delete
		build.delete(0, 6);
		System.out.println(build);
		//reverse
		build.reverse();
		System.out.println(build);
		//charcterAt
		//char c=build.charAt(2);
		System.out.println(build.charAt(2));
		
		//length
		System.out.println(build.length());
		//substring
		
	//build.substring(3);
	System.out.println(build.substring(3));
	
	
	System.out.println(build.substring(0, 4));
		
		
		
		

		
	}

}
