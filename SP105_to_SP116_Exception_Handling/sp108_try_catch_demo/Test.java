package sp108_try_catch_demo;

/*
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//checked exception/compile time exception
		
		//FileInputStream fis = new FileInputStream("f:/abc.txt");	//FileNotFoundException
		
		//Class.forName("com.mysql.jdbc.Driver");	//ClassNotFoundException
		
		
		//unchecked exception/run time exception 
		
		//int a = 100, b = 0, c;
		//c = a / b;				//ArithmeticException: / by zero
		//System.out.println(c);			
		
		String name = null;			
		System.out.println(name.length());	//NullPointerException
		
	}

}
*/

/* Handling ArithmeticException and its handling.
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
		catch(ArithmeticException e) //or we can write catch(Exception e), here ArithmeticException is exception class nam e and e is reference variable 
		{
			//System.out.println(e);	//java.lang.ArithmeticException: / by zero
			//handling code
			System.out.println("You cannot divide by zero");
		}		
	
	}
}

//Now we have used try-catch, so it will not terminate abnormally
*/

//Flow of the program - checking if the program successfully terminates or not

/*
class Test
{
	public static void main(String[] args)
	{
		System.out.println("1");
		int a = 100, b = 2, c;
		System.out.println("2");
		c = a / b;
		System.out.println("3");
		System.out.println("result = " + c);
		System.out.println("4");
		System.out.println("program successfully terminated");
	}
}
*/

/*
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1");
		try
		{
			System.out.println("2");
			//risky code
			int a = 100, b = 2, c;
			System.out.println("3");
			c = a / b;
			System.out.println("4");
			System.out.println("result = " + c);
			System.out.println("5");
			System.out.println("program has not entered catch block");
			System.out.println("program successfully terminated");
		}

		//main method will create object when exception occurs and that object is referred by e
		catch(ArithmeticException e) //or we can write catch(Exception e), here ArithmeticException is exception class nam e and e is reference variable 
		{
			System.out.println("program has entered catch block");
			System.out.println("6");
			System.out.println(e);	//java.lang.ArithmeticException: / by zero
			System.out.println("7");
		}		
		System.out.println("8");
	}
}

1
2
3
4
result = 50
5
program has not entered catch block
program successfully terminated
8
*/

/*
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1");
		try
		{
			System.out.println("2");
			//risky code
			int a = 100, b = 0, c;
			System.out.println("3");
			c = a / b;
			System.out.println("4");
			System.out.println("result = " + c);
			System.out.println("5");
			System.out.println("program has not entered catch block");
			System.out.println("program successfully terminated");
		}

		//main method will create object when exception occurs and that object is referred by e
		catch(ArithmeticException e) //or we can write catch(Exception e), here ArithmeticException is exception class nam e and e is reference variable 
		{
			System.out.println("program has entered catch block");
			System.out.println("6");
			System.out.println(e);	//java.lang.ArithmeticException: / by zero
			System.out.println("7");
			System.out.println("program has left catch block");
		}		
		System.out.println("8");
	}
}
/*
1
2
3
program has entered catch block
6
java.lang.ArithmeticException: / by zero
7
program has left catch block
8
*/

//try er vetor jei line a exception asbe, tar nicher portion code skip hoye jabe and control flow catch block a chole jabe
//try er vetor jodi exception na asey, tar nicher portion code skip hbe na and control flow catch block a chole jabe na, tkhn catch block will be skipped


//handling the checked exception using try-catch
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//here I'm importing a driver class of sql
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			//System.out.println(e);
			System.out.println("sql database is not responding.Try oracle db");
		}
	}
}
