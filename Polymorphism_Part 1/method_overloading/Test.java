package method_overloading;

//static polymorphism / compile time polymorphism achieved by method overloading

/*
 *Problems in method overloading : 
 *---------------------------------
 * here we declared two methods with same name and in same class.So, compiler becomes confused which show() to call as 
 * their names are same and both are having same number arguments i.e. 0 arguments. This is called ambiguity error.
 */
/*
public class Test {

	void show()		// 0 arguments
	{
		System.out.println("show1");
	}
	
	void show()		// 0 arguments
	{
		System.out.println("show2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show();
	}

}

error: Duplicate method / method show() is already defined in class Test
*/

//here is also ambiguity - same method name, same class, same no. of argument
/*
public class Test {

	void show(int a)		// 1 argument
	{
		System.out.println("show1");
	}
	
	void show(int b)		// 1 argument
	{
		System.out.println("show2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10);
	}

}
error: Duplicate method / method show() is already defined in class Test
*/

//Method overloading starts here
//no ambiguity - same method name in same class but with different  no. of arguments
/*
public class Test {

	void show(int a)		// 1 argument
	{
		System.out.println("show1");
	}
	
	void show()		// 0 argument
	{
		System.out.println("show2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10);	
		t.show();
	}

}

o/p:
	show1
	show2

*/

//no ambiguity - same method name in same class but with different sequence of arguments
/*
public class Test {

	void show(int a, String b)		// 2 arguments
	{
		System.out.println("show1");
	}
	
	void show(String b, int a)		// 2 argument
	{
		System.out.println("show2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10, "java");	
		t.show("java", 10);
	}

}

o/p:
	show1
	show2
*/

//no ambiguity - same method name in same class,  but with different type of arguments
/*
public class Test {

	void show(int a)		// 1 argument
	{
		System.out.println("show1");
	}
	
	void show(String b)		// 1 argument
	{
		System.out.println("show2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10);	
		t.show("java");
	}

}
o/p:
	show1
	show2
*/




