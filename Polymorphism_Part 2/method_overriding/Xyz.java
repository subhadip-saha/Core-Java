package method_overriding;

/*
class Test
{
	void show()
	{
		System.out.println("show1");
	}
}
class Xyz 
{

	void show()
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();
		
		Xyz x = new Xyz();
		x.show();
	}

}

show1
show2
*/

//dynamic polymorphism / run time polymorphism achieved by method overriding

//method overriding - same method name in different class attached with inheritance with same no. of arguments 
/*
class Test
{
	void show()				//0 arguments
	{
		System.out.println("show1");
	}
}
class Xyz extends Test
{

	void show()				//0 arguments
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();				//can call show1
		
		Xyz x = new Xyz();
		x.show();				//although inheritance is applied, still it cannot call show1, it can only call its own method show2.
	}

}
show1
show2


In method overriding, jei class er object create korbo, tar reference diye shudhu sei class er method e call kora 
jabe.eg: Xyz class er object diye Test class er show method ke call kora jabe na apatoto. condition: super keyword 
use kore call kora jabe.Later we will see.

*/

/*
 *  1 argument 
class Test
{
	void show(String a)		//1 argument
	{
		System.out.println("show1");
	}
}
class Xyz extends Test
{

	void show(String b)		//1 argument
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show("java");				//can call show1
		
		Xyz x = new Xyz();
		x.show("200");				//although inheritance is applied, still it cannot call show1, it can only call its own method show2.
	}

}
show1
show2
*/



//--------------------------------------------------------------------------------------

//method overriding - same method name in different class attached with inheritance with same type of arguments 
/*
 * same type argument

class Test
{
	void show(int a)		//1 argument
	{
		System.out.println("show1");
	}
}
class Xyz extends Test
{

	void show(int b)		//1 argument
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show(10);				//can call show1
		
		Xyz x = new Xyz();
		x.show(20);				//although inheritance is applied, still it cannot call show1, it can only call its own method show2.
	}

}
show1
show2
*/

//--------------------------------------------------------------------------------------

//method overriding - same method name in different class attached with inheritance with same sequence of arguments
/*
class Test
{
	void show(int a, double d)		//1 argument
	{
		System.out.println("show1");
	}
}
class Xyz extends Test
{

	void show(int a, double b)		//1 argument
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show(10, 50.5);				//can call show1
		
		Xyz x = new Xyz();
		x.show(20, -2.2);				//although inheritance is applied, still it cannot call show1, it can only call its own method show2.
	}

}

show1
show2
*/


/*
Use cases of Method overriding 
suppose, child class er object diye ami parent class er method call korate chaichi na orthat 1 print korbo na, kintu 2 print hbe, so overriding use kore, parent class er method override kore child class er specific implementation kore nite parbo. So, through method overriding we can change implementation according to us.

*/














