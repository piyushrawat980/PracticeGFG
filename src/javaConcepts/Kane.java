package javaConcepts;

public class Kane implements IWrestler
{
	public int number=0;
	
	@Override
	public void themeMusic() 
	{
		System.out.println("Kane's Intro music");		
	}

	@Override
	public void finisher() 
	{
		System.out.println("Kane's Finishng move");		
	}

	@Override
	public void paymentForWork(int hours) 
	{
		System.out.println("Kane will make $$ "+ hours*300 + " for his match");		
	}

}
