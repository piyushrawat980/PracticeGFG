package mathematical;

public class PrintTable {

	public static void main(String[] args) 
	{
		PrintTable p1= new PrintTable();
		p1.myTable(9);
	}
	
	public void myTable(int N)
	{
		int product=1;
		for(int i=1; i<=10;i++)
		{
			product=N*i;
			System.out.println("9 * " + i + "s are " + product);
			
		}
		
	}

}
