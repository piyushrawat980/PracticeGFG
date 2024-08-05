package mathematical;

public class ClosestNumber 
{

	public static void main(String[] args) 
	{
		ClosestNumber Cn1 = new ClosestNumber();
		Cn1.findClosestDivisible(53, 8);
	}

		public void findClosestDivisible(int N, int M) 
	{
			int quotient= N/M; //4
			int LowerDivisible= M*quotient;		//32
			int UpperDivisible= M*(quotient+1);	//40
			
			if((N-LowerDivisible)<(UpperDivisible-N))
				// 5<3 ;; if N=37, M=8
				// 1<7 ;; if N=33, M=8
			{
				System.out.println("Closest number to " +N + " is " + LowerDivisible);
			}
			else
				if(((UpperDivisible-N))<(N-LowerDivisible))
				// 3< 5			
			{
				System.out.println("Closest number to " + N +" is " + UpperDivisible);
			}			
	}
		
}