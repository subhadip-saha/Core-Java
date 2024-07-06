//no argument constructor created by the programmer
//here compiler will not create default constructor

package a5_default_constructor2;

public class Test {

	int i;			//global variable
	
	Test()
	{
		//if i is declared here only, then error occurs 
		//int i; 	//here i is local variable to to this method, so cannot be called 
		System.out.println("No arg constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();	//as soon as the object is created, here the ctor directly calls no argument ctor created by programmer 
		System.out.println(t.i);
	}

}
