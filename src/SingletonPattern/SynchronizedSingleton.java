package SingletonPattern;

public class SynchronizedSingleton 
{
/*	private static SynchronizedSingleton uniqueInstance;
	
	private SynchronizedSingleton()
	{
		
	}
	
	public static synchronized SynchronizedSingleton getInstance()
	{
		if(uniqueInstance== null)
		{
			uniqueInstance = new SynchronizedSingleton();
		}
		return uniqueInstance;
	}
*/
	
	// Eager Initialization
	
	private static SynchronizedSingleton uniqueInstance = new SynchronizedSingleton();
	
	private SynchronizedSingleton()
	{}
	
	public static SynchronizedSingleton getInstance()
	{
		return uniqueInstance;
	}
	

}
