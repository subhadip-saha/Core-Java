//There are different ways to print exception message

package sp109_methods_for_exception_information;

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

		//main method will create object when exception occurs and that object is referred by e
		catch(ArithmeticException ae) //or we can write catch(Exception e), here ArithmeticException is exception class nam e and e is reference variable 
		{
			//handling code
			ae.printStackTrace();    //it prints all 3 - exception name, description, stacktrace
			System.out.println(ae);	//it prints only 2 - exception name, description, it cannot print stacktrace 
			System.out.println(ae.toString()); //it also prints only 2 - exception name, description, it cannot print stacktrace
			System.out.println(ae.getMessage());	//only prints esception description.
			
			//programmer own message
			System.out.println("You cannot divide by zero");
		}		
	
	}
}

/*
java.lang.ArithmeticException: / by zero
	at l109_methods_for_exception_information.Test.main(Test.java:12)
java.lang.ArithmeticException: / by zero
java.lang.ArithmeticException: / by zero
/ by zero
You cannot divide by zero

*/