package sp113_throw_Keyword;

import java.util.Scanner;

//creating checked exception
//class YoungerAgeException extends Exception

/*
//creating customized exception class - here programmer manually creates an exception object.
//creating unchecked exception
class YoungerAgeException extends RuntimeException
{
	//constructor
	YoungerAgeException(String msg)
	{
		//this msg will be availble to default exception handler
		super(msg);
	}
}
class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		
		if(age < 18)
			throw new YoungerAgeException("You are not eligible to vote");  //programmer manually prints an exception object to jvm.
		//this exception is not predefined exception, so object created by programmer
		//for customized exception, throw keyword is used.
		else
			System.out.println("You can vote");
		
		System.out.println("check"); //checking abnormal termination happened or not
	}

}
*/

/*

Enter your age: 
19
You can vote
check


Enter your age: 
16
Exception in thread "main" l113_throw_Keyword.YoungerAgeException: You are not eligible to vote
	at l113_throw_Keyword.Voting.main(Voting.java:30)

This exception is printed by default exception handler.
*/


//-----------------------------------------


//Handling the exception by try-catch

/*
class YoungerAgeException extends RuntimeException
{
	//constructor
	YoungerAgeException(String msg)
	{
		//this msg will be availble to default exception handler
		super(msg);
	}
}
class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		
		try
		{
			if(age < 18)
			{
				throw new YoungerAgeException("You are not eligible to vote");  //programmer manually prints an exception object to jvm.
				//this exception is not predefined exception, so object created by programmer
				//for customized exception, throw keyword is used.
			}
		else
			{
				System.out.println("You can vote");
			}
		}
		//catch(Exception e)
		catch(YoungerAgeException yae)	//we can use both type of exception class
		{
			//e.printStackTrace();
			yae.printStackTrace();
		}
		System.out.println("check"); //checking abnormal termination happened or not
	}

}
*/


/*
Enter your age: 
16
l113_throw_Keyword.YoungerAgeException: You are not eligible to vote
check
	at l113_throw_Keyword.Voting.main(Voting.java:86)


Enter your age: 
15
l113_throw_Keyword.YoungerAgeException: You are not eligible to vote
check
	at l113_throw_Keyword.Voting.main(Voting.java:86)


*/

class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		
		super(msg);
	}
}
class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		
		try
		{
			if(age < 18)
			{
				//we should not write any statement after throw keyword. It will give unreachable code.
				throw new YoungerAgeException("You are not eligible to vote");
				//System.out.println("hello hi bye bye"); //error: Unreachable code
			}
		else
			{
				System.out.println("You can vote");
			}
		}

		catch(YoungerAgeException yae)	
		{
			yae.printStackTrace();
		}
		System.out.println("check"); 
	}

}

