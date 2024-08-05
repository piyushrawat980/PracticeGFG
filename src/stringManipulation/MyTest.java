package stringManipulation;

public class MyTest {

	public static void main(String[] args) 
	{

		String s= "Interview";
		String s1= new String ("Interview");
		String s2 = "Interview";

	System.out.println(s.equals(s1));
	System.out.println(s==s1);
	System.out.println(s==s2);
	
	System.out.println(" Breaking BAD !! ");
	
	
	String str = "Piyush";
	
	System.out.println(str.concat(" Rawat"));
	
	str = str.concat(" Rawat is great ! ");
	
	System.out.println(str);
	
	}

}
