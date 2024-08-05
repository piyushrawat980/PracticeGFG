package interviewPrep;

public class StringEquals {

	public static void main(String[] args) 
	{
		StringEquals m1 = new StringEquals();
		m1.mySolution();

	}

	public void mySolution()
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1==s3);
	}
	
}