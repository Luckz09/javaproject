package string;
 
public class Palindrome {

	String reversed="";
	public static void main(String[] args)
	{
		Palindrome obj =new Palindrome();
		obj.checkPalindrome("malayalam");
		obj.checkPalindrome("java");
	}
	
	public void checkPalindrome(String word)
	{
		for(int i=word.length()-1;i>=0;i--)
		{
			reversed=reversed+word.charAt(i);
		}
		if(word.equals(reversed))
		{
			System.out.println(word+" is palindrome");
			
		}
		else
		{
			System.out.println(word+" is not a Palindrome");
		}
	}
}
		

