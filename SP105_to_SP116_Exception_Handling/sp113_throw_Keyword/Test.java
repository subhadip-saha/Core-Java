package sp113_throw_Keyword;

/*program abnormally terminates
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
			System.out.println("check");  //checking abnormal termination happened or not
	}

}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at l113_throw_Keyword.Test.main(Test.java:10)
*/

/* solution of above program
public class Test {

	public static void main(String[] args) {
		try
		{	
			int a = 100, b = 0, c;
			c = a / b;				//line 4
			System.out.println(c);
		}
		catch(ArithmeticException ae) 
		{
			System.out.println(ae);
		}
		
		System.out.println("check");  //checking abnormal termination happened or not
	}

}*/


//-------------------------------------

/* program abnormally terminates
 public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.divide();
		System.out.println("check");  //checking abnormal termination happened or not
	}
	
	void divide(){
			int a = 100, b = 0, c;
			c = a / b;				//line 8
			System.out.println(c);	
	}

}*/

/*solution of above program
public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.divide();
		System.out.println("check");  //checking abnormal termination happened or not
	}
	
	void divide(){
		try
		{	
			int a = 100, b = 0, c;
			c = a / b;				//line 8
			System.out.println(c);	
		}
		catch(ArithmeticException ae) 
		{
			ae.printStackTrace();
		}
	}

}*/

/*or, another solution

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		try
		{
			t.divide();
		}
		catch(ArithmeticException ae) 
		{
			ae.printStackTrace();
		}
		System.out.println("check");  //checking abnormal termination happened or not
	}
	
	void divide(){
			int a = 100, b = 0, c;
			c = a / b;				//line 8
			System.out.println(c);	
	}

}*/


//-------------------------------------

