package interviewPrep;

public class UpperAndLowerPrint 
{
	
	public static void main(String[] args) 
	{
		UpperAndLowerPrint UL1= new UpperAndLowerPrint();
		UL1.printUprLwr();
	}
 	
	public void printUprLwr()
	{
		String str = "my NamE is PiyUSH RawaT";
		int len= str.length();
		String upper ="";
		String lower ="";
		
		for(int i =0; i<len;i++)
		{	
			char ch=str.charAt(i);
		
		if(ch>=65 && ch<=90)
		{
			upper =upper+ch; 
			//upper+=ch;
		}
		
		else
			lower = lower+ch;
		
	}
		System.out.println("Upper characters ::"+ upper);
		System.out.println("LOWER characters ::"+ lower);		
	}

		
}
