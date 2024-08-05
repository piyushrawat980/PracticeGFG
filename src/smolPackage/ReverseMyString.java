package smolPackage;

public class ReverseMyString 
{
	public static void main(String[] args) 
	{
		String str = "piyush rawat";
		
		for(int i= str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
	}

}
