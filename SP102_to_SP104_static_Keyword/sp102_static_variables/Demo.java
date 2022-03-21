package sp102_static_variables;

//static variable can be class level variable, not local variable.
/*
class Test 
{

	int a = 10; 	//class level variable, instance variable
	
	void m1()
	{
		int b = 10; 	//method local variable
	}

}
*/
/*
class Test 
{

	static int a = 10; 	//we can add static with class level variable, instance variable
	
	void m1()
	{
		//but we cannot add static with method local variable
		static int b = 10; 	//err: Illegal modifier for parameter b; only final is permitted
	}

}
*/


//accessing static variable
/*
class Test 
{
	static int a = 10; 	//class level variable, instance variable	
}

class Demo
{
	public static void main(String[] args)
	{
		//System.out.println(a);	//err: cannot find symbol - a
		System.out.println(Test.a);
	}
}

//10
//that means we can access static variable directly using that class where static variable is declared. - here Test class
//static variable belongs to the class, not object means we don't need to create object to use static variable.
*/

//accessing normal variable
/*
class Test 
{
	int a = 10; 	//class level variable, instance variable
}
class Demo
{
	public static void main(String[] args)
	{	
		//System.out.println(Test.a);	//err: Cannot make a static reference to the non-static field Test.a
		
		//Now we have to create object of Test class
		
		Test t = new Test();
		System.out.println(t.a);
	}
}

//10

*/










