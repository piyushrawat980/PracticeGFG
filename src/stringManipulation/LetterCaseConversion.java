package stringManipulation;

public class LetterCaseConversion {

	public static void main(String[] args) 
	{
		String str = "My Name is Piyush RawaT";
		
		int length = str.length();
		String x = "";
		char[] arr = str.toCharArray();
		for(char ch: arr)
		{
			if(Character.isUpperCase(ch))
			{
				x += Character.toLowerCase(ch);
			}
			
			else if(Character.isLowerCase(ch))
			{
				x += Character.toUpperCase(ch);
			}
			
			else if(ch==' ')
			{
				x += ' ';
			}
			
		}
		
		System.out.println("New String:: "+ x);
		
	}

}
