package sp100_uses_of_super_keyword;

/*
//use1: super keyword is used to refer immediate parent class instance variable
class A
{
	int a = 10;
}
class B extends A
{
	int a = 20;			//notice, we have taken two instance variables with same name in two classes
	
	void show(int a)	//notice, we have taken a local variable with same name again.
	{
		System.out.println(super.a);//it prints value of current class's parent class's instance variable. So, it points to the class A's instance variable a	
	}
	public static void main(String[] args)
	{
		B ob1 = new B();
		ob1.show(30);
	}

}

//10
*/


//use2: super keyword is used to invoke immediate parent class method
/*
class A
{
	void m1()
	{
		System.out.println("class A - parent class");
	}
}
class B extends A
{
		
	void show()	
	{
		System.out.println("class B - child class");
		super.m1();			//invokes the parent class method m1
	}
	public static void main(String[] args)
	{
		B ob1 = new B();
		ob1.show();
		ob1.m1();//we can call m1 using B's onject because B is child of A
	}

}

class B - child class
class A - parent class
class A - parent class
*/

/* use2 : another way of thinking
class A
{
	void m1()
	{
		System.out.println("class A - parent class");
	}
}
class B extends A
{
	//method overriding concept used, same name method in different class and inheritance concept used
	void m1()
	{
		System.out.println("class B - child class");
	}	
	void show()	
	{
		m1();		//it calls current/class's m1 method
		super.m1();	//invokes the parent class method m1
	}
	public static void main(String[] args)
	{
		B ob1 = new B();
		ob1.show();
		ob1.m1();
	}

}

class B - child class
class A - parent class
class B - child class
 */

//use3: super() is used to invoke immediate parent class constructor

/*
class A
{
	A()
	{
		System.out.println("class A - parent class");
	}
}
class B extends A
{
		
	B()
	{	//although we are not using super here, but compiler automatically add super(); here, see the o/p	
		System.out.println("class B - child class");
	}
	
	public static void main(String[] args)
	{
		B ob1 = new B();
		
	}

}

class A - parent class
class B - child class
*/

class A
{
	A()
	{
		System.out.println("class A - parent class");
	}
}
class B extends A
{
		
	B()
	{	//now we added super here explicitly and got same o/p	
		super();
		System.out.println("class B - child class");
	}
	
	public static void main(String[] args)
	{
		B ob1 = new B();
	}

}
/*
class A - parent class
class B - child class
*/