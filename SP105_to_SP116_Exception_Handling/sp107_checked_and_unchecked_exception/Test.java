package sp107_checked_and_unchecked_exception;

import java.io.FileInputStream;

/* 
//Example of compile time exception and its handling
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("f:/abc.txt"); //Unhandled exception type FileNotFoundException
	//It does not mean that abc.txt file is not in F drive and so exception occurs. 
	//it means, compiler tells in future FileNotFoundException may occur. Handle the exception with try-catch or throw or throws
	//program is not compiled till now because of this exception, It does not mean this exception occurs at compile time.abhi tak to compile hi nehi hui
	//here just compiler checks that which exception might occur, programmer has reported it or not that is handled it or not. 
	}

}
*/

/*
//handling the exception using try-catch - we have reported FileNotFoundException using try-catch. 
//now no compile time error - program will be successfully compiled
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileInputStream fis = new FileInputStream("f:/abc.txt"); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	 
	}

}

//Now if we run this program, then the exception shows: java.io.FileNotFoundException: f:\abc.txt (The system cannot find the file specified)
//So, at runtime error occurs.
*/

/* 
//another Example of compile time exception and its handling
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//here I'm importing a driver class of sql
		Class.forName("com.mysql.jdbc.Driver");	//Unhandled exception type ClassNotFoundException
	 
	//it means, compiler tells in future ClassNotFoundException may occur. Handle the exception with try-catch or throw or throws
	//program is not compiled till now because of this exception, It does not mean this exception occurs at compile time. abhi tak to compile hi nehi hui
	//here just compiler checks that which exception might occur, programmer has reported it or not that is handled it or not.
		//So, these kind of exceptions which is checked by compiler at compile time is called compile time exception
	}

}

*/

/*
//handling the checked exception using try-catch - we have reported ClassNotFoundException using try-catch. 
//now no compile time error - program will be successfully compiled
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//here I'm importing a driver class of sql
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//Now if we run this program, then the exception shows: java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
//So, at runtime error occurs.
*/


//Example of runtime exception and its handling
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100, b = 0, c;
		c = a / b;
		System.out.println(c);
		
		//see, now compiler cannot check this exception, No compile time error.
		//compiler ignored that error 100/0 - and successfully compiles.
		//the exception is printed by default exception handler
	}
}

//Now when I run this program exception occurs: Exception in thread "main" java.lang.ArithmeticException: / by zero
//it is called runtime exception. This will be handled in next program.

//for above two exceptions FileNotFoundException and ClassNotFoundException - we have to report it - handle it with tr-catch
//But for this ArithmeticException: / by zero, we do not need to report or handle with try-catch