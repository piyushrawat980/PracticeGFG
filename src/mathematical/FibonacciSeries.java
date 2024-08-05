package mathematical;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int first=0;
		int second=1;
		int N= 20;
		
		int temp=0;
		
		for(int i=0; i<N; i++)
		{
			System.out.println(first+ " ");
			
			temp = first + second;
			first = second;
			second = temp;
		}	
	}
}
