package superKeyword;

public class Vehicle {
	
	int maxSpeed = 140;

	public static void main(String[] args) 
	{	
		car c1 = new car();
		c1.display();
	}	
}

class car extends Vehicle
{	
	int maxSpeed = 200;
	void display()
    {
//	accessing maxSpeed of Super class in subclass using super keyword.
	System.out.println("Maximum Speed: "+ super.maxSpeed);
    }
}