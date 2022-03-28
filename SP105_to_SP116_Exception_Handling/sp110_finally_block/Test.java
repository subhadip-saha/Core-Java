package sp110_finally_block;

//finally block will always be executed

/* no catch block and no exception occurs, finally block executed
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//risky code
			int a = 100, b = 2, c;
			c = a / b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("finally");
		}
	
	}
}

50
finally
*/

/* exception occurs but no catch block to handle the exception, still finally block executed
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//risky code
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("finally");
		}
	
	}
}

finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at l110_finally_block.Test.main(Test.java:39)

*/

/* catch block and no exception occurs, finally block executed
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//risky code
			int a = 100, b = 2, c;
			c = a / b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) //or we can write catch(Exception e), here ArithmeticException is exception class nam e and e is reference variable 
		{		
			System.out.println(ae);	//it prints only 2 - exception name, description, it cannot print stacktrace 
		}
		finally
		{
			System.out.println("finally");
		}
	
	}
}

50
finally
*/

/* here exception occurs and handled the exception by catch block, finally block executed
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//risky code
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) //or we can write catch(Exception e), here ArithmeticException is exception class nam e and e is reference variable 
		{		
			System.out.println(ae);	//it prints only 2 - exception name, description, it cannot print stacktrace 
		}
		finally
		{
			System.out.println("finally");
		}
	
	}
}

java.lang.ArithmeticException: / by zero
finally
*/










