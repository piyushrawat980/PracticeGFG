package interviewPrep;

public class Interview {

	public static void main(String[] args) 
	{
		String str = "piyush";
		
		char arr[]= str.toCharArray();
		int len= str.length();
		
		for(int i = len-1; i>=0; i--)
			{
				System.out.print(arr[i]);		
			}
	    		
	}
}
