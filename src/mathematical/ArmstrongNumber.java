package mathematical;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		ArmstrongNumber A1 = new ArmstrongNumber();
		A1.CalcArmstrong(371);		
	}
	
	
	public void CalcArmstrong(int Num)
	{
		int OriginalNum = Num;
		int sum=0;
		while(Num!=0)
		{
		int n= Num%10;	// n= 7
		Num= Num/10;
		sum= sum+ (n*n*n);
		
		}
		
		if(sum == OriginalNum)
		{
			System.out.println(" It is an Armstrong number !");
		}
		
		else
			System.out.println(" It is NOT an Armstrong number !");

	}
}