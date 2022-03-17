package sp_98_uses_of_this_keyword;

/*
//use 1: this keyword is used to invoke the current class instance variable.
class ThisDemo {

	int i;		// instance variable
	
	void setValue(int i)	// local variable
	{
		
		this.i = i;		
	}
	
	void show()
	{
		System.out.println(i);	//printing the instance variable
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo td = new ThisDemo();
		td.setValue(10);
		td.show();
	}

}
//10
*/

/*
//this keyword can be used to invoke current class method(implicitly)
class ThisDemo {

		
	void display()	
	{
		System.out.println("hello");
	}
	
	void show()
	{
		display();		//automatically this keyword is added by compiler if it is not written by you, 
		//here display(); is same as this.display();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo td = new ThisDemo();
		td.show();
	}

}

//hello
*/

/*
//use 3: this keyword can be used to invoke current class constructor
class ThisDemo {

	ThisDemo()
	{
		System.out.println("no arg constructor");
	}
	
	ThisDemo(int a)
	{
		System.out.println("parameterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo td = new ThisDemo();
		ThisDemo td2 = new ThisDemo(10);

	}

}

no arg constructor
parameterized constructor

*/

/*
class ThisDemo {

	ThisDemo()
	{
		System.out.println("no arg constructor");
	}
	
	ThisDemo(int a)
	{
		this();
		System.out.println("parameterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td2 = new ThisDemo(10);

	}

}

no arg constructor
parameterized constructor
*/

/*
class ThisDemo {

	ThisDemo()
	{
		this(10);
		System.out.println("no arg constructor");
	}
	
	ThisDemo(int a)
	{
		System.out.println("parameterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td2 = new ThisDemo();

	}

}

parameterized constructor
no arg constructor


*/

//So, by using this keyword in this way we can achieve constructor chaining.
/*
class ThisDemo {

	ThisDemo()
	{
		this(10);
		System.out.println("no arg constructor");
	}
	
	ThisDemo(int a)
	{
		this(20, "ss");
		System.out.println("one arg constructor");
		//this(20, "ss");		//Constructor call must be the first statement in a constructor
	}
	
	ThisDemo(int a, String s)
	{
		System.out.println("two args constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td2 = new ThisDemo();

	}

}


two args constructor
one arg constructor
no arg constructor

*/

//use 4: this keyword can be used to pass as an argument in the method call
/*
class ThisDemo {

	void m1(ThisDemo td)		//reference of the class is used as argument of m1 method
	{
		
		System.out.println("m1 method");
	}
	
	void m2()
	{
		m1(this);
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td = new ThisDemo();
		td.m2();
	}

}

m1 method
m2 method
*/


//use 5: this keyword can be used to pass as an argument in the constructor call
/*
class Test
{
	Test(ThisDemo td)
	{
		System.out.println("Test class constructor");
	}
}
class ThisDemo {

	void m1()
	{
		Test t = new Test(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td = new ThisDemo(this);	//err: Cannot use this in a static context means non static variable this cannot be referenced from a static context
		td.m1();
	}

}

*/

/* solution to previous problem: 
class Test
{
	Test(ThisDemo td)
	{
		System.out.println("Test class constructor");
	}
}
class ThisDemo {
	
	void m1()		
	{
		Test t = new Test(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td = new ThisDemo();
		td.m1();
	}

}

Test class constructor
*/

//use 6: this keyword can be used to return the current class instance from the method


class ThisDemo {
	
	//This method must return a result of type ThisDemo
	ThisDemo m1()	//in previous program return type is void, so we did not return anything but here we returned ThisDemo, so must return this;	
	{
		return this;	//return the current clas instance
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td = new ThisDemo();
		td.m1();
	}

}















