package mathematical;

public class KthDigit {

	public static void main(String[] args) 
	{
		kthDigit(81,3,5);
	}

	public static void kthDigit(int a, int b, int K)
	{
		int N = 0;
		int rem =0;
		int num = (int) Math.pow(a, b);
		// num = 5^3 = 
		
/*		for(int i = 1; i<=(K-1); i++)
		//	K=1
		{	
			int rem = num%10;
			N = num/10;
		}
*/		
		while((K-1)!=0)
		{
			rem = num%10;
			N = num/10;
			K--;
		}
		System.out.println("PRINTING K :: "+ rem);
	}	
}