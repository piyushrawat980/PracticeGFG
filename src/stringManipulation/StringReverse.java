package stringManipulation;

public class StringReverse {

	/*
	 * private StringReverse() { int a=10; }
	 * 
	 * public void myMethod() {
	 * System.out.println(" Inside the Method -> myMethod() "); }
	 * 
	 * static { StringReverse sr1 = new StringReverse(); }
	 * 
	 * public static void main(String[] args) { String str =
	 * "Notorious Conor Mcgregor";
	 * 
	 * int length= str.length();
	 * 
	 * for(int i = length-1; i>=0; i--) { System.out.print(str.charAt(i)); }
	 * 
	 * }
	 */

	public static void main(String[] args) 
	{
		String str1 = "piyush";
		StringBuilder str2 = new StringBuilder("Aayush");
		
		StringBuilder str3 = str2.reverse();
		System.out.println(str3);
	}
}