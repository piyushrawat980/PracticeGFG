package mathematical;

public class ArithmeticProgression 
{
	public static void main(String[] args)
	{
		ArithmeticProgression S1= new ArithmeticProgression();
		S1.mySeries(2, 3, 4);
	}
	
	public void mySeries(int a1, int a2, int N)
	{
		int d = a2-a1;
		int An= (a1+(N-1)*d);
		
		System.out.println("A1 is : "+ a1);
		System.out.println("A2 is : "+ a2);
		System.out.println("Nth element is : "+ An);
	}
}