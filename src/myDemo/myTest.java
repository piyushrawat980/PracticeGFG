package myDemo;

public class myTest {

	public static void main(String[] args) 
	{
		String str="Pr!ogr#am%m*in&g Lan?#guag(e";
		String result= "";

		result = str.replaceAll("[^\\w\\s]","");

		System.out.println(result);
	}
}
 