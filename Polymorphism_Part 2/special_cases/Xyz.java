package special_cases;

/*
case1: Do overriding method must have same return tyoe(or subtype)? 
Ans: before 1.4 version, child and parent class er return type must be same.
But after 1.4 version, the return type can be covariant.This is called covariant return type. 
*/
/*
class Test			//parent class
{
	void show()	     //int show() or string show()		(before 1.4 version)	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test		//child class
{

	void show()			//int show() or string show()	(before 1.4 version)	
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

*/
//covariant return type
/*
class Test
{
	Object show()	     		//(after 1.4 version)	
	{
		System.out.println("show1");
		return null;
	}
}
class Xyz extends Test
{

	String show()			//StringBuffer show() or StringBuilder show()	(after 1.4 version)	
	{
		System.out.println("show2");
		return null;
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();				//can call show1
		
		Xyz x = new Xyz();
		x.show();				//although inheritance is applied, still it cannot call show1, it can only call its own method show2.
	}

}
*/
/*
show1
show2

Object is the parent class of all the classes in Java.
String class is child class of Object class.It is also valid overriding.
So, parent class er vetor method er je return type deoa hochhe, child  class er vetor method er je return type 
deoa hbe seta parent class er return type er child o hote pare abar same o hote pare 

Object show()		in parent class							//valid
String or StringBuffer or Object show()	in child classs
But,   
String or StringBuffer Show()	in parent class						//invalid
Object show()			in child classs
ulto kore dile hbe na 
because, Parent class er method er return type, child class er method er return type er parent hote hbe ba dutoi soman hote parbe.
*/

//--------------------------------------------------------------------------------------
//case2: Overriding and access modifier
/*access modifier is default by default. Nothing is written means default.

Object show()		//valid because both have default
String show()

but, below is not valid, , child class er overrriden method er  access modifier er scope, Parent class er  access modifier er scope er soman or boro hote hbe. 
public Object show()  	//invalid
String show()

public Object show()  	//valid
public String show()

Object show()  		  	//valid
public String show()

protected Object show()  		  	//valid
public String show()

public Object show()  		  	//invalid 
protected String show()
attemting to assign weaker access privieleges.

child class er accessibility, parent class er hoy soman hbe nahole boro hbe.  otherwise error: attemting to assign weaker access privieleges.
*/

//below both default no problem
/*
class Test			
{
	void show()	     //int show() or string show()		(before 1.4 version)	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test		//child class
{

	void show()			//int show() or string show()	(before 1.4 version)	
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
*/

//below is valid
/*
class Test			//parent class
{
	void show()	     	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test		//child class
{

	public void show()				
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

*/

//below is invalid
/*
class Test			//parent class
{
	public void show()	     	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test		//child class
{

	 void show()				
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

*/

//--------------------------------------------------------------------------------------

/*
case 3
Overriding and Exception Handling
-----------------------------------
rule1: Parent class jodi kono exception throw na kore, then Child class always unchecked exception e throw korte parbe.
other wise jodi child class checked exception throw kore then compile time error(CTE)
rule2: Parent class jodi kono exception throw kore, then Child class hoy same exception throw korbe or same level er onno 
kono exception throw korbe or kono exception throw na korleo cholbe. jodi child class, parent class er exception throw kore otherwise CTE

here child class throws ArithmaticException - unchecked exception - no problem 

class Test							//parent class
{
	void show()	     	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() throws ArithmeticException		//unchecked exception		
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

here child class throws Exception - checked exception - CTE = overrriden method does not throw Exception

class Test							//parent class
{
	void show()	     	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() throws Exception		//checked exception				
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

either both parent and child class can throw same runtime exception 

class Test							//parent class
{
	void show()	throws RuntimeException   	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() throws RuntimeException		
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

or parent class can throw RuntimeException and child class can throw ArithmaticException  (RuntimeException er child ArithmaticException) 

class Test							//parent class
{
	void show()	throws RuntimeException   	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() throws ArithmeticException		
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

or parent class can throw an Exception and child class does not throw any Exception

class Test							//parent class
{
	void show()	throws RuntimeException   	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() 					//no exception thrown by child class
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


but below program is not valid , child class cannot throw Exception when Parent class throws RuntimeException, So, CTE = overrriden method does not throw Exception
Exception is the parent exception of RuntimeException, so not valid 

class Test						//parent class
{
	void show()	throws RuntimeException	     	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() throws Exception						
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
*/

//--------------------------------------------------------------------------------------

/*
case4
Overriding and Abstract Method
-------------------------------
abstract class er vetor  normal method o thake and abstract method o thake and abstract class er instance/object create kora jay na.
jodi parent class akta abstract class hoy then, in child class we must override that abstract method which is present in abstract parent class. 


Same for Interface. Interface er bhetor sob method abstract e hoy by default.So, in child class we must override that abstract method which is present in interface.
interface er o object/instance create kora jay na
*/

//below program gives error, as we did not override abstract method inside child class.
/*
abstract class Test						//parent abstract class
{
	//abstract void display()				//Abstract methods do not specify a body
	//{
		//System.out.println("abstract display method");	
	//}
	
	abstract void display();
	
	void show()	throws RuntimeException	     	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class //erroe: Xyz is not abstract and does not override abstract method display() in Test 
{

	 void show() 				
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		//Test t = new Test();	//Test is absract, cannot be instantiated
		//t.show();				
		
		Xyz x = new Xyz();
		x.show();				//although inheritance is applied, still it cannot call show1, it can only call its own method show2.
	}

}
*/

//if parent is absract class and has abstract method(do not has body) then  must override in child class
/*
abstract class Test						//parent abstract class
{
	abstract void display();		//abstract method, body is not written here, it is present in child class
	
	void show()	throws RuntimeException	     	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class //erroe: Xyz is not abstract and does not override abstract method display() in Test 
{
	void display()			//overriding the abstract method
	{
		System.out.println("overriden abstract display method in child class");
	}

	 void show() 				
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		//Test t = new Test();	//Test is absract, cannot be instantiated
		//t.show();				
		
		Xyz x = new Xyz();
		x.show();				//although inheritance is applied, still it cannot call show1, it can only call its own method show2.
		x.display();
	}

}
show2
overriden abstract display method in child class
*/
/* same case for interface.
interface I1					//parent is an interface
{
	void display();		//by default methods are abstract inside interface, body is not written here, it is present in child class
}
class Xyz implements I1				//child class //erroe: Xyz is not abstract and does not override abstract method display() in Test 
{
	//make it public
	public void display()			//overriding the abstract method, if we do not override we will get CTE same as earlier and we have to increase the visibility otherwise CTE: attempting to assign weaker access privileges 
	{
		System.out.println("overriden abstract display method in child class");
	}

	 void show() 				
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		//interface cannot be instantiated
				
		
		Xyz x = new Xyz();
		x.show();				//although inheritance is applied, still it cannot call show1, it can only call its own method show2.
		x.display();
	}

}

show2
overriden abstract display method in child class
*/

//--------------------------------------------------------------------------------------
//case5: Invoking overriden method from sub-class
//using super(); keyword - child class er object diye parent class er method call kora jay

//in below program although inheritance is applied, still object of Xyz class cannot call method of its parent class(Test) -show1, it can only call its own method show2.
/*
class Test							//parent class
{
	void show()	 	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() 					
	{
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();				//can call show1
		
		Xyz x = new Xyz();
		x.show();				//can call show2	
	}

}

show1
show2
*/

/*
class Test							//parent class
{
	void show()	 	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() 					
	{
		 super.show();		//super refers to the parent class 
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();				//can call show1
		
		Xyz x = new Xyz();
		x.show();				//can call show1 and show2
	}

}
show1
show1
show2
*/

//--------------------------------------------------------------------------------------

//case6: Which methods cannot override?

//final methods can't be overriden in child class
/*
class Test							//parent class
{
	final void show()	 	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() 					//Error:Cannot override the final method from Test
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
*/
//static methods can't be overriden in child class
/*
class Test							//parent class
{
	static void show()	 	
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() 					//Error: show() in Xyz cannnot override show() in Test because overriden method is static
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

*/
//private methods can't be overriden in child class

/*
class Test							//parent class
{
	private void show()	 			//accessibility of private access modifier is within class
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	 void show() 					
	{
		  
		System.out.println("show2");
	}
	
	public static void main(String[] args) 
	{
		//Test t = new Test();		//accessibility of private access modifier is within class, so outside the class it is not visible
		//t.show();				
		
		Xyz x = new Xyz();
		x.show();				
	}

}
even if we run, only show2 method is coming as o/p , not show1 method.
show2
*/

//--------------------------------------------------------------------------------------
//Case7: Overriding and synchronized/strictfp method

//synchronized method can be overriden. if we attach synchronized keyword before parent or child class method, 
//it will create no impact on overriding.
/*
class Test							//parent class
{
	synchronized void show()	 	//synchronized is parent class method		
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
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

//synchronized method can be overriden

/*
class Test							//parent class
{
	 void show()	 			
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	synchronized void show() 					//synchronized is child class method
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

//strictfp(strict floating point) method can be overriden. if we attach strictfp keyword before parent or child class method, 
//it will create no impact on overriding.
/*
class Test							//parent class
{
	strictfp void show()	 		//strictfp is parent class method			
	{
		System.out.println("show1");
	}
}
class Xyz extends Test				//child class
{

	strictfp void show() 					//strictfp is child class method
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

Also individually, attaching strictfp to child and parent class method will not create any effect on overriding.
*/

