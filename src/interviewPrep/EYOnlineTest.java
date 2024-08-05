package interviewPrep;


public class EYOnlineTest {

	public static void main(String[] args)
	{
/*
 * 	String s1 = "EY";
	String s2 = new String("EY");
	
	
	System.out.println(s1==s2);		
	System.out.println(s1.equals(s2)); 	
	// My output
	// False
	// True
*/
		
/*		String s1 = "EY";
		String s2 = "EY";
		
		String s3 = new String ("EY");
		String s4 = new String ("EY");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
*/	
		
		int []x= new int[3];
		x[1]=50;
		Object obj = x;
		int[]y = (int[]) obj;
		y[1]=100;

		System.out.println(x[1]);
		((int[]) obj)[1]=500;
		
		System.out.println(x[1]);		
	}
}