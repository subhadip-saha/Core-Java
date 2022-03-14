package abstract_class_and_method;

abstract class Vehicle		//class should be abstract as it consists abstract method
{
	int noOfTyres;
	abstract void start(); 	// method is abstract as body is not written here for achieving abstraction
}
class Car extends Vehicle
{
	//body of the abstract method start() must be written here
	void start()
	{
		System.out.println("CAR starts with KEY");
	}
}

class Scooter extends Vehicle
{
	//body of the abstract method start() must be written here
	void start()
	{
		System.out.println("SCOOTER starts with KICK");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Vehicle v = new Vehicle();	// abstract class Cannot be instantiated  -here Vehicle is abstract class

		Car c = new Car();
		c.noOfTyres = 4;
		c.start();
		
		System.out.println();
		
		Scooter s = new Scooter();
		c.noOfTyres = 2;
		s.start();
	}

}
