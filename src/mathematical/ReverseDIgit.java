package mathematical;

public class ReverseDIgit {

	public static void main(String[] args) 
	{
		myDigitReverse();
	}
	
	public static void myDigitReverse()
	{
		int num = 864;
		int sum = 0;
		int rem = 0;
		
	while(num!=0)
	{
		rem = num%10;			// rem = 6;		// rem = 5;				// rem = 4
		num = num/10;			// N = 45;		// N = 4;				// N= 0
		sum = (sum*10) + rem;	// sum = 6;		// sum = 6*10 + 5= 65	// sum 65*10 + 4=654
	}
	
	System.out.println("Reverse Number is : "+ sum);

 }
}