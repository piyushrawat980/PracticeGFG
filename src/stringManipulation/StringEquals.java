package stringManipulation;

public class StringEquals {

	public static void main(String[] args) 
	{
		
		String s1 = "major";
		String s2 = "major";
		String s3 = new String("major");
		
		// True
		System.out.println(s1==s2);
		
		// True
		System.out.println(s1.equals(s3));
		
		//False
		System.out.println(s1==s3);
		
	}

}
