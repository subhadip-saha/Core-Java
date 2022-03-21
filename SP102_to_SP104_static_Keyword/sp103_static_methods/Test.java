package sp103_static_methods;

/*
class Test 
{
	void display()			// normal simple method, it belongs to object
	{
		System.out.println("1 normal method");
	}
	
	static void show()			
	{
		System.out.println("2 static method");
	}
	
	public static void main(String[] args) {
		//display(); // we cannot call normal method directly , it gives err: non-static method display() Cannot be reference from a static context
		
		Test t = new Test();
		t.display();
		
		Test.show();	//in this way we can call static method directly through classname.
		show();			//if we call static method from the same class then do not need to provide even class name. If we are calling static method from another class then provide classname.
	}
}
1 normal method
2 static method
2 static method


//static method, it belongs to class, not object
//simple method is called through object but object is not required for static method, we can call static method directly through classname

//now here also static method is used for efficient memory management.  For calling static method no need to call object and object requires memory. So, thus memory saved.

*/

/*
class Xyz
{
	static void show()			
	{
		System.out.println("static method");
	}
}
class Test 
{
	void display()			// normal simple method, it belongs to object
	{
		System.out.println("1 normal method");
	}
	
	public static void main(String[] args) {
		//display(); // we cannot call normal method directly , it gives err: non-static method display() Cannot be referenced from a static context
		
		Test t = new Test();
		t.display();
		
		
		//show();			//now we  must provide classname as static method is declared in another class.
		
		Xyz.show();	//in this way we can call static method directly through classname.
	}
}

1 normal method
static method
*/





















