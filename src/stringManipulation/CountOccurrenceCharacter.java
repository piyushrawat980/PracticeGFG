package stringManipulation;

public class CountOccurrenceCharacter {

	
	public int count(String s, char c)
	{
		
		int op=0;
		for(int i =0; i<s.length(); i++)
		{
			if(s.charAt(i)==c)
			{
				op++;
			}
		}
		return op;		
	}
	
	public static void main(String[] args) 
	{
		String str = "my name is anthony gonzales";
		char ch = 'n';
		
		CountOccurrenceCharacter c1 = new CountOccurrenceCharacter();
		System.out.println("Occurrence of Character :: " + c1.count(str, ch));		
		
	}

}
