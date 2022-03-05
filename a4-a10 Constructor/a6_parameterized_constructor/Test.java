//parameterized constructor has to be given by programmer

package a6_parameterized_constructor;

public class Test {

	Test(int a)
	{
		System.out.println("parameterized constructor");
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test t = new Test();		//error: undefined ctor //here default ctor is called but we did not provide default ctor rather we provided param ctor , 
		//compiler only creates default ctor if programmer does not create any.
		
		Test t = new Test(10);
	}

}
