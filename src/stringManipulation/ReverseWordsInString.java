package stringManipulation;

public class ReverseWordsInString 
{
	public static void main(String[] args) 
	{
	String str = "We are going to manali";
	
	String rev="";
	String[] s = str.split(" ");
	int length= s.length;
	
	for(int i = length-1; i>=0; i--)
	{
		rev= rev+ s[i]+ " ";
	}
		System.out.println(rev);
		
	}
}
