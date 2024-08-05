package stringManipulation;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		StringPalindrome s1 = new StringPalindrome();
		s1.myPalindrome();
	}
	
	public void myPalindrome()
	{
		String str = "radarz";
		
		int len = str.length();
		
		for(int i=0; i<len/2; i++)
		{
			if(str.charAt(i)!= str.charAt(len-1-i))
			{
				System.out.println("Not a Palnidrome !");
				return;
			}
		}
		
		System.out.println(" It is a palindrome !");
		
	}
}
