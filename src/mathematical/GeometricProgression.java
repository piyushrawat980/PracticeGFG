	package mathematical;

public class GeometricProgression {

	public static void main(String[] args) 
	{
		GeometricProgression g1= new GeometricProgression();
		g1.mySeries(2, 2, 4);
	}
	
	public void mySeries(int a, int r, int n)
	{
		int m = n-1;
		int An=0;
		An= (a * (int)Math.pow(r, m));
		
		System.out.println("Nth number is: "+ An);
	}
}
