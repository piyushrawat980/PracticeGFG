package interviewPrep;

public class CheckOverloading {
	
	 public void m3(int i, int b) 
	 {
	        System.out.println("m3 first");
	    }

	    public int m3(int i) 
	    {
	        System.out.println("m3 second");
	        return 0;
	    }

	public static void main(String[] args) {
		CheckOverloading a = new CheckOverloading();
        a.m3(10);
    }

}


    