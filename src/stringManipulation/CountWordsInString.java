package stringManipulation;

public class CountWordsInString 
{
	public static void countWords(String str)
	{
		int n = str.length();
		int spaces=0;
		
		for(int i=0; i<n; i++)
		{
			if(str.charAt(i)==' ')
				spaces++;
		}
		
		spaces= spaces+1;
		System.out.println("Total number of words: "+ spaces);
		
	}
	
	public static void main(String[] args) 
	{

		CountWordsInString.countWords("My name is Raj Mohan");
		
	}

}
