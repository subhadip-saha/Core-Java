//Inheritance (IS-A) Relationship

package a15_is_a_relationship;

class Vehicle
{
	String color = "White";
	int maxSpeed = 120;
	private int regNumber;
	
	void display()
	{
		System.out.println("This is a veihcle.");
	}
	
	public Vehicle()
	{
		System.out.println("Vehicle constructor called");
	}
}

class SUV extends Vehicle
{
	boolean extraTyre = true;

	void displaySUV()
	{
		System.out.println("This is a SUV - TATA Safari.");
	}
}

public class Jeep extends SUV 
{

	int height = 7;
	
	void displayJeep()
	{
		System.out.println("This is a Jeep - Mahindra Thar.");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Jeep jp = new Jeep();
		System.out.println("----------------");	
		jp.display();
		System.out.println(jp.color);
		System.out.println(jp.maxSpeed + " kph");
		//System.out.println(jp.regNumber);	//regNumber is not visible, private datamembers cannot be inherited
		//jp.Vehicle(); //not allowed ctor cannot be inherited
		System.out.println(jp);		//Fully qualified classname
		
		System.out.println("----------------");	
		
		System.out.println(jp.extraTyre);
		jp.displaySUV();
		
		System.out.println("----------------");

		System.out.println(jp.height);
		jp.displayJeep();
				
	}

}
