package string;

public class StringClass {

	public static void main(String[] args) {
	String s="java programming";
	//length()
	System.out.println("Length :"+s.length());
	//charAt()
	System.out.println("Character index : "+s.charAt(0));
	//valueOf()
	int n=234;
	String numString=String.valueOf(n);
	System.out.println("value of number "+numString);
	//equals
	String s1="Java programming";
	System.out.println("Is it equal: "+s1.equals(s));
	
	//System.out.println("Is it equals :"+s1.equalsIgnoreCase);
	
	//isempty
	String s2=" "; //space calculate
	System.out.println("Is empty "+s2.isEmpty());
	
	//concatenate
	System.out.println("Concatenate "+s.concat(numString));
	//touppsercase
	
	System.out.println("Upper case "+s.toUpperCase());
	//tolowercase
	
	System.out.println("Lower case "+s1.toLowerCase());
	//contains
	
	System.out.println("Contains "+s.contains("hello"));
	System.out.println("Contains "+s.contains(s2));
   //replace
	
	System.out.println(s1.replace('J', 'j'));
	}

}
