
package special_cases;


//Case 1: Can we achieve Method Overloading by changing the return type of method only?
//Ans: No
/*
public class Test {

	void show(int a)		
	{
		System.out.println("show1");
	}
	
	String show(int a)		
	{
		System.out.println("show2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10);	
		t.show(10);
	}

}
//Error: Duplicate method - Method show() is already defined in class Test
*/

//-----------------------------------------------------------
//Case 2: Can we Overload main() method?
//Ans: Yes
/*
public class Test {

	public static void main(String[] args) {
		System.out.println("main1");
	}

	public static void main(int a) 
	{
		System.out.println("main2");
	}

}
op:
	1
*/

//to call second main we have to create an object of Test
/*
public class Test {

	public static void main(String[] args) {
		System.out.println("main1");
		Test t = new Test();		
		t.main(100);
	}

	public static void main(int a) 
	{
		System.out.println("main2");
	}

}
o/p:
	main1
	main2
*/
//-----------------------------------------------------------
//case 3: The concept of Automatic Promotion is valid in Method Overloading

/*
public class Test {

	void show(int a)		// 1 argument
	{
		System.out.println("int argument");
	}
	
	void show(String b)		// 1 argument
	{
		System.out.println("String argument");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10);			
		t.show("java");		//passing string
	}

}

o/p:
	int argument
	String argument
*/

//-----------------------------------------------------------
//case 4: Different cases of Automatic Promotion 
//case 4.1: 
//now instead passing string, pass a character
/*
public class Test {

	void show(int a)		// 1 argument
	{
		System.out.println("int argument");
	}
	
	void show(String b)		// 1 argument
	{
		System.out.println("String argument");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10);			
		t.show('s');		//passing char
	}

}

o/p:
	int argument
	int argument
	
char to int - automatic promotion is applied here	- here in main method whatever argument we passing,
if that argument is not matched then compiler applies automatic promotion for that argument. 
*/

//case 4.2: type of argument changed to Object
/*
public class Test {

	void show(Object a)		
	{
		System.out.println("Object argument");
	}
	
	void show(String a)		
	{
		System.out.println("String argument");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10);			
		t.show('s');
		t.show(null);
		t.show("java");		
	}

}

o/p:
	Object argument
	Object argument
	String argument	
	String argument
	
If there are child class and parent class - then compiler gives preference to child class i.e. here String class, no need to call its parent class i.e. Object class. 	
So, here child class method is called, not parent class method
*/


//case 4.3: if here two same level class type of arguments are present
/*
public class Test {

	void show(StringBuffer a)		
	{
		System.out.println("StringBuffer argument");
	}
	
	void show(String a)		
	{
		System.out.println("String argument");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		//t.show(10);	//type mismatch	
		//t.show('s');	//type mismatch	
		//t.show(null);	//reference to show() is ambiguous because compiler cannot understand null is provided for whom - string or stringbuffer.  
		
		t.show("java");
		t.show(new StringBuffer("xyz"));
	}

}

o/p:
String argument
StringBuffer argument

*/

//-----------------------------------------------------------
//no ambiguity

/*
public class Test {

	void show(int a, float b)		// 2 arguments
	{
		System.out.println("int float argument");
	}
	
	void show(float a, int b)		// 2 argument
	{
		System.out.println("float int argument");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10, 20.5f);	
		t.show(20.5f, 10);
	}

}

o/p:
int float argument
float int argument
*/

//case 4.4: here ambiguity comes, 10 is matched but 20 is not matched
/*
public class Test {

	void show(int a, float b)		// 2 arguments
	{
		System.out.println("int float argument");
	}
	
	void show(float a, int b)		// 2 argument
	{
		System.out.println("float int argument");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10, 20.5f);	
		t.show(20.5f, 10);
		
		//t.show(10, 20);		//error: The method show(int, float) is ambiguous for the type Test
		
		t.show(10.5, 20.5);		//error: type mismatch - no suitable method found for float,float and we know, float cannot be automatically promoted to int

	}

}

10,20 - error : reference to show is ambiguous - it means here automatic promotion can't be donebecause it is confusing b/w first and second show() 
t.show(10, 20); - int, float  
t.show(10, 20); - float, int 
in first case whether 10 should be int and 20 should be promoted to float or in second case whether 10 should be promoted to float and 20 should be int - compiler becomes ambiguous.

*/

//now if the datatype is completely different like String and float then automatic promotion works
/*
public class Test {

	void show(String a, float b)		// 2 arguments
	{
		System.out.println("method with String float argument");
	}
	
	void show(float a, int b)		// 2 argument
	{
		System.out.println("method with float int argument");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		
		t.show(20.5f, 10);
		
		t.show("abc", 20);		//although we are not passing float value, yet it is automatically promoted

	}

}


 o/p: 
method with float int argument
method with String float argument

the concept is - for "abc",20 - it is not confused but for 10,20 - confused
So, if the datatype is completely different from each other like string and float then "abc",20 - here 20 is promoted to float but 10,20 - it will be confused 
*/


//-----------------------------------------------------------
//case 4.5: varargs

//ambiguity - same method name, same class, same no. of argument
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

//But using varargs, ambiguity can be removed

public class Test {

	void show(int a)		// 1 argument
	{
		System.out.println("show method with int argument");
	}
	
	void show(int... b)		// varargs
	{
		System.out.println("show method with varargs");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show(10);
		t.show(10,20,30,40);		//varargs can accept multiple arguments
		t.show(null);
		t.show(0);
		t.show();
	}

}

/*
o/p:
show method with int argument
show method with varargs
show method with varargs
show method with int argument
show method with varargs
*/