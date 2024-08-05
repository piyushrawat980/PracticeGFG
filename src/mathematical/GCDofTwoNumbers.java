package mathematical;

public class GCDofTwoNumbers {
	
	public int myGCD(int a, int b)
	{
		int smallNum= Math.min(a, b);
		
	System.out.println("Smaller Number "+ smallNum);
	
	for(int i = smallNum; i>=2; i--)
	{
		if(a%i ==0 && b%i==0)
		{
			return i;
		}
	}
	return 1;		
}
	
	public static void main(String[] args) 
	{
		GCDofTwoNumbers g1 = new GCDofTwoNumbers();		
		int result = g1.myGCD(36, 60);		
		System.out.println("GCD is  :: "+ result);
	}
}
