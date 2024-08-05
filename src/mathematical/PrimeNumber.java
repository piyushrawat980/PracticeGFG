package mathematical;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int n= 37;
		
		for(int i = 2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a Prime Number !");
				return;
			}
			
			else 
			{
				System.out.println("Is a Prime Number !");
				return;
			}
		}
	}

}
