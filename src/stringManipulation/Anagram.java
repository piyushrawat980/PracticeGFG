package stringManipulation;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		
		String str1 = "Listen";
		String str2 = "Silent";
		
		Anagram a1 = new Anagram();
		a1.checkAnagram(str1, str2);
		
	}
	
	public void checkAnagram(String str1, String str2)
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] a1 = str1.toCharArray();
		char[] a2 = str2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2))
		{
			System.out.println(" Strings are anagram of each other");
		}
		
		else
			System.out.println("Not an Anagram");
	}

}
