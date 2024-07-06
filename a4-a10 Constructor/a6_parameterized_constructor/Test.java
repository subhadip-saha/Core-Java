//parameterized constructor provided by the programmer

package a6_parameterized_constructor;

public class Test {

	Test(int a)
	{
		System.out.println("parameterized constructor");
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test t = new Test();		//error: undefined ctor //reason: here no argument ctor is called but we did not provide no argument ctor rather we provided param ctor, 
		//compiler only creates default ctor if the programmer creates none.
		
		Test t = new Test(10); //we have to pass parameter while creating object
	}

}
