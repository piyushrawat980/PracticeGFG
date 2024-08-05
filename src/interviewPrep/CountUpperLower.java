package interviewPrep;

public class CountUpperLower {

	public static void main(String[] args) 
	{		
		CountUpperLower CUL = new CountUpperLower();
		 CUL.CountUandL();
	}

	public void CountUandL()
	{
		String str = "my NamE is PiyUSH RawaT";
		int len= str.length();
		int upper =0;
		int lower =0;

		for(int i=0; i<len; i++)
		{
			char ch = str.charAt(i);
			
			if (ch>=65 && ch<=90)
			{
				upper++;
			}
			
			else
				lower++;
		}
		
		System.out.println("Number of UPPER characters is :: "+ upper);
		System.out.println("Number of LOWER characters is :: "+ lower);
	}
	
}
