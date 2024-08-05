package smolPackage;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int []a1 = {34, 24, 18, 56, 84, 54, 22};
		
		int temp=0;
		
		for(int i =0; i<a1.length; i++)
		{
			for(int j = i+1; j<a1.length; j++)
			{
				if(a1[i]>a1[j])
				{
					temp = a1[j];
					a1[j]=a1[i];
					a1[i]=temp;
				}
				
			}
			
		}
		for(int i =0; i<a1.length;i++)
		{
			System.out.print(a1[i]+ " ");
		}
	}

}
