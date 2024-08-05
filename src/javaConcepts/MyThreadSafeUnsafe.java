package javaConcepts;

public class MyThreadSafeUnsafe 
{
	static int count =0;
	
	public static synchronized void increment()
	{
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1; i<=1000; i++)
				{
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1; i<=1000; i++)
				{
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(count);
	}
}
