package collections.Arrays;

public class SearchInStrings {

	public static void main(String[] args) 
	{
		String name = "piyush";
		char target = 'u';
		
		System.out.println(search(name, target));
	}

	private static int search2(String str, char target) 
	{
		if(str.length()==0)
			return -1;
		
		for(char ch: str.toCharArray())
		{
			if(ch == target)
			{
				return 1;
			}
		}
		return -1;
	}
	
	
	private static int search(String str, char target) 
	{
		if(str.length()==0)
			return -1;
		
		for(int i =0; i<str.length(); i++)
		{
			if(str.charAt(i) == target)
			{
				return i;
			}
		}
		return 1;
	}
	
	

}
