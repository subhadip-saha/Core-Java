package sp101_final_keyword;

//use final keyword with variable - (result - variable become constant)

/*
class Test 
{

	public static void main(String[] args) 
	{
		//without using final
		int i = 10; 
		System.out.println(i);
		i += 20;	//i = i + 20;
		System.out.println(i);
	}

}

10
30
*/

/*
class Test 
{

	public static void main(String[] args) 
	{
		//with using final
		final int i = 10; // now i is constant, its value cannot be changed anymore
		System.out.println(i);
		i += 20;	//err: cannot assign a value to final variable i means once we have assigned a value for i, we cannot re-assign its value as i is declared as final
		System.out.println(i);
	}

}
*/


//use final keyword with method - (result - method cannot be overrriden anymore)
/*
class Demo
{
	void m1()
	{
		System.out.println("parent m1");
	}
}

class Test
{
	void m1()
	{
		System.out.println("child m1");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
	}
}
child m1
*/
/*
class Demo
{
	void m1()
	{
		System.out.println("parent m1");
	}
}

class Test extends Demo
{
	void m1()
	{
		super.m1();
		System.out.println("child m1");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
	}
}

parent m1
child m1
*/
/*
class Demo
{
	void m1()
	{
		System.out.println("parent m1");
	}
}

class Test extends Demo
{
	void m1()
	{
		m1();		
		System.out.println("child m1");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
	}
}

//stack overflow error
*/
/*
class Demo
{
	final void m1()	
	{
		System.out.println("parent m1");
	}
}

class Test extends Demo
{
	void m1()			//err:Cannot override the final method from Demo
	{	
		System.out.println("child m1");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
	}
}
*/

//use final keyword with class - (result - that class cannot be inherited and extended anymore)

/*
class Demo
{
	void m1()	
	{
		System.out.println("parent m1");
	}
}

class Test extends Demo
{
	void m1()			
	{	
		System.out.println("child m1");
	}
	
	public static void main(String[] args)
	{

	}
}

//No output because, nothing is written in main function, but the program successfully compiles and that means class Test is inheriting from class Demo
*/
/*
final class Demo  //we cannot extend from or inherit from Demo class 
{
	void m1()	
	{
		System.out.println("parent m1");
	}
}

class Test extends Demo	//err: The type Test cannot subclass the final class Demo
{
	void m1()			
	{	
		System.out.println("child m1");
	}
	
	public static void main(String[] args)
	{

	}
}

//error
*/


final class Demo   
{
	void m1()	
	{
		System.out.println("parent m1");
	}
}

class Test	//we cannot extend from or inherit from Demo class
{
	void m1()			
	{	
		System.out.println("child m1");
	}
	
	public static void main(String[] args)
	{

	}
}

//successfully compiles and runs but no o/p











