package interface_example;

/*
interface I1
{
	//methods of interface are by default public and abstract.
	//So, below all are correct and successfully compiled
	void show();		
	abstract void show2();	//jeta use korbo na , seta automatically by default add hoye jabe
	public void show3();		
	public abstract void show4();
	
	protected void show();  // error: access modifier protected not allowed here
	default void show(); 	 // err: access modifier default not allowed here
	default abstract void show(); //err: illegal combination of modifiers- default and abstract
}
*/

//----------------------------------------------------------------------------------

/*
interface I1
{
	void show();		//methods of interface are by default public and abstract.
	
	//void display()		//interface abstract methods cannot have body
	//{
		
	//}
	
	//before java 8, only abstract methods(which does not have body) are allowed in interface, but after java 8, normal concrete methods(which has body) can be added also
	default void display()		//in java 8, concrete method can be added in interface, but condition is:  explicitly use default keyword because here by default access specifier is not default.   
	{
		
	}
	
	//also in java 8, provision for adding static method came
	static void display2()		//default static void display2() -- illegal combination - default and static
	{
		
	}
	
	//fields/variables of interface are by default public, static and final.
	//So, below all are correct and successfully compiled
	int a = 10;
	public static final float b = 20.5f;
	public static double d = 50.2;		//final is by default added, jeta use korbo na , seta automatically by default add hoye jabe
	
}
*/

//----------------------------------------------------------------------------------

/*
interface I1
{
	void show();		//methods of interface are by default public and abstract.
}

class Test implements I1 		
{
	//we have to implement abstract method here in inherited class means body of that method must be written here
	//different class/interface, same method name, same no. of arguments(0 arguments here) - concept of method overriding
	//we know, in method overriding, the access modifier of child class method should be large or at same level of parent class method's access modifier
	//as methods of interface are by default public and abstract, so we have to specify public here in child class.
	//this below show() method is overriden.
	public void show()	// if public is not there , CTE err: attempting to assign weaker access privileges.
	{
		System.out.println("1");
	}
	
	public static void main(String[] args) 
	{
	 
		
		//I1 i = new I1(); //CTE: I1 is abstract: cannot be instantiated
		//we cannot create object of an interface like the abstract class
		
		Test t = new Test();
		t.show();

	}
}

//1
// See, here interface tells the class what to do i.e. call the show() method, but not how to do
*/