package stringManipulation;

import java.util.HashMap;

public class CountOccurrenceUsingHashmap 
{
	
	public static void main(String[] args) {
		
		String str = "java is the best";
		int count = 0;
		char ch;
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++)
		{
			ch= str.charAt(i);
			
			if(hm.containsKey(ch))
		//	Checking if the Character(ch) has appeared before
			{
				count = hm.get(ch);
		//	Finding the previous count of the Character ch
				
				count++;
		//	Incremened count's value
				
				hm.replace(ch, count);
		//	Replace count's value to the old one
			
			}
			else
		//	When HashMap hm does not contain the Key 'ch'		
			{
				hm.put(ch, 1);
		//	setting the count's value as 1 coz the Character ch 
		//	has not appeared before
				
			}
		}
		
	/*			To PRINT the HashMap		*/
		
	for(Character ch2: hm.keySet())
	//	For all charcter elements in the keyset of out HashMap	
	{
		System.out.println(ch2 +" - "+hm.get(ch2));
	//	Print 
	}
	
	}

}
