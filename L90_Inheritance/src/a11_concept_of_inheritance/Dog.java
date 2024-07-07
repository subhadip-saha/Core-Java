package a11_concept_of_inheritance;

class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
}

/*
class Dog 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.eat();					//error: The method eat() is undefined for the type Dog 
		
		Animal a = new Animal();
		a.eat();					//no error: eat() is defined in Animal class, so we can create an object of Animal class
	}								//and call the eat() method. but same thing cannot be done with the object of Dog class
									//because eat() is not defined in Dog class

}

*/

//So, to remove this error - we have to define same eat() in Dog class also

/*

class Dog 
{

	void eat()
	{
		System.out.println("animal is eating");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.eat();					//now that error gone 
		
		Animal a = new Animal();
		a.eat();					
	}																	

}


//but code re-usability is not maintained here. So, don't do that. The code becomes lengthy and more time required for 
  execution.


*/

//More efficient solution will be using inheritance - so that we can achieve code re-usability


class Dog extends Animal						//inheritance is used, code becomes small in size
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Dog d = new Dog();						//now that error gone 
		d.eat();					
		
		Animal a = new Animal();
		a.eat();					
	}																	

}



