package sp103_static_methods;



//static method can access only static data, cannot access non-static/instance   data, 

/*
public class StaticDemo 
{
	int i = 10;
	static int j = 20;
	static void display()
	{
		//System.out.println(i);	//err: non-static variable i Cannot be referenced from a static context
		System.out.println(j);	
	}
	
	public static void main(String[] args) {
	
		display();
	}
}
*/

//non static method cannot be called from static method
/*
public class StaticDemo 
{

	void show()
	{
		System.out.println("100");	
	}
	static void display()
	{
		//show();		//err: non-static method show() Cannot be reference from a static context
		System.out.println("200");	
	}	
	
	public static void main(String[] args) {
	
		display();
	}
}

*/


//static method cannot refer to 'this' and 'super' keyword
/*
public class StaticDemo 
{
	int i = 10;
	
	void show()			//simple method or instance method diye instance variable call kora jabe and this keyword o use kora jabe
	{
		System.out.println(this.i);	//10
	}
	
	static void display()
	{
		//System.out.println(this.i);	//err: non-static method show() Cannot be reference from a static context
	}
	
	public static void main(String[] args) {
	
		display();
		
		StaticDemo sd = new StaticDemo();
		sd.show();
	}
}
*/

/*
class ParentDemo
{
	int a = 10;
}
class StaticDemo extends ParentDemo
{
	int a = 20;			
	
	static void show(int a)
	{
		System.out.println(a);		 
		System.out.println(this.a);		//err: Cannot use this in a static context
		System.out.println(super.a);	//err: Cannot use super in a static context
	}
	public static void main(String[] args)
	{
		StaticDemo ob1 = new StaticDemo();
		ob1.show(30);
	}

}
*/